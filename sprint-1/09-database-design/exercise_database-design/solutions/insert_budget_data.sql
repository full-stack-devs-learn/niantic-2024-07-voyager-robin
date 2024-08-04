USE household_budget;

-- Create a script to insert budget data into the household_budget database

SET @person_name = 'Robin';
SET @subcategory_name = 'Rent';
SET @subcategory_description = 'Payments to landlord';
SET @category_name = 'Housing';
SET @category_description = 'Expenses related to housing';
SET @expense_date = CURRENT_DATE();
SET @expense_amount = 1250.00;
SET @expense_note = 'Subsidizing my landlord''s lifestyle';
SET @vendor_name = 'Landlord, INC';
SET @vendor_description = 'My landlord';

/*--------------------------------------------------------------

Use the following blocks to create a person, vendor, category,
or subcategory.

--------------------------------------------------------------*/

-- Insert a person
INSERT INTO people
(person_name)
VALUES 
(@person_name);

-- Use the name of the person to assign the correct ID to a variable:

SELECT @person_id := person_id
FROM people
WHERE person_name = @person_name;

-- Insert a vendor
INSERT INTO vendors
(vendor_name, vendor_description)
VALUES
(@vendor_name, @vendor_description);

-- Use the name of the vendor to assign the correct ID to a variable:

SELECT @vendor_id := vendor_id
FROM vendors
WHERE vendor_name = @vendor_name;

-- Insert a category
INSERT INTO categories
(category_name, category_description)
VALUES
(@category_name, @category_description);

-- Use the name of the category to assign the correct ID to a variable:

SELECT @category_id := category_id
FROM categories
WHERE category_name = @category_name;

-- Insert a subcategory
INSERT INTO subcategories
(subcategory_name, subcategory_description, category_id)
VALUES
(@subcategory_name, @subcategory_description, @category_id);

-- Use the name of the subcategory to assign the correct ID to a variable:

SELECT @subcategory_id := subcategory_id
FROM subcategories
WHERE subcategory_name = @subcategory_name;

/*--------------------------------------------------------------

Use the following block to create a new expense.

--------------------------------------------------------------*/

-- Use the name of the person to assign the correct ID to a variable:

SELECT @person_id := person_id
FROM people
WHERE person_name = @person_name;

-- Use the name of the vendor to assign the correct ID to a variable:

SELECT @vendor_id := vendor_id
FROM vendors
WHERE vendor_name = @vendor_name;

-- Use the name of the category to assign the correct ID to a variable:

SELECT @category_id := category_id
FROM categories
WHERE category_name = @category_name;

-- Use the name of the subcategory to assign the correct ID to a variable:

SELECT @subcategory_id := subcategory_id
FROM subcategories
WHERE subcategory_name = @subcategory_name;

-- Insert an expense
INSERT INTO expenses
(
person_id, 
expense_date, 
expense_amount, 
expense_notes, 
subcategory_id,
vendor_id
)
VALUES
(
@person_id, 
@expense_date, 
@expense_amount, 
@expense_note, 
@subcategory_id,
@vendor_id
);