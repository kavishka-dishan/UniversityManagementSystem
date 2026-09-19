# University Student Record and Campus Route Management System

## CIT 300 – Data Structures and Algorithms
### Graded Practical Assignment 1

---

## 1. Project Overview

The **University Student Record and Campus Route Management System** is a Java console-based application developed for the CIT 300 Data Structures and Algorithms module.

The system manages university student records, student service requests, recent system actions, and campus routes.

The main purpose of this project is to demonstrate the practical implementation of different data structures and algorithms in a university management scenario.

The following data structures and algorithms are used:

- Linked List
- Stack
- Queue
- Binary Search Tree (BST)
- Hash Table
- Graph
- Breadth First Search (BFS)
- Depth First Search (DFS)

The application provides a menu-driven console interface and includes input validation and error handling.

---

## 2. System Objectives

The main objectives of the system are to:

- Manage university student records.
- Add, update, delete, search, and display student information.
- Maintain recent system actions using a Stack.
- Manage student service requests using a Queue.
- Organize student records using a Binary Search Tree.
- Provide efficient student searching using Hashing.
- Represent campus locations and roads using a Graph.
- Traverse campus locations using BFS and DFS.
- Handle invalid inputs and common error conditions.
- Demonstrate collaborative software development using Git and GitHub.

---

## 3. Student Record Information

Each student record contains the following information:

- **Student ID**
- **Name**
- **Programme**
- **Marks**

Example:

```text
Student ID : 1001
Name       : Nimal Perera
Programme  : Software Engineering
Marks      : 78.0
```

---

## 4. Main System Features

### 4.1 Student Record Management

The system allows users to:

- Add a new student record.
- Update an existing student record.
- Delete a student record.
- Search for a student.
- Display all student records.

The **Linked List** is used as the main data structure for student record management.

---

### 4.2 Service Request Management

Students can submit service requests through the system.

Examples include:

- Transcript Request
- Student ID Card Replacement
- Registration Support
- Examination Inquiry

A **Queue** is used to manage these requests.

Requests are processed according to the:

**First-In-First-Out (FIFO)** principle.

Therefore, the first service request added to the Queue is the first request processed.

---

### 4.3 Recent Action Management

The system records recent actions performed by the user.

Examples include:

- Adding a student.
- Updating a student.
- Deleting a student.
- Adding a service request.
- Processing a service request.
- Adding a campus location.
- Removing a campus location.
- Adding a campus connection.
- Removing a campus connection.

A **Stack** is used to store these actions.

The Stack follows the:

**Last-In-First-Out (LIFO)** principle.

Therefore, the most recent action is displayed first.

---

### 4.4 Student Organization using BST

A **Binary Search Tree (BST)** is used to organize students according to their Student IDs.

The BST supports:

- Insert
- Search
- Delete
- In-order Traversal
- Pre-order Traversal
- Post-order Traversal

The main menu uses **In-order Traversal** to display students in Student ID order.

---

### 4.5 Student Searching using Hashing

A **Hash Table** is used to provide efficient searching using Student ID.

The Student ID is used as the key.

The implementation uses:

- Hash Function
- Linear Probing
- Collision Handling

The Hash Table supports:

- Insert
- Search
- Delete

---

### 4.6 Campus Route Management

A **Graph** is used to represent campus locations and connections between locations.

Example campus locations include:

- Main Gate
- Library
- Cafeteria
- Computer Lab
- Lecture Hall

The system supports:

- Adding locations.
- Removing locations.
- Adding roads/connections.
- Removing roads/connections.
- Displaying campus connections.
- Traversing locations using BFS.
- Traversing locations using DFS.

The Graph is represented using an **Adjacency List**.

Campus connections are implemented as **undirected connections**.

For example:

```text
Main Gate <-> Library
Library <-> Cafeteria
Library <-> Computer Lab
```

---

## 5. Data Structures and Algorithms Used

### 5.1 Linked List

The Linked List is used to manage student records.

Main operations:

- Add Student
- Update Student
- Delete Student
- Search Student
- Display Students

Classes:

```text
Student.java
StudentNode.java
StudentLinkedList.java
```

---

### 5.2 Stack

