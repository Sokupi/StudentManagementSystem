# 🎓 Student Management System (Java - NetBeans)

## 📌 Overview

This is a simple **console-based Student Management System** built using Java in NetBeans.
The program demonstrates core programming concepts and Object-Oriented Programming (OOP) principles by allowing users to input, store, and display student data, including grades and computed averages.

---

## 🎯 Objectives

This project was created to practice and apply:

* Java fundamentals (variables, arrays, loops, input/output)
* Object-Oriented Programming (OOP)
* Class design and encapsulation
* Constructors and methods
* Static variables

---

## 🧠 Features

* 📥 Input student details (name, age, grades)
* 📊 Compute average grade per student
* 📋 Display all student records
* 🔢 Track total number of students using a static variable

---

## 🏗️ Project Structure

```
/src
 ├── MyLib
 │    └── Student.java   // Student class (data + methods)
 └── MyApp
      └── Main.java      // Main program (user input & execution)
```

---

## 🧩 Concepts Applied

### 🔹 Java Fundamentals

* Arrays (`double[] grades`)
* Loops (`for`, enhanced for-loop)
* Input handling (`Scanner`)
* Output formatting (`printf`)

### 🔹 OOP Principles

* **Encapsulation** → private fields with public getters
* **Classes & Objects** → `Student` class and instances
* **Constructors** → initializing student data
* **Separation of Concerns** → input handled in `Main`, logic in `Student`

---

## ▶️ How to Run

1. Open the project in NetBeans
2. Build the project
3. Run `Main.java`
4. Follow the console prompts

---

## 💻 Sample Output

```
Enter number of students: 2

--- Student 1 ---
Enter name: John
Enter age: 20
Enter 3 grades:
Grade 1: 90
Grade 2: 85
Grade 3: 88

--- Student 2 ---
Enter name: Maria
Enter age: 19
Enter 3 grades:
Grade 1: 95
Grade 2: 92
Grade 3: 89

=== Student Records ===
Name: John
Age: 20
Grades: 90.0 85.0 88.0
Average: 87.67

Name: Maria
Age: 19
Grades: 95.0 92.0 89.0
Average: 92.00

Total Students: 2
```

---

## 🚀 Possible Improvements

* 🔍 Search student by name
* 🏆 Find highest/lowest average
* 📊 Compute class average
* 🗂️ Replace arrays with `ArrayList`
* ⚠️ Add error handling (`try-catch`)
* 🖥️ Convert into GUI (Java Swing/JavaFX)

---

## 📚 What I Learned

* Proper separation between **data classes and user interaction**
* How arrays and loops work together
* Importance of clean code structure in OOP
* Debugging common Java errors (e.g., `printf`, array handling)

---

## 👤 Author

**Hizham Mariano**
Computer Science Student

---

## 📌 Notes

This project is intended for educational purposes and serves as a foundational exercise in Java and OOP.
