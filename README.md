# Book Management System using MySQL and Java

This project is a book management system developed using Java and MySQL. It allows users to search, view books from a MySQL database.

## Requirements

To run this project, I use the following:

- VS code(JAVA)
- MySQL Server
- MySQL Connector/J JDBC driver

## Installation

1. Clone this repository or download the zip file.
2. Install MySQL Server and create a new database.
3. Execute the SQL script `create_database.sql` to create the necessary tables.
4. Update the `DB_URL`, `DB_USER`, and `DB_PASSWORD` constants in the `DBConnection.java` file with your MySQL database information.
5. Add the MySQL Connector/J JAR file to your project's classpath.
6. Compile and run the `Main.java` file.

## Usage

When the program starts, you will see a menu with the following options(for User Interface):

1. View all books
2. Search a Particular book
3. Exit

When the program starts, you will see a menu with the following options(for Admin Interface):
1. View all books
2. Add a new book
3. Update a book
4. Delete a book
5. Exit

Select an option by entering the corresponding number and pressing enter. Follow the prompts to perform the desired action.

## Database Schema

The database schema for this project consists of a single table named `books`. The table has the following columns:

- `book_id` INT NOT NULL AUTO_INCREMENT
- `book_name` VARCHAR(100) NOT NULL
- `book_publisher` VARCHAR(50) NOT NULL
- `book_edition` VARCHAR(50) NOT NULL
- `book_genre` VARCHAR(50) NOT NULL
- `book_price` INT NOT NULL
- `authors` VARCHAR(100) NOT NULL
- `book_pages` INT NOT NULL
