# 📚 Digital Library Management System (Java Swing)

A simple **Digital Library Management System** built using **Java Swing (GUI)**.  
It allows user authentication (Login System) and provides an interactive **Dashboard**  
to manage books, members, and future expansion like issue/return system.

---

## 🚀 Features

### 🧑‍💻 User Login
- Login page for authentication  
- Default credentials:
  ```
  Username: admin
  Password: admin123
  ```
- On successful login, user is redirected to the **Dashboard**

### 🏠 Dashboard
- Displays main options:
  - 📚 Manage Books
  - 👥 Manage Members
  - 🚪 Logout  
- Built using **Java Swing** with GridLayout and action events

### 📚 Manage Books Module
- Add, view, and delete books dynamically  
- Stores data temporarily (in-memory using `ArrayList`)  
- Fully functional GUI with `JList`, `JTextField`, and buttons  
- Can be extended easily for database integration (MySQL)

### 👥 Manage Members (Placeholder)
- Displays a popup “Coming soon!”
- Can be later replaced with actual member management system

---

## 🗂️ Project Structure

```
java project/
│
├── LoginFrame.java        # Handles login window
├── Dashboard.java         # Main dashboard after login
├── ManageBooks.java       # Manage books GUI
└── README.md              # Project documentation
```

---

## 🧩 Technologies Used
- **Java SE 8+**
- **Swing** for GUI
- **AWT** for layout management
- (Optional) **MySQL** for database integration (future scope)

---

## ⚙️ How to Run

### Step 1: Compile
Open terminal or command prompt in your project folder:
```bash
cd "path/to/java project"
javac *.java
```

### Step 2: Run
```bash
java LoginFrame
```

### Step 3: Login
Use credentials:
```
Username: admin
Password: admin123
```

---

## 📦 Future Enhancements
✅ Add MySQL database for real data storage  
✅ Create Manage Members module  
✅ Implement Book Issue & Return system  
✅ Generate reports (issued books, due date, etc.)

---

## 🧠 Learning Outcomes
- GUI Development using Java Swing  
- Event Handling in Java  
- Multi-window Application Design  
- Object-Oriented Programming (OOP) Concepts  

---

## 🪪 Author
**Developed by:** Abhay Bhatt  
📧 *[Add your email or GitHub profile link here]*  
🎯 For educational and learning purposes.

---

## 🖼️ Screenshots
### 1️⃣ Login Page  
![Login](assets/login.png)

### 2️⃣ Dashboard  
![Dashboard](assets/dashboard.png)

### 3️⃣ Manage Books  
![Manage Books](assets/manage_books.png)

---

> ⚡ Tip: You can expand this project into a full-fledged Library Management System with database, user roles, and reports.
