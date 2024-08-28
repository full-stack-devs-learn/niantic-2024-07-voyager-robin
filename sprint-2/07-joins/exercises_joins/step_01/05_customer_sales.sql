-- 5. The order details table includes the line item for each sale.
-- the Line Total is the SalesPrice * Quantity - Discount%.

-- I want a customer sales report
-- include customer names (compay_name), and their total sales amount (after discount)
-- sorted by sales total highest to lowest

-- The first 3 rows should be
-- CompanyName			SalesTotal
-- QUICK-Stop			110277.31
-- Ernst Handel			104874.98
-- Save-a-lot Markets	104361.95

-- (89 rows)

USE northwind;

SELECT company_name
	 , SUM((unit_price * quantity) - (discount * unit_price * quantity)) AS sales_total
FROM order_details AS deets
INNER JOIN orders AS ords
ON deets.order_id = ords.order_id
INNER JOIN customers AS cust
ON cust.customer_id = ords.customer_id
GROUP BY company_name
ORDER BY sales_total DESC
;