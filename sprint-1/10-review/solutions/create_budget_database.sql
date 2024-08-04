-- Create a database to manage household finances


DROP DATABASE IF EXISTS household_budget;

CREATE DATABASE household_budget;

USE household_budget;

CREATE TABLE people
(
	person_id INT NOT NULL AUTO_INCREMENT,
	person_name VARCHAR(25),
	PRIMARY KEY (person_id)
);

CREATE TABLE vendors
(
	vendor_id INT NOT NULL AUTO_INCREMENT,
	vendor_name VARCHAR(25),
    vendor_description TINYTEXT,
    PRIMARY KEY (vendor_id)
);

CREATE TABLE categories
(
	category_id INT NOT NULL AUTO_INCREMENT,
    category_name VARCHAR(25),
    category_description TINYTEXT,
    PRIMARY KEY (category_id)
);

CREATE TABLE subcategories
(
	subcategory_id INT NOT NULL AUTO_INCREMENT,
    category_id INT NOT NULL,
    subcategory_name VARCHAR (25),
	subcategory_description TINYTEXT,
	PRIMARY KEY (subcategory_id),
    FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

CREATE TABLE expenses
(
	expense_id INT NOT NULL AUTO_INCREMENT,
	subcategory_id INT NOT NULL,
    vendor_id INT NOT NULL,
    person_id INT NOT NULL,
    expense_date DATETIME,
	expense_amount DECIMAL(10, 2),
    expense_notes TINYTEXT,
    PRIMARY KEY (expense_id),
    FOREIGN KEY (subcategory_id) REFERENCES subcategories(subcategory_id),
    FOREIGN KEY (vendor_id) REFERENCES vendors(vendor_id),
    FOREIGN KEY (person_id) REFERENCES people(person_id)
);
