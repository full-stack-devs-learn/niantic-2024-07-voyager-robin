-- 8. Display the Category Name, and film title of all films
-- in the "Comedy" category

-- (58 rows)

USE sakila;

SELECT category.name
	 , film.title
FROM category
INNER JOIN film_category
ON category.category_id = film_category.category_id
INNER JOIN film
ON film.film_id = film_category.film_id
WHERE category.name LIKE 'Comedy'
;
