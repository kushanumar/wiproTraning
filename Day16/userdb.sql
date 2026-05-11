CREATE DATABASE userdb;
USE userdb;

CREATE TABLE Employees (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);

INSERT INTO Employees 
VALUES 
(1, 'Alice', 30), 
(2, 'Bob', 25);
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50)
);

INSERT INTO students(name,email)
VALUES ('Rahul','rahul@gmail.com');

INSERT INTO students(name,email)
VALUES ('Amit','amit@gmail.com');