The Stack is used to maintain recent system actions.

Main operations:

- Push
- Pop
- Peek
- Display Actions

Class:

```text
ActionStack.java
```

Principle:

```text
LIFO - Last-In-First-Out
```

---

### 5.3 Queue

The Queue is used to manage student service requests.

Main operations:

- Enqueue
- Dequeue
- Peek
- Display Requests

Classes:

```text
ServiceRequest.java
ServiceRequestQueue.java
```

Principle:

```text
FIFO - First-In-First-Out
```

---

### 5.4 Binary Search Tree

The Binary Search Tree stores students according to Student ID.

Main operations:

- Insert Student
- Search Student
- Delete Student
- In-order Traversal
- Pre-order Traversal
- Post-order Traversal

Classes:

```text
StudentBST.java
StudentTreeNode.java
```

---

### 5.5 Hash Table

The Hash Table provides efficient Student ID searching.

Main operations:

- Insert Student
- Search Student
- Delete Student

Collision handling:

```text
Linear Probing
```

Class:

```text
StudentHashTable.java
```

---

### 5.6 Graph

The Graph represents campus locations and roads.

Main operations:

- Add Location
- Remove Location
- Add Connection
- Remove Connection
- Display Graph
- BFS Traversal
- DFS Traversal

Classes:

```text
CampusGraph.java
Location.java
```

Graph representation:

```text
Adjacency List
```

---

### 5.7 Breadth First Search (BFS)

Breadth First Search is used to traverse campus locations level by level.

A Queue is used internally during BFS traversal.

Example:

```text
BFS Traversal:
Main Gate Library Cafeteria Computer Lab Lecture Hall
```

---

### 5.8 Depth First Search (DFS)

Depth First Search is used to traverse campus locations by exploring a path before moving to another path.

The implementation uses recursion.

Example:

```text
DFS Traversal:
Main Gate Library Cafeteria Lecture Hall Computer Lab
```

---

## 6. Main Menu

The system provides the following menu:

```text
============== MAIN MENU ==============

1.  Add Student Record
2.  Update Student Record
3.  Delete Student Record
4.  Display All Records using Linked List
5.  Add Service Request to Queue
6.  Process Next Service Request
7.  Display Recent Actions using Stack
8.  Display Students using BST
9.  Search Student using Hashing
10. Add Campus Location
11. Remove Campus Location
12. Add Campus Connection/Road
13. Remove Campus Connection/Road
14. Display Campus Connections
15. Traverse Campus Locations using BFS or DFS
16. Exit

=======================================
```

---

## 7. Menu Functionality

### Option 1 – Add Student Record

Creates a new student and adds the record to:

- Linked List
- Binary Search Tree
- Hash Table

Duplicate Student IDs are rejected.

---

### Option 2 – Update Student Record

Searches for a student using Student ID and allows the user to update:

- Name
- Programme
- Marks

The student information is kept synchronized across the relevant data structures.

---

### Option 3 – Delete Student Record

Deletes a student from:

- Linked List
- Binary Search Tree
- Hash Table

If the Student ID does not exist, an error message is displayed.

---

### Option 4 – Display All Records using Linked List

Displays all student records stored in the Linked List.

---

### Option 5 – Add Service Request to Queue

Creates a service request for an existing student and adds it to the Queue.

Each service request contains:

- Request ID
- Student ID
- Request Type

---

### Option 6 – Process Next Service Request

Removes and processes the next service request from the Queue according to FIFO order.

---

### Option 7 – Display Recent Actions using Stack

Displays recent actions from the Stack.

The most recent action is displayed first.

---

### Option 8 – Display Students using BST

Displays student records using BST In-order Traversal.

---

### Option 9 – Search Student using Hashing

Searches for a student using Student ID through the Hash Table.

---

### Option 10 – Add Campus Location

Adds a new location to the campus Graph.

Duplicate locations are rejected.

---

### Option 11 – Remove Campus Location

Removes an existing location and its associated connections from the Graph.

---

### Option 12 – Add Campus Connection/Road

Creates an undirected connection between two existing campus locations.

---

### Option 13 – Remove Campus Connection/Road

Removes an existing connection between two campus locations.

