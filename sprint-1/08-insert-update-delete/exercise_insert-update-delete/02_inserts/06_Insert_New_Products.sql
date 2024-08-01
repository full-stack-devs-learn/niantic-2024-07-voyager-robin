USE northwind;

-- Insert 10 new products into the new Sporting Goods Category
-- You can leave the Supplier Id empty for now, but you need to include
-- the product name, category, price, units in stock (20), units on order (0)
-- and re-order level (10) for each product.

-- Sporting Goods category id is 9!

INSERT INTO products
(
	  product_name
	, category_id
    , unit_price
    , units_in_stock
    , units_on_order
    , reorder_level
)
VALUES
(
	  'Tent'
	, '9'
    , 99.00
    , 20
    , 0
    , 10
), 
(
	  'First Aid Kit'
	, '9'
    , 35.00
    , 20
    , 0
    , 10
), 
(
	  'Hiking Boots'
	, '9'
    , 175.00
    , 20
    , 0
    , 10
), 
(
	  'Kayak'
	, '9'
    , 350.00
    , 20
    , 0
    , 10
), 
(
	  'Baseball'
	, '9'
    , 5.00
    , 20
    , 0
    , 10
), 
(
	  'Baseball Bat'
	, '9'
    , 25.00
    , 20
    , 0
    , 10
), 
(
	  'Tennis Racket'
	, '9'
    , 65.00
    , 20
    , 0
    , 10
), 
(
	  'Swimsuit'
	, '9'
    , 45.00
    , 20
    , 0
    , 10
), 
(
	  'Kayak'
	, '9'
    , 350.00
    , 20
    , 0
    , 10
), 
(
	  'Flare Gun'
	, '9'
    , 85.00
    , 20
    , 0
    , 10
);
