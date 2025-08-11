# 📘🎓 CampusRequirement API: Job Postings & Student Application Tracker

CampusRequirement API is a robust and scalable recruitment management system built with Spring Boot and Hibernate.  
It streamlines campus hiring workflows by managing users, students, job postings, job applications, and interviews efficiently.  
The project follows a modular layered architecture to ensure maintainability, scalability, and easy integration with other systems.

---

## 🚀 Features

- **User Module** – Authentication, role-based access (ADMIN, COLLEGE, COMPANY).  
- **Student Module** – Manage student registration, updates, and records.  
- **Job Posting Module** – Create, update, delete, and list job opportunities.  
- **Job Application Module** – Apply for jobs and track application status.  
- **Interview Module** – Schedule and manage interviews with status updates.  
- **Service-Oriented Architecture** – Clear separation of business logic in the service layer.  
- **API Testing** – Verified using Postman for all CRUD and workflow operations.  
- **Spring Boot & Hibernate** – Modern frameworks for reliability and performance.  

---

## 🛠 Technology Stack

| Category          | Technology      |
|-------------------|-----------------|
| Backend Framework | Spring Boot 2   |
| ORM               | Hibernate 5     |
| Database          | MySQL           |
| Language          | Java 8          |
| Build Tool        | Maven           |
| API Testing       | Postman         |
| IDE               | Eclipse         |

---

## 📂 Project Structure
```
CampusRecruit_API/
├── src/main/java/com/db/
│ ├── CampusRecruitApplication.java # Main Spring Boot application entry point
│ ├── controller/ # REST controllers - handle HTTP requests
│ │ ├── AuthController.java
│ │ ├── InterviewController.java
│ │ ├── JobApplicationController.java
│ │ ├── JobPostingController.java
│ │ ├── StudentController.java
│ │ └── UserController.java
│ ├── dao/ # Data access layer (Repositories / DAO classes)
│ │ ├── InterviewRepository.java
│ │ ├── JobApplicationRepository.java
│ │ ├── JobPostingRepository.java
│ │ ├── StudentRepository.java
│ │ └── UserRepository.java
│ ├── entity/ # Entity classes mapping to database tables
│ │ ├── Interview.java
│ │ ├── JobApplication.java
│ │ ├── JobPosting.java
│ │ ├── Student.java
│ │ └── User.java
│ ├── enums/ # Enum constants used across the app
│ │ ├── ApplicationStatus.java
│ │ ├── InterviewStatus.java
│ │ └── UserRole.java
│ ├── model/ # Request/Response DTOs
│ │ ├── LoginRequest.java
│ │ ├── LoginResponse.java
│ │ ├── JobApplicationRequest.java
│ │ ├── JobPostingRequest.java
│ │ ├── StudentRequest.java
│ │ └── UserRequest.java
│ └── service/ # Service layer containing business logic
│ ├── AuthService.java
│ ├── InterviewService.java
│ ├── JobApplicationService.java
│ ├── JobPostingService.java
│ ├── StudentService.java
│ └── UserService.java
├── src/main/resources/
│ ├── application.properties # Spring Boot configuration
│ └── data.sql # Optional: Initial database seed data
└── pom.xml # Maven configuration
```
---

## 💻 API Endpoints

### 🧑‍💼 User Module

| HTTP Method | Endpoint                        | Description        |
|-------------|--------------------------------|--------------------|
| POST        | `/auth/login`                   | User login         |
| POST        | `/user/createUser`              | Create new user    |
| GET         | `/user/allUsers`                | Get all users      |
| GET         | `/user/getUser/{username}`     | Get user by username |
| PUT         | `/user/updateUser`              | Update user details|
| DELETE      | `/user/deleteUser/{username}`  | Delete user        |

### 🧑‍🎓 Student Module

| HTTP Method | Endpoint                      | Description        |
|-------------|-------------------------------|--------------------|
| POST        | `/students/register`           | Register a student |
| GET         | `/students/allStudents`        | Get all students   |
| PUT         | `/students/updateStudent`      | Update student     |
| DELETE      | `/students/deleteStudent/{id}` | Delete student     |

### 💼 Job Posting Module

| HTTP Method | Endpoint                        | Description          |
|-------------|---------------------------------|----------------------|
| POST        | `/job-postings/createJob`        | Create job posting   |
| GET         | `/job-postings/allJobs`          | List all jobs        |
| PUT         | `/job-postings/updateJob`        | Update job posting   |
| DELETE      | `/job-postings/deleteJob/{id}`   | Delete job posting   |

### 📄 Job Application Module

| HTTP Method | Endpoint                                   | Description             |
|-------------|--------------------------------------------|-------------------------|
| POST        | `/jobApplication/apply`                     | Apply for a job         |
| PUT         | `/jobApplication/updateStatus/{id}/{status}` | Update application status |

### 🎤 Interview Module

| HTTP Method | Endpoint                              | Description              |
|-------------|-------------------------------------|--------------------------|
| POST        | `/interview/schedule`                | Schedule an interview    |
| GET         | `/interview/{id}`                    | Get interview details    |
| PUT         | `/interview/updateStatus/{id}/{status}` | Update interview status |

---

## 🧪 Testing with Postman

- All endpoints tested for CRUD operations, authentication, and workflows.  
- Status updates (APPLIED, APPROVED, REJECTED) and interview scheduling verified.

---

## 🏗 Architecture

The project follows a Layered Architecture:

- **Controller Layer** – Handles HTTP requests & responses.  
- **Service Layer** – Implements business logic.  
- **DAO Layer** – Interacts with the database.  
- **Entity Layer** – Defines the data models.  

---

## 📖 Getting Started

### ✅ Prerequisites

- JDK 8 or higher  
- Maven  
- MySQL  
- Postman (optional)  

### 🚀 Steps to Run

```bash
# Clone the repository
git clone https://github.com/durgabhure19/CampusRecruit_API.git
cd CampusRecruit_API
```
```
Configure MySQL

sql
CREATE DATABASE campus_recruit;
Update application.properties
```
```
properties
spring.datasource.url=jdbc:mysql://localhost:3306/campus_recruit
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
```
Run the application

mvn clean install
mvn spring-boot:run
```

```
API runs at:
http://localhost:8080
```
