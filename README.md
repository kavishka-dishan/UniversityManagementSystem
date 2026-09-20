# University Student Record and Campus Route Management System

## CIT 300 – Data Structures and Algorithms
### Graded Practical Assignment 1

---

## 1. Project Overview

The **University Student Record and Campus Route Management System** is a Java console-based application developed for the **CIT 300 – Data Structures and Algorithms** module.

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

## 2. Team Members and Contributions

This project was developed collaboratively by three group members. Each member was responsible for specific data structures and system functionalities.

| Student ID | Member Name | Main Contribution |
|---|---|---|
| 23DA2-0375 | Kavishka | Student Record Management using Linked List and Final System Integration |
| 23DA2-0114 | Senuri | Stack and Queue Management |
| 23DA2-0415 | Lahriu | Binary Search Tree, Hash Table, and Graph Management |

### Member 1 – Kavishka

**Student ID:** 23DA2-0375

**Responsibilities:**

- Implemented `Student.java`.
- Implemented `StudentNode.java`.
- Implemented `StudentLinkedList.java`.
- Implemented Add Student functionality.
- Implemented Update Student functionality.
- Implemented Delete Student functionality.
- Implemented Search Student functionality.
- Implemented Display Student functionality.
- Contributed to final system integration.
- Added input validation and error handling.
- Integrated the final menu-driven console application.

**Git Branch:**

```text
feature/student-record-management
```

### Member 2 – Senuri

**Student ID:** 23DA2-0114

**Responsibilities:**

- Implemented the recent-action Stack.
- Implemented Stack operations.
- Implemented the Service Request model.
- Contributed to Queue Management.
- Used the Queue to manage student service requests.
- Demonstrated FIFO processing of service requests.

**Git Branch:**

```text
feature/stack-queue-management
```

### Member 3 – Lahiru

**Student ID:** 23DA2-0114

**Responsibilities:**

- Implemented the Binary Search Tree.
- Implemented BST nodes.
- Implemented BST insert, search, delete, and traversal operations.
- Implemented the Hash Table.
- Implemented linear probing for collision handling.
- Implemented the Campus Graph.
- Implemented campus location management.
- Implemented campus connection management.
- Implemented Breadth First Search (BFS).
- Implemented Depth First Search (DFS).

**Git Branch:**

```text
feature/bst-hashing-graph
```

### Final Integration

After completing the individual components, all features were integrated into one complete application.

The final integration included:

- Connecting all data structures.
- Completing the menu-driven application.
- Completing Queue functionality.
- Synchronizing student records.
- Completing BST and Hash Table delete functionality.
- Adding input validation.
- Adding error handling.
- Improving console navigation.
- Testing the complete system.

**Integration Branch:**

```text
feature/final-integration
```

---

## 3. System Objectives

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

## 4. Student Record Information

Each student record contains the following information:

- **Student ID**
- **Name**
- **Programme**
- **Marks**

### Example

```text
Student ID : 1001
Name       : Nimal Perera
Programme  : Software Engineering
Marks      : 78.0
```

---

## 5. Main System Features

### 5.1 Student Record Management

The system allows users to:

- Add a new student record.
- Update an existing student record.
- Delete a student record.
- Search for a student.
- Display all student records.

The **Linked List** is used as the main data structure for student record management.

### 5.2 Service Request Management

Students can submit service requests through the system.

Examples include:

- Transcript Request
- Student ID Card Replacement
- Registration Support
- Examination Inquiry

A **Queue** is used to manage these requests.

The Queue follows the:

```text
FIFO – First-In-First-Out
```

Therefore, the first request added is the first request processed.

### 5.3 Recent Action Management

A **Stack** is used to maintain recent system actions.

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

The Stack follows the:

```text
LIFO – Last-In-First-Out
```

Therefore, the most recent action is displayed first.

### 5.4 Student Organization using BST

A **Binary Search Tree (BST)** organizes student records according to Student ID.

The BST supports:

