# To-Do List Application (Spring Boot)

## Overview
This is a **To-Do List Application** built using **Spring Boot**, featuring user authentication and full **CRUD operations**. 
Users can **log in, create, update, and delete tasks**, as well as log out. The project is implemented in multiple ways, 
including **simple service-based, controller-based, and JPA repository-based implementations**.

## Features
- **User Authentication**: Secure login system using **Spring Security**.
- **CRUD Operations**: Create, Read, Update, Delete tasks.
- **Session Management**: Uses `@SessionAttributes` to track logged-in users.
- **JPA Repository Integration**: Implements `JpaRepository` for database operations.
- **MVC Architecture**: Organized with Controllers, Services, and Repository layers.

## Tech Stack
- **Backend**: Java, Spring Boot, Spring Security, Spring Data JPA
- **Database**: H2 (In-Memory) or MySQL
- **Tools**: Eclipse/IntelliJ, Maven, Git

## Application Flow
1. **Login Page**: Users authenticate via login credentials.
2. **Dashboard**: Shows a list of all tasks (To-Dos) for the logged-in user.
3. **Create To-Do**: Users can add a new task.
4. **Update To-Do**: Users can modify an existing task.
5. **Delete To-Do**: Users can remove a task.
6. **Logout**: Users can securely log out.

## Implementations
### 1. Basic CRUD using Service Layer
- Uses `TodoService.java` to manage in-memory data.

### 2. CRUD with Controller-Based Approach
- `TodoController.java` manages CRUD requests using simple `List<Todo>`.

### 3. CRUD using JPA Repository (Recommended)
- `TodoControllerJpa.java` interacts with `TodoRepository.java` to store tasks in a database.
- `TodoRepository` extends `JpaRepository<Todo, Integer>` for efficient data operations.

## Images
![Screenshot 2025-02-15 131607](https://github.com/user-attachments/assets/89a87859-6bd9-4f66-b4b9-3ebe12bee7a3)

![Screenshot 2025-02-15 131318](https://github.com/user-attachments/assets/c28a41c9-5502-4da9-b55e-d08b64da5948)

![Screenshot 2025-02-15 131431](https://github.com/user-attachments/assets/4663edd7-21ec-4fe4-8ae9-4a6f77913404)
