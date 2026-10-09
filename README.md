Todo Management System

A full-stack Todo Management System built using **Java, Spring Boot, MySQL, HTML, CSS, and JavaScript**. The application allows users to register, log in, and 
manage their todo tasks through a web interface.

Features

* User Registration: Register a new user account.
* User Login: Authenticate users and receive a JWT token.
* JWT Authentication: Secure protected API endpoints using JSON Web Tokens.
* Create Todos: Add new todo tasks.
* View Todos: Retrieve and display todo tasks.
* Update Task Status: Track task completion.
* Database Integration: Store application data using MySQL.
* REST API: Connect the frontend with the Spring Boot backend.

Tech Stack
Backend

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* MySQL
* JWT Authentication
* Maven

Frontend

* HTML
* CSS
* JavaScript
* Fetch API

Tools

* IntelliJ IDEA
* Visual Studio Code
* Git and GitHub
* Postman

Project Structure

TodoManagementSystem/
├── TodoBackend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   └── resources/
│   │   └── test/
│   ├── pom.xml
│   └── mvnw
├── TodoFrontend/
│   ├── login.html
│   ├── register.html
│   ├── todos.html
│   ├── script.js
│   └── style.css
└── README.md

Prerequisites

Install the following before running the project:

* Java Development Kit (JDK)
* Maven
* MySQL Server
* A modern web browser

Setup and Installation

1. Clone the Repository

git clone https://github.com/THAMIZHMATHY/todo-management-system.git
cd todo-management-system

2. Configure MySQL

Create a database in MySQL and update the database connection settings in:

TodoBackend/src/main/resources/application.properties

Configure the database URL, username, and password for your local environment. Keep credentials and JWT secrets private.

3. Run the Backend

Open a terminal inside the TodoBackend folder and execute:

mvn spring-boot:run

Wait until the Spring Boot application starts successfully.

4. Run the Frontend

Open the TodoFrontend folder in Visual Studio Code and launch login.html using a local development server, such as the Live Server extension.

Make sure the backend URL configured in script.js matches the address and port where your Spring Boot application is running.

API Overview

| Method | Purpose           |
| ------ | ----------------- |
| POST   | User registration |
| POST   | User login        |
| GET    | Retrieve todos    |
| POST   | Create a todo     |

The exact endpoints and request formats are defined in the backend source code.

Learning Outcomes

* Building REST APIs using Spring Boot.
* Integrating a Java application with MySQL.
* Implementing JWT-based authentication.
* Connecting a frontend to backend APIs using JavaScript Fetch.
* Organizing a full-stack project and managing source code with Git.

---

*This project was developed for learning and practicing full-stack web application development.*
