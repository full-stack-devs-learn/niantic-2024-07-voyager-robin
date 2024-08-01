USE northwind;

-- delete one of your new sporting goods products
-- from the database
-- choose one that has not been purchased 

-- Category id is 9!

DELETE FROM products
WHERE product_id = 85;

-- NOTE 7/31: I am not running this script yet, as the next question uses the same
-- category and I want to make sure this won't mess anything up before running.
