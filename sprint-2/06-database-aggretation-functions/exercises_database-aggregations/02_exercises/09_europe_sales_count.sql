-- 09. The total count of orders in Europe
-- Germany, Switzerland, France, Portugal, Finland, Poland, Ireland, Sweden, UK
-- (Use the customer_orders view)

-- (1 row) - 371 orders

SELECT COUNT(DISTINCT order_id) AS '# of Orders'
FROM customer_orders
WHERE country LIKE 'Germany'  OR country LIKE 'Switzerland' OR country LIKE 'France'
   OR country LIKE 'Portugal' OR country LIKE 'Finland'     OR country LIKE 'Poland'
   OR country LIKE 'Ireland'  OR country LIKE 'Sweden'      OR country LIKE 'UK';



