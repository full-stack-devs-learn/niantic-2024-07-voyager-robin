-- 7. List the names of all actors who acted in
-- the film "HUMAN GRAFFITI"

-- (4 rows)

-- film ID is 438

USE sakila;

SELECT CONCAT(actor.first_name, ' ', actor.last_name) AS actor
FROM film_actor
INNER JOIN actor
ON film_actor.actor_id = actor.actor_id
INNER JOIN film
ON film.film_id = film_actor.film_id
WHERE film.title LIKE 'HUMAN GRAFFITI'
;