- Insert
- Search
- Delete
- In-order Traversal
- Pre-order Traversal
- Post-order Traversal

The main menu uses **In-order Traversal** to display students according to their Student IDs.

### 5.5 Student Searching using Hashing

A **Hash Table** provides efficient student searching using Student ID.

The Student ID is used as the key.

The implementation uses:

- Hash Function
- Linear Probing
- Collision Handling

The Hash Table supports:

- Insert
- Search
- Delete

### 5.6 Campus Route Management

A **Graph** represents campus locations and roads between locations.

The system supports:

- Adding locations.
- Removing locations.
- Adding connections.
- Removing connections.
- Displaying campus connections.
- BFS traversal.
- DFS traversal.

The Graph is represented using an:

```text
Adjacency List
```

Campus connections are implemented as **undirected connections**.

Example:

```text
Main Gate <-> Library
Library <-> Cafeteria
Library <-> Computer Lab
```

---

## 6. Data Structures and Algorithms Used

### 6.1 Linked List

The Linked List manages student records.

**Main Operations:**

- Add Student
- Update Student
- Delete Student
- Search Student
- Display Students

**Classes:**

```text
Student.java
StudentNode.java
StudentLinkedList.java
```

### 6.2 Stack

The Stack maintains recent system actions.

**Main Operations:**

- Push
- Pop
- Peek
- Display Actions

**Class:**

```text
ActionStack.java
```

**Principle:**

```text
LIFO – Last-In-First-Out
```

### 6.3 Queue

The Queue manages student service requests.

**Main Operations:**

- Enqueue
- Dequeue
- Peek
- Display Requests

**Classes:**

```text
ServiceRequest.java
ServiceRequestQueue.java
```

**Principle:**

```text
FIFO – First-In-First-Out
```

### 6.4 Binary Search Tree

The Binary Search Tree stores students according to Student ID.

**Main Operations:**

- Insert Student
- Search Student
- Delete Student
- In-order Traversal
- Pre-order Traversal
- Post-order Traversal

**Classes:**

```text
StudentBST.java
StudentTreeNode.java
```

### 6.5 Hash Table

The Hash Table provides efficient Student ID searching.

**Main Operations:**

- Insert Student
- Search Student
- Delete Student

**Collision Handling:**

```text
Linear Probing
```

**Class:**

```text
StudentHashTable.java
```

### 6.6 Graph

The Graph represents campus locations and roads.

**Main Operations:**

- Add Location
- Remove Location
- Add Connection
- Remove Connection
- Display Graph
- BFS Traversal
- DFS Traversal

**Classes:**

```text
CampusGraph.java
Location.java
```

**Graph Representation:**

```text
Adjacency List
```

### 6.7 Breadth First Search (BFS)

Breadth First Search traverses campus locations level by level.

A Queue is used internally during BFS traversal.

Example:

```text
Main Gate
Library
Cafeteria
Computer Lab
Lecture Hall
```

### 6.8 Depth First Search (DFS)

Depth First Search traverses the Graph by exploring one path before moving to another path.

The implementation uses recursion.

Example:

```text
Main Gate
Library
Cafeteria
Lecture Hall
Computer Lab
```

---

## 7. Main Menu

The application provides the following menu:

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

## 8. Menu Functionality

### Option 1 – Add Student Record

Creates a new student and adds the student to:

- Linked List
- Binary Search Tree
- Hash Table

Duplicate Student IDs are rejected.

### Option 2 – Update Student Record

Searches for an existing student using Student ID and allows the user to update:

- Name
- Programme
- Marks

The updated information is synchronized across the relevant data structures.

### Option 3 – Delete Student Record

Deletes a student from:

- Linked List
- Binary Search Tree
- Hash Table

If the Student ID does not exist, an appropriate message is displayed.

### Option 4 – Display All Records using Linked List

Displays all student records stored in the Linked List.

### Option 5 – Add Service Request to Queue

Creates a service request for an existing student.

Each request contains:

- Request ID
- Student ID
- Request Type

### Option 6 – Process Next Service Request

