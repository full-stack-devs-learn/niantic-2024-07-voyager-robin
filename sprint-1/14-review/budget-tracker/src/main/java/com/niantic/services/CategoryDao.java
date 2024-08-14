package com.niantic.services;

import com.niantic.models.Category;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;

public class CategoryDao
{
    private final JdbcTemplate jdbcTemplate;

    public CategoryDao()
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

    // Define a method to get an arrayList of categories
    public ArrayList<Category> getAllCategories()
    {
        // Declare the empty arrayList:
        ArrayList<Category> categories = new ArrayList<>();

        // Define and execute the SQL query:
        String sql = """
                        SELECT category_id, category_name, description
                        FROM categories
                        """;

        SqlRowSet row = jdbcTemplate.queryForRowSet(sql);

        // Create a category from each row,
        // add it to the arrayList, and return:
        while(row.next())
        {
            int categoryId = row.getInt("category_id");
            String categoryName = row.getString("category_name");
            String description = row.getString("description");

            Category category = new Category(categoryId, categoryName, description);

            categories.add(category);
        }

        return categories;
    }

    // Get a category by ID:
    public Category getCategoryById(int queryId)
    {
        // Declare a category object to hold the output
        Category outputCategory = new Category();

        // declare and execute the SQL query:
        String sql = """
                        SELECT category_id, category_name, description
                        FROM categories
                        WHERE category_id = ?;
                        """;

        SqlRowSet row = jdbcTemplate.queryForRowSet(sql, queryId);

        // Declare a category from the row,
        // and add it to the output category object
            outputCategory = new Category(row.getInt("category_id"),
                    row.getString("category_name"),
                    row.getString("description"));

        // return the category
        return outputCategory;
    }

    // Define a method to insert into the
    // categories table:
    public void addCategory(Category category)
    {
        //Declare variables to hold the category's values
        int outputId                     = category.getCategoryId();
        String outputCategoryName        = category.getCategoryName();
        String outputCategoryDescription = category.getCategoryDescription();


        // declare and execute the SQL query:
        String sql = """
                        INSERT INTO categories
                        (category_id, category_name, description)
                        VALUES (?, ?, ?);
                        """;

        var row = jdbcTemplate.update(sql,
                outputId, outputCategoryName, outputCategoryDescription);
    }

    // Define a method to update
    // entries in the categories table:
    public void updateCategory(Category category)
    {
        //Declare variables to hold the category's values
        int queryCategoryId              = category.getCategoryId();
        String outputCategoryName        = category.getCategoryName();
        String outputCategoryDescription = category.getCategoryDescription();


        // declare and execute the SQL query:
        String sql = """
                        UPDATE categories
                        SET category_name = ?, 
                            description = ?
                        WHERE category_id = ?;
                        """;

        var row = jdbcTemplate.update(sql,
                outputCategoryName,
                outputCategoryDescription,
                queryCategoryId);
    }

    // Define a method to remove entries
    // from the categories database:
    public void deleteCategory(int categoryId)
    {
        // declare and execute the SQL query:
        String sql = """
                        DELETE FROM categories
                        WHERE category_id = ?;
                        """;

        var row = jdbcTemplate.update(sql,
                categoryId);
    }
}
