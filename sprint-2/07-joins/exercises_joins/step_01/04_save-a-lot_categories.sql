-- 4. I want to know what category is the most popular
-- category for my best customer.

-- SELECT the Company Name, Category, and the OrderCount
-- for Save-a-lot Markets. (my best customer)
-- (the order count specifies how many times a category
-- was included in their orders)

-- sort in the order of the most ordered category to the least

-- (8 rows)

USE northwind;

SELECT DISTINCT cust.company_name
	 , cats.category_name
     , COUNT(ords.order_id)
FROM categories AS cats
INNER JOIN products AS prods
ON cats.category_id = prods.category_id
INNER JOIN order_details AS deets
ON prods.product_id = deets.product_id
INNER JOIN orders AS ords 
ON deets.order_id = ords.order_id
INNER JOIN customers AS cust
ON ords.customer_id = cust.customer_id
WHERE cust.company_name = 'Save-a-lot Markets'
GROUP BY cust.company_name, cats.category_name
ORDER BY COUNT(ords.order_id) DESC
;
