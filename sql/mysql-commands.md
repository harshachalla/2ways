# Learn MySQL

#### Import Database Sample

```bash
mysql -uroot -p < employees.sql
```
###SQL stands for Structured Query Language
# An RDBMS database program (i.e. MS Access, SQL Server, MySQL)
#RDBMS stands for Relational Database Management System.
#The data in RDBMS is stored in database objects called tables. A table is a collection of related data entries and it consists of columns and rows.
#to see tables in your database

'''bash
SELECT * FROM Customers;
'''
##Some of The Most Important SQL Commands
'''bash
--->SELECT - extracts data from a database
--->UPDATE - updates data in a database
--->DELETE - deletes data from a database
--->INSERT INTO - inserts new data into a database
--->CREATE DATABASE - creates a new database
--->ALTER DATABASE - modifies a database
--->CREATE TABLE - creates a new table
--->ALTER TABLE - modifies a table
--->DROP TABLE - deletes a table
--->CREATE INDEX - creates an index (search key)
--->DROP INDEX - deletes an index
'''

#SELECT Statement
The SELECT statement is used to select data from a database.

#syntax
'''
SELECT column1, column2, ...
FROM table_name;
'''

# If you want to select all the fields available in the table, use the following syntax:
'''
SELECT * FROM table_name;
'''
#for customer selection
'''
SELECT * FROM Customers;
'''
 #SQL SELECT DISTINCT Statement
 #syntax
 "
 SELECT DISTINCT column1, column2, ...
 FROM table_name;
 "
 