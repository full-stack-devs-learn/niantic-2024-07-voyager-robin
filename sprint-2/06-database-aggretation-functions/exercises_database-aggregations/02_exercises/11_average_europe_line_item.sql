-- 11. The average sales amount for all sales in Europe
-- (Use the customer_orders view)

-- (1 row) approx $605.99

SELECT AVG(sales_price * quantity) AS 'AVG Sales'
FROM customer_orders
WHERE country LIKE 'Germany'  OR country LIKE 'Switzerland' OR country LIKE 'France'
   OR country LIKE 'Portugal' OR country LIKE 'Finland'     OR country LIKE 'Poland'
   OR country LIKE 'Ireland'  OR country LIKE 'Sweden'      OR country LIKE 'UK';


