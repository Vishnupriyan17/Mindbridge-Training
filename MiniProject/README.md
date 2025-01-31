# Student Management System

This is a simple Student Management System built using Java 8 features. The system allows you to:  
- Add new students.  
- View existing students.  
- Update student details.  
- Delete students.  
- Search for students by ID.  
- Store and retrieve student data from a CSV file.  
- Automatically calculate grades based on marks.  

## Features  
-Add, update, delete, and view students.  
-Search students by ID.  
-Automatically calculate grades based on marks.  
-File-based storage (CSV) for persistence.  
-Data loading and saving handled using multithreading for efficiency.  
-Input validation for email format and student details.  

## Technologies Used  
- Java 8  
- Collections (HashMap)  
- Java I/O (File handling)  
- Regular Expressions (Email validation)  
- Multithreading (ExecutorService)  

## Class Overview  

### Student  
- Represents a student with attributes like *ID, Name, Email, Marks, and Grade*.  
- Provides a method to calculate the *grade based on marks*.  

### StudentManager  
- Handles all CRUD operations (*Add, View, Update, Delete, Search*) for students.  
- Uses a *HashMap* to store student data in memory.  
- Ensures *data consistency* by synchronizing operations.  

### FileHandler  
- Responsible for reading and writing student data to a *CSV file*.  
- Uses *multithreading* to perform file operations efficiently.  

### Validator  
- Contains methods to *validate student details* like email format.  
- Ensures only valid input is accepted.  

### Main  
- The entry point of the application.  
- Displays a *console-based menu* for user interaction.  
- Calls StudentManager methods based on user input.   

## Grade Calculation  
Grades are assigned based on the student's average marks:  
- *O* → 90-100  
- *A* → 80-89  
- *B* → 70-79  
- *C* → 60-69  
- *D* → 50-59  
- *E* → Below 50  
