# Spring Boot Practice Project

A simple Spring Boot REST API project for managing student data, built as a practice exercise to demonstrate fundamental Spring Boot concepts and RESTful web services.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Project Structure](#project-structure)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)

## 🔍 Overview

This project implements a basic CRUD (Create, Read, Update, Delete) REST API for student management. It follows Spring Boot best practices including proper layered architecture, DTOs for data transfer, and service-repository pattern.

## ✨ Features

- **Student Management**: Complete CRUD operations for student entities
- **RESTful API**: Well-structured REST endpoints following HTTP conventions
- **Data Validation**: Input validation using Spring Boot Validation
- **Database Integration**: PostgreSQL database connectivity with JPA/Hibernate
- **DTO Pattern**: Separate DTOs for data transfer and entity management
- **Model Mapping**: Automatic object mapping using ModelMapper
- **Layered Architecture**: Clean separation of concerns with Controller-Service-Repository pattern

## 🛠 Technologies Used

- **Java 21**
- **Spring Boot 3.5.4**
- **Spring Web** - For REST API development
- **Spring Data JPA** - For database operations
- **Spring Boot Validation** - For input validation
- **PostgreSQL** - As database
- **ModelMapper 3.2.0** - For object mapping
- **Lombok** - To reduce boilerplate code
- **Maven** - For dependency management

## 📋 Prerequisites

Before running this application, make sure you have:

- **Java 21** or higher installed
- **Maven** installed
- **PostgreSQL** database server running
- **Git** (optional, for cloning)

## 🚀 Getting Started

### 1. Clone the Repository
```bash
git clone <repository-url>
cd Spring_Boot__Practice
```

### 2. Database Setup
- Create a PostgreSQL database named `postgres`
- Update database credentials in `application.properties` if needed

### 3. Install Dependencies
```bash
mvn clean install
```

### 4. Run the Application
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## 📚 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/students` | Retrieve all students |
| POST | `/api/students` | Create a new student |
| PATCH | `/api/students/{id}` | Partially update a student |
| PUT | `/api/students/{id}` | Replace/update a student |
| DELETE | `/api/students/{id}` | Delete a student |

### Request/Response Examples

#### Create Student (POST /api/students)
**Request Body:**
```json
{
    "name": "John Doe",
    "email": "john.doe@example.com"
}
```

**Response:**
```json
{
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com"
}
```

#### Get All Students (GET /api/students)
**Response:**
```json
[
    {
        "id": 1,
        "name": "John Doe",
        "email": "john.doe@example.com"
    },
    {
        "id": 2,
        "name": "Jane Smith",
        "email": "jane.smith@example.com"
    }
]
```

## 📁 Project Structure

```
src/
├── main/
│   ├── java/org/avi1606/spring_boot__practice/
│   │   ├── SpringBootPracticeApplication.java    # Main application class
│   │   ├── config/
│   │   │   └── MapperConfig.java                  # ModelMapper configuration
│   │   ├── controller/
│   │   │   └── StudentController.java             # REST endpoints
│   │   ├── dto/
│   │   │   ├── StudentDto.java                    # Response DTO
│   │   │   └── StudentAddDto.java                 # Request DTO
│   │   ├── entity/
│   │   │   └── StudentEntity.java                 # JPA entity
│   │   ├── repository/
│   │   │   └── StudentRepository.java             # Data access layer
│   │   └── services/
│   │       ├── StudentService.java                # Service interface
│   │       └── impl/
│   │           └── StudentServiceImpl.java        # Service implementation
│   └── resources/
│       └── application.properties                 # Application configuration
└── test/
    └── java/org/avi1606/spring_boot__practice/
        └── SpringBootPracticeApplicationTests.java # Test class
```

## ⚙️ Configuration

### Database Configuration
The application is configured to use PostgreSQL. Update the following properties in `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Server Configuration
- **Port**: 8080 (configurable in `application.properties`)
- **Context Path**: `/` (root)

## 🏃‍♂️ Running the Application

### Development Mode
```bash
mvn spring-boot:run
```

### Production Build
```bash
mvn clean package
java -jar target/Spring_Boot__Practice-0.0.1-SNAPSHOT.jar
```

## 🧪 Testing

Run the test suite:
```bash
mvn test
```

## 📝 Notes

- The application uses Hibernate's `ddl-auto=update` for automatic schema generation
- SQL queries are logged for debugging purposes
- Input validation is enabled for all API endpoints
- The project follows standard Spring Boot conventions and best practices

## 🤝 Contributing

This is a practice project. Feel free to fork and experiment with additional features like:
- Authentication and authorization
- Additional entities and relationships
- Exception handling
- API documentation with Swagger
- Unit and integration tests
- Caching mechanisms

---

**Author**: avi1606  
**Version**: 0.0.1-SNAPSHOT  
**Spring Boot Version**: 3.5.4
