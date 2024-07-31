USE northwind;

-- The Product name, price and category id
-- of all dairy products

-- Expected: 10 rows

-- category id for dairy products is 4!
SELECT product_name
	, unit_price
    , category_id
FROM products
WHERE category_id = 4;
