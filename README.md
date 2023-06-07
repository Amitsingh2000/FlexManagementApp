# Flex Management System

This is a web application developed using Spring Boot, Spring Data, and Spring Security to manage customers and employee details. It has a user-friendly interface for customers to manage their account details and an admin panel for employees to manage customer accounts, employee details, location details, and mounter details.

Technologies Used
Java 1.8
Spring Boot
Spring Data
Spring Security
MySQL
HTML
CSS
JavaScript

Features
Secure authentication and authorization features to ensure the privacy of customer and employee details
User-friendly interface for customers to manage their account details
Admin panel for employees to manage customer accounts, employee details, location details, and mounter details
Simplified setup and configuration using Spring Boot, Spring Data, and Spring Security
Getting Started
Prerequisites
Java 11
MySQL

------------Installation----------------

Clone the repository:
git clone - gh repo clone Amitsingh2000/FlexManagementApp

Create a MySQL database and update the application.properties file:
spring.datasource.url=jdbc:mysql://localhost:3306/db_name
spring.datasource.username=db_username
spring.datasource.password=db_password

Build the project:
cd flex-management-system
mvnw clean package

Run the project:
java -jar target/flex-management-system-0.0.1-SNAPSHOT.jar

Access the application:
http://localhost:8080/

Login Details 
 Admin Dashboard - UserName Admin Password - admin
 Employee Dashboard - UserName User Password - user

Screenshots
Login Page
![Login_Page](https://user-images.githubusercontent.com/96221336/232455423-793ae2f3-4d6d-4b1c-816d-5a2f67d446fe.png)


Employee Dashboard
![Employee_Dashboard](https://user-images.githubusercontent.com/96221336/232455294-3d6a06cc-cf3d-4218-91bb-7a255fbfdb63.png)

Admin Panel
![Admin_Dashboard](https://user-images.githubusercontent.com/96221336/232455487-da809f61-d6d9-49e0-b797-fc41b9dcdfa8.png)






