use northwind;

-- The name, city and state of 
-- all customers in Oregon (OR)
-- Expected: 4 rows

SELECT company_name
	, city
    , region as state
FROM customers
WHERE region = 'OR';