---

### Option 14 – Display Campus Connections

Displays the campus Graph using its adjacency list.

Example:

```text
========== CAMPUS ROUTES ==========

Main Gate -> Library
Library -> Main Gate Cafeteria Computer Lab
Cafeteria -> Library Lecture Hall
Computer Lab -> Library Lecture Hall
Lecture Hall -> Cafeteria Computer Lab
```

---

### Option 15 – Traverse Campus Locations using BFS or DFS

Allows the user to select:

```text
1. BFS - Breadth First Search
2. DFS - Depth First Search
```

The user then provides the starting location.

---

### Option 16 – Exit

Terminates the application.

---

## 8. Student Data Synchronization

Student records are used across multiple data structures.

When a student is added:

```text
Student
   |
   +--> Linked List
   |
   +--> Binary Search Tree
   |
   +--> Hash Table
```

The same Student object is referenced by the relevant structures.

When a student is updated, the shared Student object keeps the stored student information synchronized.

When a student is deleted, the student is removed from:

- Linked List
- Binary Search Tree
- Hash Table

This prevents deleted student records from remaining available through BST or Hash Table operations.

---

## 9. Input Validation and Error Handling

The system includes validation to prevent common input errors.

### Menu Validation

Only valid integer menu options are accepted.

Example:

```text
Invalid choice. Please enter a number from 1 to 16.
```

---

### Numeric Input Validation

If the user enters text where an integer is required, the system displays an error message instead of terminating.

Example:

```text
Invalid input. Please enter a valid integer.
```

---

### Student ID Validation

Student IDs must be positive values.

Example:

```text
Value must be greater than zero.
```

Duplicate Student IDs are not allowed.

---

### Marks Validation

Marks must be between:

```text
0 - 100
```

Example:

```text
Invalid marks. Marks must be between 0 and 100.
```

---

### Empty Input Validation

Required text values cannot be empty.

Example:

```text
Input cannot be empty.
```

---

### Missing Student Validation

Operations on a Student ID that does not exist display an appropriate error message.

---

### Campus Location Validation

The Graph handles:

- Duplicate locations
- Missing locations
- Invalid connections
- Duplicate connections
- Self-connections
- Missing connections

For example:

```text
Location already exists.
```

```text
One or both locations were not found.
```

```text
Cannot connect a location to itself.
```

```text
Connection already exists.
```

```text
Connection does not exist.
```

---

### Queue Validation

The system handles attempts to process an empty service request Queue.

Example:

```text
No service requests available.
```

---

### Stack Validation

The system handles attempts to display an empty recent-action Stack.

Example:

```text
No recent actions available.
```

---

## 10. Project Structure

```text
UniversityManagementSystem/
│
├── src/
│   │
│   ├── student/
│   │   ├── Student.java
│   │   └── StudentNode.java
│   │
│   ├── linkedlist/
│   │   └── StudentLinkedList.java
│   │
│   ├── stack/
│   │   └── ActionStack.java
│   │
│   ├── queue/
│   │   ├── ServiceRequest.java
│   │   └── ServiceRequestQueue.java
│   │
│   ├── bst/
│   │   ├── StudentBST.java
│   │   └── StudentTreeNode.java
│   │
│   ├── hashing/
│   │   └── StudentHashTable.java
│   │
│   ├── graph/
│   │   ├── CampusGraph.java
│   │   └── Location.java
│   │
│   └── Main.java
│
├── nbproject/
├── .gitignore
├── README.md
├── build.xml
└── manifest.mf
```

---

## 11. Class Responsibilities

| Class | Responsibility |
|---|---|
| `Student` | Stores student details |
| `StudentNode` | Node used by the student Linked List |
| `StudentLinkedList` | Manages student records using a Linked List |
| `ActionStack` | Stores recent system actions |
| `ServiceRequest` | Represents a student service request |
| `ServiceRequestQueue` | Manages service requests using a Queue |
| `StudentTreeNode` | Node used by the Binary Search Tree |
| `StudentBST` | Organizes students using a BST |
| `StudentHashTable` | Provides Student ID searching using Hashing |
| `Location` | Represents a campus location |
| `CampusGraph` | Manages campus locations, connections, BFS and DFS |
| `Main` | Provides the menu and integrates all components |

