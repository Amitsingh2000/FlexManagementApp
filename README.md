Flex Management System

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
git clone https://github.com/your_username/flex-management-system.git

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

Screenshots
Login Page
![image](https://user-images.githubusercontent.com/96221336/232319439-c56f2331-b3e0-4838-869f-9bece4ea5029.png)

Employee Dashboard
![image](https://user-images.githubusercontent.com/96221336/232319516-13c02778-ce46-47a6-a6b5-8aacd7f6e851.png)

Admin Panel
![image](https://user-images.githubusercontent.com/96221336/232319549-52b07988-5cdc-4eee-acfc-03c83ee14141.png)

License
This project is licensed under the MIT License - see the LICENSE.md file for details.




