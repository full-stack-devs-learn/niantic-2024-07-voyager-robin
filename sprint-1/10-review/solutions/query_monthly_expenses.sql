USE household_budget;

-- Query the household_budget database for a report of monthly expenses by category


-- Use these variables to set the desired month and year for the query;

SET @query_year  = 2024;
SET @query_month = 'August';

/* -----------------------------------------------------------
	Use the following block of code to generate a monthly
    report based on expense category
----------------------------------------------------------- */

SELECT  categories.category_name AS 'Category',
		SUM(expense_amount) AS 'Total Expenses'
FROM expenses
INNER JOIN subcategories
ON expenses.subcategory_id = subcategories.subcategory_id
INNER JOIN categories
ON categories.category_id = subcategories.category_id
WHERE MONTHNAME(expense_date) = @query_month
AND YEAR(expense_date) = @query_year
GROUP BY categories.category_id, expense_id
;

/* -----------------------------------------------------------
	Use the following block of code to generate a monthly
    report based on expense subcategory
----------------------------------------------------------- */

SELECT  subcategories.subcategory_name AS 'Subcategory',
		SUM(expense_amount) AS 'Total Expenses'
FROM expenses
INNER JOIN subcategories
ON expenses.subcategory_id = subcategories.subcategory_id
INNER JOIN categories
ON categories.category_id = subcategories.category_id
WHERE MONTHNAME(expense_date) = @query_month
AND YEAR(expense_date) = @query_year
GROUP BY categories.category_id, subcategories.subcategory_id
;

