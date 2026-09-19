# University Student Record and Campus Route Management System

## CIT 300 – Data Structures and Algorithms
### Graded Practical Assignment 1

## 1. Project Overview

The University Student Record and Campus Route Management System is a Java console-based application developed to manage university student records, student service requests, and campus routes.

The main purpose of this project is to demonstrate the practical use of different data structures and algorithms in a real-world university management scenario.

The system uses:

- Linked List
- Stack
- Queue
- Binary Search Tree (BST)
- Hash Table
- Graph
- Breadth First Search (BFS)
- Depth First Search (DFS)

The application provides a menu-driven console interface with input validation and error handling.

---

## 2. Main Features

### Student Record Management

The system allows users to:

- Add student records
- Update student records
- Delete student records
- Display all student records
- Search students efficiently

Each student record contains:

- Student ID
- Name
- Programme
- Marks

---

### Service Request Management

Students can submit service requests to the system.

The Queue data structure is used to process requests according to the First-In-First-Out (FIFO) principle.

Examples of service requests:

- Transcript Request
- Student ID Card Replacement
- Registration Support
- Examination Inquiry

---

### Recent Action Management

A Stack is used to maintain recent system actions.

Examples include:

- Adding a student
- Updating a student
- Deleting a student
- Adding a service request
- Processing a service request
- Adding or removing campus locations
- Adding or removing campus connections

The most recent action is displayed first according to the Last-In-First-Out (LIFO) principle.

---

### Campus Route Management

A Graph data structure is used to represent campus locations and connections between them.

The system supports:

- Adding campus locations
- Removing campus locations
- Adding connections/roads
- Removing connections/roads
- Displaying campus connections
- Breadth First Search (BFS)
- Depth First Search (DFS)

An adjacency list is used to represent the graph.

---

## 3. Data Structures Used

### Linked List

The Linked List is used as the main structure for managing student records.

Implemented operations:

- Add student
- Update student
- Delete student
- Search student
- Display all students

---

### Stack

The Stack stores recent actions performed in the system.

Principle:

`Last-In-First-Out (LIFO)`

Main operations:

- Push
- Pop
- Peek
- Display recent actions

---

### Queue

The Queue manages student service requests.

Principle:

`First-In-First-Out (FIFO)`

Main operations:

- Enqueue
- Dequeue
- Peek
- Display pending requests

---

### Binary Search Tree (BST)

The Binary Search Tree organizes student records according to Student ID.

Implemented operations include:

- Insert
- Search
- Delete
- In-order traversal
- Pre-order traversal
- Post-order traversal

The main menu uses in-order traversal to display students in Student ID order.

---

### Hash Table

The Hash Table provides efficient student searching using Student ID.

The implementation uses:

- Student ID as the key
- Hash function
- Linear probing for collision handling

Implemented operations:

- Insert
- Search
- Delete

---

### Graph

The Graph represents campus locations and roads.

The implementation uses an adjacency list.

Implemented operations:

- Add location
- Remove location
- Add connection
- Remove connection
- Display connections
- BFS traversal
- DFS traversal

Campus connections are represented as undirected connections.

---

## 4. Menu Options

The application provides the following menu:

1. Add Student Record
2. Update Student Record
3. Delete Student Record
4. Display All Records using Linked List
5. Add Service Request to Queue
6. Process Next Service Request
7. Display Recent Actions using Stack
8. Display Students using BST
9. Search Student using Hashing
10. Add Campus Location
11. Remove Campus Location
12. Add Campus Connection/Road
13. Remove Campus Connection/Road
14. Display Campus Connections
15. Traverse Campus Locations using BFS or DFS
16. Exit

---

## 5. Input Validation and Error Handling

The application handles different invalid inputs and error conditions.

Examples include:

- Invalid menu selections
- Non-numeric input where a number is required
- Empty text input
- Invalid marks
- Marks below 0 or above 100
- Duplicate Student IDs
- Missing student records
- Duplicate campus locations
- Missing campus locations
- Duplicate campus connections
- Invalid campus connections
- Connecting a location to itself
- Removing unavailable connections
- Processing an empty service request queue
- Displaying an empty action stack

These validations help prevent the application from crashing because of common invalid user inputs.

---

## 6. Student Data Synchronization

Student information is maintained across multiple data structures.

When a student is added:

- The record is added to the Linked List.
- The record is inserted into the BST.
- The record is inserted into the Hash Table.

When a student is updated, the shared Student object keeps the relevant structures synchronized.

When a student is deleted:

- The student is removed from the Linked List.
- The student is removed from the BST.
- The student is removed from the Hash Table.

This keeps student information consistent across the system.

---

## 7. Project Structure

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
├── build.xml
├── manifest.mf
├── .gitignore
└── README.md
