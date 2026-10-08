# LoginMVCThymeleaf

A simple **Spring Boot MVC Login and Registration application** built using **Thymeleaf, Spring Data JPA, Hibernate, and MySQL**.

## About

This project demonstrates a basic user authentication flow using Spring MVC. Users can create an account, log in using their email and password, and view a personalized welcome page after successful login.

## Features

- User Registration
- Unique Username and Email validation
- User Login using Email and Password
- Login error handling
- MySQL database integration
- Spring Data JPA
- Thymeleaf-based UI
- Responsive and clean user interface
- Personalized Welcome page

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Thymeleaf
- MySQL
- HTML
- CSS
- Maven

## Project Structure

```text
LoginMVCThymeleaf
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── in.ashokit
│   │   │       ├── controller
│   │   │       ├── entity
│   │   │       ├── repository
│   │   │       └── service
│   │   │
│   │   └── resources
│   │       ├── templates
│   │       │   ├── index.html
│   │       │   ├── login.html
│   │       │   ├── register.html
│   │       │   ├── success.html
│   │       │   └── welcome.html
│   │       │
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
└── README.md
