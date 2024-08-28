-- 9. Most Popular Film Categories
-- Return the total number of actors
-- who have acted in a category
-- sort most popular category to least

-- Columns: category_name, actor_count
--
-- (16 rows)



USE sakila;

SELECT category.name
	 , SUM(DISTINCT actor_id) AS total_actors
FROM category
INNER JOIN film_category
ON category.category_id = film_category.category_id
INNER JOIN film_actor
ON film_category.film_id = film_actor.film_id
GROUP BY category.category_id
ORDER BY total_actors DESC
;