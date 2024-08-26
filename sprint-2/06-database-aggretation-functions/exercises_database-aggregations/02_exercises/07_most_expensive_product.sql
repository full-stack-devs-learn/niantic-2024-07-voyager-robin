-- 7. Select the price of the most expensive product

-- (1 row)

SELECT *
FROM products
ORDER BY unit_price DESC
LIMIT 1;