Processes the next service request according to FIFO order.

### Option 7 – Display Recent Actions using Stack

Displays recent system actions.

The most recent action is displayed first according to LIFO order.

### Option 8 – Display Students using BST

Displays students using BST In-order Traversal.

### Option 9 – Search Student using Hashing

Searches for a student using Student ID through the Hash Table.

### Option 10 – Add Campus Location

Adds a new location to the campus Graph.

Duplicate locations are rejected.

### Option 11 – Remove Campus Location

Removes a location and its associated connections.

### Option 12 – Add Campus Connection/Road

Creates an undirected connection between two existing campus locations.

### Option 13 – Remove Campus Connection/Road

Removes an existing connection between two locations.

### Option 14 – Display Campus Connections

Displays the Graph using its adjacency list.

### Option 15 – Traverse Campus Locations using BFS or DFS

Allows the user to select:

```text
1. BFS – Breadth First Search
2. DFS – Depth First Search
```

The user then provides the starting location.

### Option 16 – Exit

Terminates the application.

---

## 9. Student Data Synchronization

Student records are maintained across multiple data structures.

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

When a student is updated, the shared Student object keeps the stored information synchronized.

When a student is deleted, the student is removed from:

- Linked List
- Binary Search Tree
- Hash Table

This prevents deleted student records from remaining available through BST or Hash Table operations.

---

## 10. Input Validation and Error Handling

The system includes validation to prevent common input errors.

### 10.1 Menu Validation

Only valid integer menu options are accepted.

Example:

```text
Invalid choice. Please enter a number from 1 to 16.
```

### 10.2 Numeric Input Validation

If text is entered where a number is required, the system displays an error instead of terminating.

Example:

```text
Invalid input. Please enter a valid integer.
```

### 10.3 Student ID Validation

Student IDs must be positive.

Example:

```text
Value must be greater than zero.
```

Duplicate Student IDs are rejected.

### 10.4 Marks Validation

Marks must be between:

```text
0 - 100
```

Example:

```text
Invalid marks. Marks must be between 0 and 100.
```

### 10.5 Empty Input Validation

Required text values cannot be empty.

Example:

```text
Input cannot be empty.
```

### 10.6 Missing Student Validation

Operations involving a Student ID that does not exist display an appropriate message.

### 10.7 Campus Validation

The Graph handles:

- Duplicate locations
- Missing locations
- Invalid connections
- Duplicate connections
- Self-connections
- Missing connections

Example messages:

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

### 10.8 Queue Validation

The system handles attempts to process an empty Queue.

Example:

```text
No service requests available.
```

### 10.9 Stack Validation

The system handles attempts to display an empty Stack.

Example:

```text
No recent actions available.
```

---

## 11. Project Structure

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

## 12. Class Responsibilities

| Class | Responsibility |
|---|---|
| `Student` | Stores student details |
| `StudentNode` | Represents a node in the student Linked List |
| `StudentLinkedList` | Manages student records using a Linked List |
| `ActionStack` | Stores recent system actions |
| `ServiceRequest` | Represents a student service request |
| `ServiceRequestQueue` | Manages service requests using a Queue |
| `StudentTreeNode` | Represents a node in the Binary Search Tree |
| `StudentBST` | Organizes student records using a BST |
| `StudentHashTable` | Provides Student ID searching using Hashing |
| `Location` | Represents a campus location |
| `CampusGraph` | Manages locations, connections, BFS, and DFS |
| `Main` | Provides the menu and integrates all system components |

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
3. Assigned responsibilities among the three members.
4. Implemented features independently.
5. Created descriptive commits.
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

The application does not require a database because the project focuses on the implementation of Data Structures and Algorithms.

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

project folder.

5. Open the project.
6. Clean and Build the project.
7. Run `Main.java`.
8. The Main Menu will be displayed.
9. Enter a number from `1` to `16` to perform an operation.

---

# 16. Example Data and Expected Results

## 16.1 Student Record Examples

