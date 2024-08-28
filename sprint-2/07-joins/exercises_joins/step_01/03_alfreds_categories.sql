-- 3.  List of all the categories 
-- that Alfreds Futterkiste has ever ordered
-- (5 rows)

USE Northwind;

-- Customer ID is ALFKI

SELECT DISTINCT ords.customer_id,
				cats.category_name
FROM categories AS cats
INNER JOIN products AS prod
ON cats.category_id = prod.category_id
INNER JOIN order_details AS deets
ON  prod.product_id = deets.product_id
INNER JOIN orders AS ords
ON deets.order_id = ords.order_id
WHERE ords.customer_id = 'ALFKI';