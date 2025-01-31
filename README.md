Student Management System

Overview

The Student Management System is a console-based Java application that allows teachers to manage student records efficiently. It provides functionalities to create, update, display, search, and delete student records, storing data persistently in a CSV file.

Features

Add Student: Allows teachers to enter student details, including ID, name, age, email, and grades.

Update Student: Modify student details such as name, age, email, and grades.

Display Student: View the list of all students.

Search by ID: Find a student using their unique ID.

Delete Student: Remove a student record from the system.

File Storage: Saves and loads student data from students.csv.

Multithreading: Uses an ExecutorService for handling file operations asynchronously.

Files and Description

Main.java: The entry point of the application. Provides a menu-driven interface to interact with the system.

Student.java: A model class representing a student with attributes such as ID, name, age, email, and grade.

Teacher.java: Manages student records, handling CRUD operations and file I/O.

Data Storage

Student records are stored in students.csv in the format:

Id,Name,Age,Email-Id,Grade
101,John Doe,20,john@example.com,A
Role-based authentication.

License

This project is open-source and free to use under the MIT License.

