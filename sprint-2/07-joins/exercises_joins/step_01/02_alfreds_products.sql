-- 2. The name of all products that
-- have been ordered by Alfreds Futterkiste
-- Include each product only once
-- (11 rows)

USE Northwind;

-- Customer ID is ALFKI

SELECT DISTINCT prod.product_name
FROM products AS prod
INNER JOIN order_details AS ord_det
ON prod.product_id = ord_det.product_id
INNER JOIN orders AS ords
ON ord_det.order_id = ords.order_id
INNER JOIN customers AS cust
ON ords.customer_id = cust.customer_id
WHERE cust.customer_id = 'ALFKI'
;