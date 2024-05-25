# Todo List REST API Backend

This project implements a RESTful API backend for a Todo List application using Java and Spring Boot.

This project is a robust backend implementation of a Todo List application, leveraging Java and Spring Boot technologies. With seamless integration of RESTful API architecture, users can effortlessly perform CRUD (Create, Read, Update, Delete) operations on their tasks. Powered by Java 17 and Spring Boot 3.3.0, the backend utilizes JPA for efficient data management and supports both H2 in-memory and MySQL databases for local development and testing. Designed for scalability and security, this backend solution provides a solid foundation for building modern web applications.

## Overview

The Todo List application allows users to manage their tasks efficiently. Users can perform CRUD (Create, Read, Update, Delete) operations on their todos through this RESTful API.

## Technologies Used

- **Java**: Programming language used for backend development. (Version 17)
- **Spring Boot**: Framework for creating standalone, production-grade Spring-based applications. (Version 3.3.0)
- **H2 Database**: In-memory database used for local development and testing.
- **Mysql Database**: Mysql used for final testing.
- **JPA (Java Persistence API)**: Java standard for accessing, persisting, and managing data between Java objects and a relational database.
- **RESTful API**: Architectural style for building scalable web services.
- **React**: Frontend library for building user interfaces (if integrated).

## Features

- **CRUD Operations**: Users can Create, Read, Update, and Delete todos.
- **Real-time**: Integration with a frontend application allows real-time updates on the UI.
- **Database**: Uses a local SQL database (mapped using JPA ORM), initially H2, then switched to MySQL.
- **Security**: Basic CORS configuration enabled to allow frontend applications to interact with the backend.

## Getting Started

1. **Clone the Repository**: `git clone https://github.com/your_username/todoappbackend.git`
2. **Navigate to the Project Directory**: `cd todoappbackend`
3. **Build and Run the Application**: `./mvn spring-boot:run`
4. The application will start running at `http://localhost:8080`.
5. To use H2 in-memory database:
    Comment out the H2 console part in application.properties and remove any related configurations in pom.xml.
    ```
    #spring.datasource.url=jdbc:h2:mem:testdb
    ```


6. To use a MySQL database for testing:
    Ensure you have a MySQL database running locally.
    Edit the application.properties file with the MySQL datasource configuration provided.
    
    ``` 
    #MySQL datasource configuration
    spring.datasource.url=jdbc:mysql://localhost:3306/{yourdb name any (like todoappdb)}
    spring.datasource.username={your root name here}
    spring.datasource.password={your roootpassword here}
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver 
    ```

7. If you can dockerize this that's great.


## API Endpoints

- **GET /users/{username}/todos**: Retrieve all todos for a specific user.
- **GET /users/{username}/todos/{id}**: Retrieve a single todo by its ID.
- **DELETE /users/{username}/todos/{id}**: Delete a todo by its ID.
- **PUT /users/{username}/todos/{id}**: Update a todo.
- **POST /users/{username}/todos**: Create a new todo.

## Configuration

- **Java Version**: 17
- **Spring Boot Version**: 3.3.0
- **Database**: MySQL (configured in application.properties)
- **Frontend Integration**: This backend service is integrated with a React frontend. The frontend application can interact with the backend API endpoints to perform CRUD operations on todo items.For more information about the backend integration, refer to the [Frontend Repository](https://github.com/darshanbajgain/todo-app-frontend).


## Creator

- [Darshan Bajgain](https://github.com/darshanbajgain)