The following records can be used to test Student Record Management.

| Student ID | Name | Programme | Marks |
|---|---|---|---:|
| 1001 | Nimal Perera | Software Engineering | 78 |
| 1002 | Kasun Silva | Information Technology | 65 |
| 1003 | Amaya Fernando | Data Science | 89 |
| 1004 | Sahan Perera | Cyber Security | 72 |

### Example Student 1

```text
Student ID : 1001
Name       : Nimal Perera
Programme  : Software Engineering
Marks      : 78
```

### Example Student 2

```text
Student ID : 1002
Name       : Kasun Silva
Programme  : Information Technology
Marks      : 65
```

### Example Student 3

```text
Student ID : 1003
Name       : Amaya Fernando
Programme  : Data Science
Marks      : 89
```

### Example Student 4

```text
Student ID : 1004
Name       : Sahan Perera
Programme  : Cyber Security
Marks      : 72
```

### Expected Result

All four records should be successfully added.

Use:

```text
Option 4 – Display All Records using Linked List
```

to display the records.

---

## 16.2 Update Student Example

Use:

```text
Option 2 – Update Student Record
```

Search for:

```text
Student ID: 1002
```

Update the student:

```text
Name      : Kasun Silva
Programme : Software Engineering
Marks     : 82
```

### Expected Result

Student `1002` should be updated successfully.

---

## 16.3 Delete Student Example

Use:

```text
Option 3 – Delete Student Record
```

Enter:

```text
Student ID: 1003
```

### Expected Result

Student `1003 – Amaya Fernando` should be removed.

The deletion can be checked using:

```text
Option 4 – Linked List
Option 8 – Binary Search Tree
Option 9 – Hash Table
```

The student should no longer be available.

---

## 16.4 Hash Table Search Example

Use:

```text
Option 9 – Search Student using Hashing
```

Enter:

```text
1001
```

### Expected Result

```text
Student ID : 1001
Name       : Nimal Perera
Programme  : Software Engineering
Marks      : 78
```

---

## 17. Stack and Queue Examples

### 17.1 Service Request Queue

Before adding a service request, the related student must exist.

Add the first request using:

```text
Option 5 – Add Service Request to Queue
```

Enter:

```text
Student ID   : 1001
Request Type : Transcript Request
```

Add another request:

```text
Student ID   : 1001
Request Type : Examination Inquiry
```

### Expected Result

The Queue follows FIFO.

Therefore, the expected processing order is:

```text
1. Transcript Request
2. Examination Inquiry
```

When **Option 6 – Process Next Service Request** is selected, `Transcript Request` should be processed first.

### 17.2 Recent Action Stack

After performing several operations, select:

```text
Option 7 – Display Recent Actions using Stack
```

Example actions may include:

```text
Student Added
Service Request Added
Service Request Processed
```

### Expected Result

The most recent action should be displayed first because the Stack follows LIFO.

---

## 18. Campus Graph Examples

### 18.1 Campus Locations

Use:

```text
Option 10 – Add Campus Location
```

Add:

```text
Main Gate
Library
Cafeteria
Computer Lab
Lecture Hall
```

### 18.2 Campus Connections

Use:

```text
Option 12 – Add Campus Connection/Road
```

Create:

```text
Main Gate <-> Library
Library <-> Cafeteria
Library <-> Computer Lab
Cafeteria <-> Lecture Hall
Computer Lab <-> Lecture Hall
```

### 18.3 Display Campus Connections

Use:

```text
Option 14 – Display Campus Connections
```

Example:

```text
Main Gate -> Library
Library -> Main Gate, Cafeteria, Computer Lab
Cafeteria -> Library, Lecture Hall
Computer Lab -> Library, Lecture Hall
Lecture Hall -> Cafeteria, Computer Lab
```

### 18.4 BFS Example

Use:

```text
Option 15 – Traverse Campus Locations using BFS or DFS
```

Select:

```text
1 – BFS
```

Starting location:

```text
Main Gate
```

A possible traversal is:

