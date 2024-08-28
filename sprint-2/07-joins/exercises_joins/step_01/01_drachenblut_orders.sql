-- 1. The Company Name, Order Id, Order Date and Shipped Date
-- for all orders that were placed by Drachenblut Delikatessen. 
-- Order the results by shipped date, newest to oldest.
-- (6 rows)

USE northwind;

SELECT customers.company_name
	 , orders.order_id
     , orders.order_date
     , orders.shipped_date
FROM orders
INNER JOIN customers 
ON orders.customer_id = customers.customer_id
WHERE customers.customer_id LIKE 'DRACD'
ORDER BY orders.shipped_date DESC
;