-- 15. number of orders placed in each state in the US
-- sort by highest order count to lowest
-- (Use the customer_orders View)

-- hint: only count each order_id once

-- ID   31
-- OR   28
-- WA   19
-- NM   18
-- AK   10
-- WY   9
-- CA   9
-- MT   3

-- (8 row)

SELECT DISTINCT region
	 , COUNT(DISTINCT order_id)
FROM customer_orders
WHERE country LIKE 'USA'
GROUP BY region
ORDER BY COUNT(DISTINCT order_id) DESC;



