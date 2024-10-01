CREATE DATABASE oop_project;

USE oop_project;

CREATE TABLE Product (
    productID INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(50),
    price DECIMAL(10, 2) NOT NULL,
    quantity INT NOT NULL
);

CREATE TABLE User (
    userID INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    role ENUM(‘admin’, ‘seller’, ‘buyer’) NOT NULL,
    contactInfo VARCHAR(100)
);
