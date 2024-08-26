-- 8. The smallest line item amount made in Europe
-- (Use the customer_orders view)

-- (1 row) $4.80
SELECT MIN(sales_price * quantity) AS 'Line Item Amount'
FROM customer_orders
WHERE country LIKE 'Germany'  OR country LIKE 'Switzerland' OR country LIKE 'France'
   OR country LIKE 'Portugal' OR country LIKE 'Finland'     OR country LIKE 'Poland'
   OR country LIKE 'Ireland'  OR country LIKE 'Sweden'      OR country LIKE 'UK';



