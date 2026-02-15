# Quality Gate Test App

A simple Spring Boot application for quality gate testing and CI/CD pipeline validation.

## Project Structure

```
quality-gate-test-app/
├── README.md
├── pom.xml
└── src/
    └── main/
        └── java/com/test/
            ├── TestApplication.java
            ├── controller/
            │     └── HelloController.java
            └── service/
                  └── CalculatorService.java
```

## Tech Stack

- **Java 17**
- **Spring Boot 3.2.3**
- **Maven**

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+

### Build

```bash
mvn clean install
```

### Run

```bash
mvn spring-boot:run
```

The application starts on **http://localhost:8080**.

## API Endpoints

| Method | Endpoint         | Description                      |
|--------|------------------|----------------------------------|
| GET    | `/hello`         | Returns a greeting message       |
| GET    | `/hello/{name}`  | Returns a personalized greeting  |
| GET    | `/calculate/add` | Adds two numbers (`a` and `b`)   |
| GET    | `/calculate/sub` | Subtracts two numbers (`a` - `b`)|
| GET    | `/calculate/mul` | Multiplies two numbers           |
| GET    | `/calculate/div` | Divides two numbers (`a` / `b`)  |


#Changed the logics of substract method in branch feature/test1