```text
Main Gate
Library
Cafeteria
Computer Lab
Lecture Hall
```

BFS visits connected locations level by level.

### 18.5 DFS Example

Use Option 15 again.

Select:

```text
2 – DFS
```

Starting location:

```text
Main Gate
```

A possible traversal is:

```text
Main Gate
Library
Cafeteria
Lecture Hall
Computer Lab
```

DFS explores one path before moving to another path.

---

## 19. Testing and Validation

The complete application was tested after final integration.

### 19.1 Student Management Testing

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

### 19.2 Marks Validation

**Valid Examples:**

```text
0
50
78
100
```

**Invalid Examples:**

```text
-1
101
120
abc
```

### 19.3 Duplicate Student ID

If Student ID `1001` already exists, attempting to add `1001` again should be rejected.

### 19.4 Invalid Numeric Input

If:

```text
abc
```

is entered when a number is required, the system should display an error and request valid input.

### 19.5 Missing Student

Search for:

```text
9999
```

The system should indicate that the student does not exist.

### 19.6 Stack Testing

The Stack was tested by:

- Adding multiple system actions.
- Displaying recent actions.
- Confirming LIFO behaviour.
- Testing an empty Stack.

### 19.7 Queue Testing

The Queue was tested by:

- Adding multiple service requests.
- Processing service requests.
- Confirming FIFO behaviour.
- Testing an empty Queue.

### 19.8 BST Testing

The BST was tested by:

- Inserting multiple students.
- Searching for students.
- Displaying students using In-order Traversal.
- Deleting students.

### 19.9 Hash Table Testing

The Hash Table was tested by:

- Inserting students.
- Searching using Student ID.
- Handling collisions using Linear Probing.
- Deleting students.

### 19.10 Graph Testing

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

### 19.11 Duplicate Campus Location

Add:

```text
Library
```

twice.

The second attempt should be rejected.

### 19.12 Missing Campus Location

Try to connect:

```text
Library <-> Sports Complex
```

without adding `Sports Complex`.

The system should indicate that one or both locations do not exist.

### 19.13 Self-Connection

Try:

```text
Library <-> Library
```

The system should prevent a location from connecting to itself.

### 19.14 Empty Queue

Select Option 6 when no service requests are available.

The system should display an appropriate message.

### 19.15 Empty Stack

Display recent actions when no actions are available.

The system should display an appropriate message.

---

## 20. Complete Demonstration Flow

The following sequence can be used to demonstrate the complete system:

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
10 -> Add more Campus Locations
12 -> Add Campus Connection/Road
14 -> Display Campus Connections
15 -> Perform BFS Traversal
15 -> Perform DFS Traversal
3  -> Delete Student Record
4  -> Confirm deletion from Linked List
8  -> Confirm deletion from BST
9  -> Confirm deletion from Hash Table
16 -> Exit
```

---

## 21. Console Navigation

After completing an operation, the application displays:

```text
Press Enter to return to Main Menu...
```

This allows the user to review the output before returning to the Main Menu.

The application continues running until:

```text
16. Exit
```

is selected.

---

## 22. Key Learning Outcomes

This project demonstrates practical knowledge of:

- Object-Oriented Programming in Java
- Linked List implementation
- Stack implementation
- Queue implementation
- Binary Search Tree operations
- Hashing
- Collision handling using Linear Probing
- Graph representation using an Adjacency List
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

## 23. Conclusion

The **University Student Record and Campus Route Management System** demonstrates how different Data Structures and Algorithms can be combined to solve a practical university management problem.

The Linked List manages student records, the Stack maintains recent system actions, the Queue processes student service requests, the Binary Search Tree organizes student records, and the Hash Table provides efficient Student ID searching.

The Graph represents campus locations and roads, while BFS and DFS provide different methods for traversing campus locations.

The final system combines all these components through a menu-driven Java console application with input validation and error handling.

The project also demonstrates collaborative software development using GitHub feature branches, individual commits, Pull Requests, merging, and final system integration.

---
