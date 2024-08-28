-- 10. Count of films in each category
-- that GRACE MOSTEL has appeared in as an actress

-- include first_name, last_name, category_name, film_count

-- (11 rows)

USE sakila;

SELECT CONCAT(actor.first_name, ' ', actor.last_name) AS full_name
	 , category.name AS category_name
	 , SUM(DISTINCT film_actor.film_id) AS film_count
FROM category
INNER JOIN film_category
ON category.category_id = film_category.category_id
INNER JOIN film_actor
ON film_category.film_id = film_actor.film_id
INNER JOIN actor
ON actor.actor_id = film_actor.actor_id
WHERE CONCAT(actor.first_name, ' ', actor.last_name) LIKE 'GRACE MOSTEL'
GROUP BY category.category_id, full_name
ORDER BY film_count DESC
;