---

## 12. Team Member Contributions

The project was developed collaboratively by three group members.

GitHub branches, commits, and Pull Requests were used to provide evidence of individual contributions.

### Member 1 – Student Record Management

**Responsibilities:**

- Implemented `Student.java`
- Implemented `StudentNode.java`
- Implemented `StudentLinkedList.java`
- Add Student functionality
- Update Student functionality
- Delete Student functionality
- Search Student functionality
- Display Student functionality

**Branch:**

```text
feature/student-record-management
```

---

### Member 2 – Stack and Queue Management

**Responsibilities:**

- Implemented the recent-action Stack.
- Implemented the Service Request model.
- Implemented Stack operations.
- Contributed to Queue and service request functionality.

**Branch:**

```text
feature/stack-queue-management
```

---

### Member 3 – BST, Hashing and Graph Management

**Responsibilities:**

- Implemented Binary Search Tree.
- Implemented BST nodes.
- Implemented Hash Table.
- Implemented campus Graph.
- Implemented campus locations.
- Implemented campus connections.
- Implemented BFS.
- Implemented DFS.

**Branch:**

```text
feature/bst-hashing-graph
```

---

### Final Integration

After the individual components were completed, they were integrated into the final application.

Final integration included:

- Completing the menu-driven application.
- Connecting all data structures.
- Completing Queue functionality.
- Synchronizing student operations.
- Completing BST and Hash Table delete functionality.
- Adding input validation.
- Improving console navigation.
- Testing the complete system.

**Integration Branch:**

```text
feature/final-integration
```

---

## 13. Git and GitHub Collaboration

Git and GitHub were used for version control and team collaboration.

The development workflow was:

```text
main
 |
 +-- feature/student-record-management
 |
 +-- feature/stack-queue-management
 |
 +-- feature/bst-hashing-graph
 |
 +-- feature/final-integration
```

The team followed these steps:

1. Created the main GitHub repository.
2. Created separate feature branches.
3. Assigned responsibilities among group members.
4. Implemented features independently.
5. Created descriptive Git commits.
6. Pushed feature branches to GitHub.
7. Created Pull Requests.
8. Reviewed changes before merging.
9. Merged completed features into `main`.
10. Performed final integration and testing.

GitHub provides evidence of collaboration through:

- Individual commits
- Feature branches
- Pull Requests
- Merge history

---

## 14. Software Requirements

The project can be run using:

- Java JDK
- Apache NetBeans IDE
- Git
- GitHub

The application does not require a database because the purpose of the project is to demonstrate Data Structures and Algorithms.

---

## 15. How to Run the Project

### Using Apache NetBeans

1. Clone or download the GitHub repository.
2. Open Apache NetBeans.
3. Select:

```text
File -> Open Project
```

4. Select the:

```text
UniversityManagementSystem
```

folder.

5. Open the project.
6. Clean and Build the project.
7. Run `Main.java`.
8. The Main Menu will be displayed.
9. Enter a number from 1 to 16 to perform an operation.

---

## 16. Example Test Data

### Student 1

```text
Student ID : 1001
Name       : Nimal Perera
Programme  : Software Engineering
Marks      : 78
```

### Student 2

```text
Student ID : 1002
Name       : Kasun Silva
Programme  : Information Technology
Marks      : 65
```

### Student 3

```text
Student ID : 1003
Name       : Amaya Fernando
Programme  : Data Science
Marks      : 89
```

### Student 4

```text
Student ID : 1004
Name       : Sahan Perera
Programme  : Cyber Security
Marks      : 72
```

---

## 17. Example Service Requests

Example requests that can be used for testing:

```text
Student ID   : 1001
Request Type : Transcript Request
```

```text
Student ID   : 1003
Request Type : Student ID Card Replacement
```

The request added first should be processed first because the Queue follows FIFO order.

---

## 18. Example Campus Test Data

### Locations

```text
Main Gate
Library
Cafeteria
Computer Lab
Lecture Hall
```

### Connections

