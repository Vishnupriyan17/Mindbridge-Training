Student Management System

This is a simple Student Management System built using Java. It allows you to manage student records with the ability to add, update, delete, and view students. The system calculates the grade automatically based on the student's marks. Data is stored in a CSV file and read using multithreading for efficient performance.

Features:

Add, update, delete, and view student records.

Automatically calculate grades based on marks.

Data stored in a CSV file (students.csv).

Multithreaded saving process for efficiency.

Simple and interactive console interface.

Class Breakdown:

1. Student

The Student class represents a student with the following attributes:

studentId (int): The unique identifier for the student.

studentName (String): The name of the student.

studentAge (int): The age of the student.

email (String): The email address of the student.

grade (char): The grade calculated based on the student's marks.

Methods:

getStudentId(), setStudentId(int studentId): Get and set student ID.

getStudentName(), setStudentName(String studentName): Get and set student name.

getStudentAge(), setStudentAge(int studentAge): Get and set student age.

getEmail(), setEmail(String email): Get and set student email.

getGrade(), setGrade(char grade): Get and set student grade.

toString(): Converts the student data into a CSV string format for easy storage.

2. Teacher

The Teacher class manages student records and handles CRUD operations and file I/O.

Methods:

createStudent(): Adds a new student with calculated grade based on marks.

updateStudent(): Updates student details such as name, age, email, or marks.

displayStudent(): Displays all students in the system.

searchId(): Searches for a student by their ID.

deleteStudent(): Deletes a student record from the system.

saveStudent(): Saves student data to the CSV file using multithreading.

loadStudent(): Loads student data from the CSV file.

regexCheck(String email): Validates email format using regex.

3. Main

The Main class is the entry point for the application. It provides an interactive console interface for the user to manage student records.

Features:

A simple text-based menu to choose operations such as:

Add a new student.

View all students.

Search for a student by ID.

Update student details.

Delete a student.

Uses the Teacher class to perform operations.
