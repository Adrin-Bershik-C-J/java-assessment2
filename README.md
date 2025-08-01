# 🛠️ SupportDeskPro

A **Spring Boot**-based **Support Ticket Management System** that allows fetching support tickets and users from a PostgreSQL database. This project demonstrates the use of **Spring Boot, JPA, REST API, and PostgreSQL** with a clean layered architecture.

---

## 📌 Project Overview
SupportDeskPro is a lightweight support ticket system where:
- Users can have multiple support tickets.
- Tickets have statuses (`Open`, `Resolved`, etc.).
- The API provides endpoints to fetch users, tickets, and user-specific tickets.

---

## 📂 Project Structure
```
Directory structure:
└── adrin-bershik-c-j-java-assessment2/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── example/
    │   │   │           └── SupportDeskPro/
    │   │   │               ├── SupportDeskProApplication.java
    │   │   │               ├── controller/
    │   │   │               │   ├── TicketController.java
    │   │   │               │   └── UserController.java
    │   │   │               ├── entity/
    │   │   │               │   ├── Ticket.java
    │   │   │               │   └── User.java
    │   │   │               ├── exceptions/
    │   │   │               │   ├── InvalidStatusException.java
    │   │   │               │   └── TicketNotFoundException.java
    │   │   │               ├── repository/
    │   │   │               │   ├── TicketRepository.java
    │   │   │               │   └── UserRepository.java
    │   │   │               └── service/
    │   │   │                   ├── TicketService.java
    │   │   │                   └── UserService.java
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── example/
    │                   └── SupportDeskPro/
    │                       └── SupportDeskProApplicationTests.java
    └── .mvn/
        └── wrapper/
            └── maven-wrapper.properties

```

---

## ⚙️ Tech Stack
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

---

## 🗄️ Database Setup

### 1️⃣ Create Database
```sql
CREATE DATABASE db;
```
```
CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);
```
```
CREATE TABLE ticket (
    ticket_id SERIAL PRIMARY KEY,
    description TEXT NOT NULL,
    status VARCHAR(50) DEFAULT 'Open',
    user_id BIGINT REFERENCES users(user_id)
);

INSERT INTO users (name) VALUES ('Alice'), ('Bob'), ('Charlie');
INSERT INTO ticket (description, status, user_id) VALUES
('Login issue on portal', 'Open', 1),
('Payment failure in checkout', 'Open', 2),
('UI bug on dashboard', 'Resolved', 1),
('Email notifications not working', 'Open', 3);
```
---

## Configuration
```
Edit src/main/resources/application.properties:
spring.application.name=SupportDeskPro
spring.datasource.url=jdbc:postgresql://localhost:5432/db
spring.datasource.username=postgres
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```
### How to run
```
# 1. Clone the repository
git clone https://github.com/your-repo/SupportDeskPro.git
cd SupportDeskPro

# 2. Build and run the Spring Boot app
mvn spring-boot:run
```