```text
Main Gate <-> Library
Library <-> Cafeteria
Library <-> Computer Lab
Cafeteria <-> Lecture Hall
Computer Lab <-> Lecture Hall
```

These locations and connections can be used to demonstrate:

- Graph creation
- Adjacency List display
- BFS
- DFS

---

## 19. Testing

The complete application was tested after integration.

### Student Management Testing

The following operations were tested:

- Add a valid student.
- Add multiple students.
- Add a duplicate Student ID.
- Update an existing student.
- Update a missing student.
- Delete an existing student.
- Delete a missing student.
- Display all students.
- Search for an existing student.
- Search for a missing student.

---

### Marks Validation Testing

The following values were tested:

```text
Valid:
0
50
78
100

Invalid:
-1
101
120
abc
```

---

### Stack Testing

The Stack was tested by:

- Adding multiple system actions.
- Displaying recent actions.
- Confirming that the most recent action is displayed first.
- Testing an empty Stack.

---

### Queue Testing

The Queue was tested by:

- Adding multiple service requests.
- Processing requests.
- Confirming FIFO processing order.
- Testing an empty Queue.

---

### BST Testing

The BST was tested by:

- Inserting multiple students.
- Searching for students.
- Displaying students using In-order Traversal.
- Deleting students.

---

### Hash Table Testing

The Hash Table was tested by:

- Inserting students.
- Searching using Student ID.
- Handling collisions using Linear Probing.
- Deleting student records.

---

### Graph Testing

The Graph was tested by:

- Adding locations.
- Adding duplicate locations.
- Removing locations.
- Adding connections.
- Adding duplicate connections.
- Removing connections.
- Attempting invalid connections.
- Displaying the adjacency list.
- Performing BFS.
- Performing DFS.

---

## 20. Example Full Testing Flow

A complete demonstration can follow this order:

```text
1  -> Add Student Record
1  -> Add another Student Record
4  -> Display All Records using Linked List
8  -> Display Students using BST
9  -> Search Student using Hashing
2  -> Update Student Record
5  -> Add Service Request to Queue
5  -> Add another Service Request
6  -> Process Next Service Request
7  -> Display Recent Actions using Stack
10 -> Add Campus Location
10 -> Add another Campus Location
12 -> Add Campus Connection/Road
14 -> Display Campus Connections
15 -> BFS Traversal
15 -> DFS Traversal
3  -> Delete Student Record
4  -> Confirm deletion from Linked List
8  -> Confirm deletion from BST
9  -> Confirm deletion from Hash Table
16 -> Exit
```

---

## 21. Error Handling Test Examples

The following invalid operations can also be demonstrated:

```text
Enter marks greater than 100
Enter marks below 0
Enter letters instead of a numeric menu option
Add an existing Student ID
Search for a missing Student ID
Add a duplicate campus location
Connect a location to itself
Connect locations that do not exist
Remove a connection that does not exist
Process a service request when the Queue is empty
```

The application should display an appropriate error message and continue running.

---

## 22. Console Navigation

After completing an operation, the application displays:

```text
Press Enter to return to Main Menu...
```

This allows the user to review the result before returning to the Main Menu.

The application continues running until the user selects:

```text
16. Exit
```

---

## 23. Key Learning Outcomes

This project demonstrates practical knowledge of:

- Object-Oriented Programming in Java
- Linked List implementation
- Stack implementation
- Queue implementation
- Binary Search Tree operations
- Hashing and collision handling
- Graph representation
- Breadth First Search
- Depth First Search
- Input validation
- Error handling
- Modular programming
- Git version control
- GitHub collaboration
- Branch-based development
- Pull Requests
- Team integration

---

## 24. Conclusion

The **University Student Record and Campus Route Management System** demonstrates how different Data Structures and Algorithms can be combined to solve a practical management problem.

The Linked List manages student records, the Stack maintains recent actions, the Queue processes service requests, the Binary Search Tree organizes students, and the Hash Table provides efficient Student ID searching.

The Graph represents campus locations and roads, while BFS and DFS provide two different methods for traversing campus locations.

The final system combines these components through a menu-driven Java console application with input validation and error handling.

The project also demonstrates collaborative development using GitHub feature branches, commits, Pull Requests, and final integration.
