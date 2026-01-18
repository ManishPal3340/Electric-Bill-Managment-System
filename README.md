# Electric-Bill-Managment-System
Electricity Bill Management System is a console-based Java application developed using Java, JDBC, and MySQL. This project helps manage electricity customers, calculate bills based on unit consumption, and store bill records in a database. It is menu-driven and suitable for beginners to understand JDBC and database connectivity.


## # ⚡ Electricity Bill Management System (Java JDBC + MySQL)

## 📌 Project Overview
The **Electricity Bill Management System** is a console-based Java application developed using **Java, JDBC, and MySQL**.  
It helps manage electricity customers, generate bills based on units consumed, and store bill details in a database.

This project is ideal for **students and freshers** to understand:
- JDBC connectivity
- Database operations
- Menu-driven console applications

---

## 🛠 Technologies Used
- Java (Core Java)
- JDBC (Java Database Connectivity)
- MySQL
- Eclipse / IntelliJ IDEA
- MySQL Connector/J

---

## ✨ Features
- Add new electricity customers
- Generate electricity bill based on unit consumption
- View all generated bills
- Menu-driven console interface
- Secure database access using PreparedStatement

---

## 📂 Project Structure

ElectricityBillSystem
│
├── DBConnection.java
├── CustomerService.java
├── BillService.java
└── MainApp.java


---

## 🗄 Database Structure

### Database Name


 ## electricity_db


### Tables

#### customers
| Column | Type |
|------|------|
| id | INT (PK, AUTO_INCREMENT) |
| name | VARCHAR |
| address | VARCHAR |

#### bills
| Column | Type |
|------|------|
| bill_id | INT (PK, AUTO_INCREMENT) |
| customer_id | INT (FK) |
| units | INT |
| amount | DOUBLE |
| bill_date | DATE |

---

## ⚙ How to Run the Project

1. Install **Java JDK**
2. Install **MySQL Server**
3. Create database and tables using the SQL script
4. Add **MySQL Connector JAR** to the project
5. Update database username and password in `DBConnection.java`
6. Run `MainApp.java`

---

## 📊 Bill Calculation Logic
- Units ≤ 100 → ₹2 per unit
- Units 101 – 200 → ₹3 per unit
- Units > 200 → ₹5 per unit

---

## 🎯 Learning Outcomes
- JDBC Connection handling
- CRUD operations with MySQL
- PreparedStatement usage
- Console-based menu-driven programming
- Real-world billing logic implementation

---

## 🚀 Future Enhancements
- User Login & Authentication
- Payment System Integration
- Monthly Bill Report
- Admin & User Roles
- GUI using JavaFX / Swing

---

## 👨‍💻 Author
**Manish Pal**  
Java Developer | Fresher  

---

## ⭐ Support
If you like this project, please give it a ⭐ on GitHub.
