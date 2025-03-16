Hotel Management System Backend

Overview

This is a Hotel Management System backend developed using Spring Boot, JPA, JWT Authentication, and Spring Security. It provides APIs for managing hotel reservations, users, rooms, and authentication.

Features

User authentication and authorization using JWT

Role-based access control using Spring Security

CRUD operations for managing rooms, bookings, and users

Secure API endpoints with Spring Security

JPA/Hibernate integration for database operations

Technologies Used

Spring Boot

Spring Security

JWT (JSON Web Token) Authentication

Spring Data JPA

MySQL/PostgreSQL (Choose based on your preference)

Maven

Setup & Installation

Prerequisites

Java 17+

Maven 3+

MySQL/PostgreSQL database

Steps to Run

Clone the Repository:

git clone <repository-url>
cd hotel-management-backend

Configure Database:

Update application.properties or application.yml with your database credentials.

Build & Run the Project:

mvn clean install
mvn spring-boot:run

Access API Endpoints:

API runs on http://localhost:8080

API Endpoints

Authentication

Login: POST /api/auth/login

Register: POST /api/auth/register

User Management

Get All Users: GET /api/users

Get User by ID: GET /api/users/{id}

Update User: PUT /api/users/{id}

Delete User: DELETE /api/users/{id}

Room Management

Get All Rooms: GET /api/rooms

Get Room by ID: GET /api/rooms/{id}

Create Room: POST /api/rooms

Update Room: PUT /api/rooms/{id}

Delete Room: DELETE /api/rooms/{id}

Booking Management

Get All Bookings: GET /api/bookings

Get Booking by ID: GET /api/bookings/{id}

Create Booking: POST /api/bookings

Update Booking: PUT /api/bookings/{id}

Delete Booking: DELETE /api/bookings/{id}

Security

JWT Authentication ensures secure API access.

Role-Based Authorization (Admin & User roles) restricts access to specific endpoints.

Spring Security handles authentication & authorization.

Contributing

Contributions are welcome! Follow these steps:

Fork the repo.

Create a new branch (feature-branch).

Commit changes and push to the branch.

Submit a pull request.
