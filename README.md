# 🎓 Student Management API - Spring Boot Project

This project is a RESTful API for managing student records built using Spring Boot. It allows for full CRUD operations (Create, Read, Update, Delete) on student data and is integrated with a relational database like MySQL or H2. All endpoints are tested using Postman.

---

## 📁 Project Structure

```
src/
├── controller/
│   └── StudentController.java
├── model/
│   └── Student.java
├── repository/
│   └── StudentRepository.java
├── service/
│   └── StudentService.java
└── StudentManagementApiApplication.java
```

---

## 💡 Features

* Add new student records
* Retrieve all students or by ID
* Update existing student information
* Delete students from the database
* RESTful APIs using Spring Boot
* Integration with MySQL or H2
* Postman-tested endpoints

---

## 💻 Technologies Used

* Java 17+
* Spring Boot
* Spring Data JPA
* MySQL / H2 Database
* Postman for API testing

---

## 🔌 Base Path

```
/api/students
```

---

## 🔌 API Endpoints

| Method | Endpoint     | Description          |
| ------ | ------------ | -------------------- |
| POST   | /add         | Add a new student    |
| GET    | /get         | Get all students     |
| GET    | /get/{id}    | Get student by ID    |
| PUT    | /insert/{id} | Update student by ID |
| DELETE | /delete/{id} | Delete student by ID |

---

## 📦 Database Configuration

### Option 1: MySQL (in `application.properties`)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Option 2: H2 In-Memory DB

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📬 Sample JSON for POST/PUT

```json
{
  "name": "shreyas Khandare",
  "email": "shreyas@gmail.com",
  "course": "cloud computing"
}
```

---

## 🧪 Postman Testing

Screenshots below show sample responses from Postman:

| Action                | Screenshot |
| --------------------- | ---------- |
| POST /students (Add)  | POST       |
| GET /students         | GET        |
| PUT /students/{id}    | PUT        |
| DELETE /students/{id} | DELETE     |

---

## 🚀 How to Run

### Clone this repository:

```bash
git clone https://github.com/your-username/student-management-api.git
```

### Navigate to the project folder and run:

```bash
mvn spring-boot:run
```

### Use Postman to test the APIs locally at:

```
http://localhost:8080/api/students
```

---

## 📄 License

This project is intended for learning and educational purposes only.
No commercial use is permitted.
