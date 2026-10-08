# LoginMVCThymeleaf

A simple **Spring Boot MVC Login and Registration application** built
using **Thymeleaf, Spring Data JPA, Hibernate, and MySQL**.

## Features

-   User registration
-   Unique username and email validation
-   Login using email and password
-   Login error handling
-   MySQL database integration
-   Spring Data JPA and Hibernate
-   Thymeleaf-based UI
-   Responsive and clean design
-   Personalized welcome page

## Technologies

-   Java
-   Spring Boot
-   Spring MVC
-   Spring Data JPA
-   Hibernate
-   Thymeleaf
-   MySQL
-   HTML5
-   CSS3
-   Maven

## Project Structure

``` text
LoginMVCThymeleaf
├── src
│   ├── main
│   │   ├── java/in/ashokit
│   │   │   ├── controller/LoginController.java
│   │   │   ├── entity/User.java
│   │   │   ├── repository/UserRepository.java
│   │   │   └── service/LoginService.java
│   │   └── resources
│   │       ├── templates
│   │       │   ├── index.html
│   │       │   ├── login.html
│   │       │   ├── register.html
│   │       │   ├── success.html
│   │       │   └── welcome.html
│   │       └── application.properties
│   └── test
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Application Flow

``` text
Home
 ├── Register
 │    ├── Valid details → Success Page
 │    └── Existing username/email → Register Page with message
 │
 └── Login
      ├── Valid email/password → Welcome Page
      └── Invalid email/password → Login Page with error
```

## Database

The application uses MySQL and stores users in the `users` table.

  Column       Description
  ------------ -----------------
  `id`         Primary key
  `username`   Unique username
  `email`      Unique email
  `password`   User password

Username and email are unique. Passwords are **not unique**, so
different users can use the same password.

## Configuration

Update `src/main/resources/application.properties` with your own MySQL
details:

``` properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

**Do not commit real database passwords or other sensitive credentials
to a public repository.**

## How to Run

### 1. Clone the repository

``` bash
git clone https://github.com/Shayanarshi/LoginMVCThymeleaf.git
```

### 2. Create the database

``` sql
CREATE DATABASE loginmvc;
```

### 3. Configure MySQL

Update `application.properties` with your database name, username, and
password.

### 4. Run the application

Run:

``` text
LoginMvcThymeleafApplication.java
```

Or use Maven:

``` bash
./mvnw spring-boot:run
```

On Windows:

``` bash
mvnw.cmd spring-boot:run
```

### 5. Open in browser

``` text
http://localhost:8080/
```

## Architecture

``` text
Browser
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
MySQL Database
```

## Future Improvements

-   Spring Security
-   BCrypt password encryption
-   Session-based authentication
-   Logout functionality
-   Form validation
-   Forgot password
-   Email verification
-   Role-based authentication
-   Improved exception handling

## Author

**Shayan Arshi**

Java Full Stack Developer

**Technologies:** Java · Spring Boot · Spring MVC · Thymeleaf · JPA ·
MySQL

## Repository

https://github.com/Shayanarshi/LoginMVCThymeleaf
