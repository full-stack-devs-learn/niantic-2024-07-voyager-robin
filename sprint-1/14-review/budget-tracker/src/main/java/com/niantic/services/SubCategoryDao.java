package com.niantic.services;

import com.niantic.models.Category;
import com.niantic.models.SubCategory;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;

public class SubCategoryDao
{
    // Declare the database communication:
    private final JdbcTemplate jdbcTemplate;

    // Declare constructor:
    public SubCategoryDao()
    {
        String databaseUrl = "jdbc:mysql://localhost:3306/northwind";
        String userName = "root";
        String password = "P@ssw0rd";
        DataSource dataSource = new BasicDataSource(){{
            setUrl(databaseUrl);
            setUsername(userName);
            setPassword(password);
        }};

        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    // Define a method to get an arrayList of subcategories by category:
    public ArrayList<SubCategory> getSubCategoriesByCategory(int queryCategoryId)
    {
        // Declare the empty arrayList:
        ArrayList<SubCategory> output = new ArrayList<>();

        // Define and execute the SQL query:
        String sql = """
                        SELECT sub_category_id, sub_category_name, description
                        FROM sub_categories
                        WHERE category_id = ?;
                        """;

        SqlRowSet row = jdbcTemplate.queryForRowSet(sql, queryCategoryId);

        // Create a subcategory from each row,
        // add it to the arrayList, and return:
        while(row.next())
        {
            int subCategoryId      = row.getInt("sub_category_id");
            String subCategoryName = row.getString("sub_category_name");
            String description     = row.getString("description");

            SubCategory subCategory = new SubCategory(subCategoryId, queryCategoryId, subCategoryName, description);

            output.add(subCategory);
        }

        return output;
    }

    // Define a method to get a subcategory by ID:
    public SubCategory getSubcategoryById(int queryId)
    {
        // Declare the empty subcategory:
        SubCategory output;

        // Define and execute the SQL query:
        String sql = """
                        SELECT sub_category_id, sub_category_name, description
                        FROM sub_categories
                        WHERE sub_category_id = ?;
                        """;

        SqlRowSet row = jdbcTemplate.queryForRowSet(sql, queryId);

        // Create a subcategory from the
        // SQL output and return:
            int subCategoryId      = row.getInt("sub_category_id");
            String subCategoryName = row.getString("sub_category_name");
            String description     = row.getString("description");

            output = new SubCategory(subCategoryId, queryId, subCategoryName, description);

        return output;
    }



    // Define a method to get a subcategory by name:


}
