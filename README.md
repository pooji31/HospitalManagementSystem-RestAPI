🏥 Hospital Management System - REST API

A RESTful Hospital Management System built using 𝗦𝗽𝗿𝗶𝗻𝗴 𝗕𝗼𝗼𝘁, 𝗦𝗽𝗿𝗶𝗻𝗴 𝗗𝗮𝘁𝗮 𝗝𝗣𝗔, 𝗛𝗶𝗯𝗲𝗿𝗻𝗮𝘁𝗲, and 𝗠𝘆𝗦𝗤𝗟. This project shows CRUD operations, layered architecture, exception handling, and API documentation using Swagger UI.

🚀 Features

• 👨‍⚕️ Doctor Management
• Add Doctor
• View All Doctors
• View Doctor by ID
• Update Doctor
• Delete Doctor

• 🧑‍🤝‍🧑 Patient Management
• Add Patient
• View All Patients
• View Patient by ID
• Update Patient
• Delete Patient

• Global Exception Handling
• RESTful API Design
• Swagger UI Integration
• Spring Data JPA
• MySQL Database Integration

🛠️ Tech Stack

• Java 17
• Spring Boot
• Spring Web
• Spring Data JPA
• Hibernate
• MySQL
• Maven
• Swagger UI

📂 Project Structure

src
 ├── main
 │   ├── java
 │   │   └── com.mits
 │   │       ├── controller
 │   │       ├── service
 │   │       ├── repository
 │   │       ├── model
 │   │       ├── exception
 │   │       └── HospitalManagementSystemApplication.java
 │   └── resources
 │       └── application.properties
 └── test

📚 API Endpoints

Doctor APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /doctor | Add Doctor |
| GET | /doctor | Get All Doctors |
| GET | /doctor/{id} | Get Doctor by ID |
| PUT | /doctor/{id} | Update Doctor |
| DELETE | /doctor/{id} | Delete Doctor |

Patient APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /patient | Add Patient |
| GET | /patient | Get All Patients |
| GET | /patient/{id} | Get Patient by ID |
| PUT | /patient/{id} | Update Patient |
| DELETE | /patient/{id} | Delete Patient |

📖 Swagger Documentation

After running the application, open:

http://localhost:8080/swagger-ui/index.html

You can test all REST APIs directly using Swagger UI.

⚙️ Database Configuration

Configure your MySQL credentials in:

src/main/resources/application.properties

Example:

spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

▶️ Running the Project

Clone Repository

git clone https://github.com/pooji31/HospitalManagementSystem-RestAPI.git

Navigate to Project

cd HospitalManagementSystem-RestAPI

Run

mvn spring-boot:run

or run the HospitalManagementSystemApplication class from your IDE.

📚 Concepts Covered

• REST API Development
• Spring Boot
• Spring MVC
• Spring Data JPA
• Hibernate ORM
• CRUD Operations
• Layered Architecture
• Exception Handling
• Swagger/OpenAPI Documentation
• JSON Request & Response

🎯 Learning Outcomes

• Developed RESTful APIs using Spring Boot
• Implemented CRUD operations with Spring Data JPA
• Applied layered architecture (Controller → Service → Repository)
• Handled exceptions using Global Exception Handling
• Documented and tested APIs using Swagger UI
• Integrated MySQL with Hibernate ORM

👩‍💻 Author

𝗣𝗼𝗼𝗷𝗶𝘁𝗵𝗮 𝗥𝗲𝗱𝗱𝘆 𝗗𝗮𝗻𝗱𝘂

GitHub: https://github.com/pooji31

⭐ If you found this project helpful, consider giving it a star!
