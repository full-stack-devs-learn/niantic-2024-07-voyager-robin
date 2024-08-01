USE northwind;

-- You were just hired by Northwind Traders, Inc and 
-- you need to add yourself as a Sales Associate to the Employees table.
-- Inlcude your:
    -- full name
    -- job title
    -- preferred title (Mr, Mrs, etc)
    -- Birthday
    -- hire date: (today)
    -- home address
-- leave all other fields null by default

INSERT INTO employees
(
	  first_name
	, last_name
    , title
    , title_of_courtesy
    , birth_date
    , hire_date
    , address
    , city
    , region
    , postal_code
    , country
    , home_phone
    , extension
    , notes
    , reports_to
    , salary
)
VALUES
(
	  'Robin'
	, 'Wilde'
    , 'Software Engineer'
    , 'Ms.'
    , '1990-11-10 00:00:00'
    , CURRENT_DATE()
	, '430 E. Howell St. Apt. 302'
    , 'Seattle'
    , 'WA'
    , '98122'
    , 'USA'
    , NULL
    , NULL
    , ''
    , NULL
    , NULL
);
