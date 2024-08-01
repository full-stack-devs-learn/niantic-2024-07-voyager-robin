USE northwind;

-- Delete the Sporting Goods Catregory from the database.

-- Why does it fail to delete?

-- What else needs to be done to fully delete the Category?

-- Write a script that preforms all necessary steps to 
-- delete the category from the database.

-- The only user input should be a variable at the top of the 
-- script that holds the Category Name.
-- The sript should do the rest

/*
If I were to just run

DELETE FROM categories
WHERE category_name = 'Sporting Goods';

, the category wouldn't delete because there are products that exist that still
depend upon the Sporting Goods category. The individual products need to be deleted
so that the Sporting Goods category isn't a parent of anything else, using

DELETE FROM products
WHERE category_id = xx;

where xx is the category id for the Sporting Goods category.

Then the category itself can be deleted.

*/

SELECT *
FROM products
WHERE category_id = 9;

-- DELETE FROM products
-- WHERE category_id = 9;

