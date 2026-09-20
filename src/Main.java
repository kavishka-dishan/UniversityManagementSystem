import java.util.Scanner;

import student.Student;
import linkedlist.StudentLinkedList;
import stack.ActionStack;
import queue.ServiceRequest;
import queue.ServiceRequestQueue;
import bst.StudentBST;
import hashing.StudentHashTable;
import graph.CampusGraph;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final StudentLinkedList studentList =
            new StudentLinkedList();

    private static final ActionStack actionStack =
            new ActionStack(100);

    private static final ServiceRequestQueue serviceQueue =
            new ServiceRequestQueue(100);

    private static final StudentBST studentBST =
            new StudentBST();

    private static final StudentHashTable hashTable =
            new StudentHashTable(101);

    private static final CampusGraph campusGraph =
            new CampusGraph();

    private static int nextRequestId = 1;

    public static void main(String[] args) {

        int choice;

        System.out.println("==============================================");
        System.out.println("   UNIVERSITY STUDENT & CAMPUS MANAGEMENT");
        System.out.println("==============================================");

        do {

            displayMenu();

            choice = readInt("Enter your choice: ");

            System.out.println();

            switch (choice) {

                case 1:
                    addStudent();
                    pressEnterToContinue();
                    break;

                case 2:
                    updateStudent();
                    pressEnterToContinue();
                    break;

                case 3:
                    deleteStudent();
                    pressEnterToContinue();
                    break;

                case 4:
                    studentList.displayAllStudents();
                    pressEnterToContinue();
                    break;

                case 5:
                    addServiceRequest();
                    pressEnterToContinue();
                    break;

                case 6:
                    processServiceRequest();
                    pressEnterToContinue();
                    break;

                case 7:
                    actionStack.displayActions();
                    pressEnterToContinue();
                    break;

                case 8:
                    studentBST.inOrder();
                    pressEnterToContinue();
                    break;

                case 9:
                    searchUsingHashing();
                    pressEnterToContinue();
                    break;

                case 10:
                    addCampusLocation();
                    pressEnterToContinue();
                    break;

                case 11:
                    removeCampusLocation();
                    pressEnterToContinue();
                    break;

                case 12:
                    addCampusConnection();
                    pressEnterToContinue();
                    break;

                case 13:
                    removeCampusConnection();
                    pressEnterToContinue();
                    break;

                case 14:
                    campusGraph.displayGraph();
                    pressEnterToContinue();
                    break;

                case 15:
                    traverseCampus();
                    pressEnterToContinue();
                    break;

                case 16:
                    System.out.println("==============================================");
                    System.out.println("Exiting system...");
                    System.out.println("Thank you.");
                    System.out.println("==============================================");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please enter a number from 1 to 16."
                    );
                    pressEnterToContinue();
            }

        } while (choice != 16);

        scanner.close();
    }

    // ================= MAIN MENU =================

    private static void displayMenu() {

        System.out.println();
        System.out.println("============== MAIN MENU ==============");
        System.out.println("1.  Add Student Record");
        System.out.println("2.  Update Student Record");
        System.out.println("3.  Delete Student Record");
        System.out.println("4.  Display All Records using Linked List");
        System.out.println("5.  Add Service Request to Queue");
        System.out.println("6.  Process Next Service Request");
        System.out.println("7.  Display Recent Actions using Stack");
        System.out.println("8.  Display Students using BST");
        System.out.println("9.  Search Student using Hashing");
        System.out.println("10. Add Campus Location");
        System.out.println("11. Remove Campus Location");
        System.out.println("12. Add Campus Connection/Road");
        System.out.println("13. Remove Campus Connection/Road");
        System.out.println("14. Display Campus Connections");
        System.out.println("15. Traverse Campus Locations using BFS or DFS");
        System.out.println("16. Exit");
        System.out.println("=======================================");
    }

    // ================= STUDENT OPERATIONS =================

    private static void addStudent() {

        System.out.println("========== ADD STUDENT ==========");

        int studentId = readPositiveInt("Enter Student ID: ");

        if (studentList.searchStudent(studentId) != null) {
            System.out.println("Student ID already exists.");
            return;
        }

        String name =
                readNonEmptyString("Enter Student Name: ");

        String programme =
                readNonEmptyString("Enter Programme: ");

        double marks = readMarks();

        Student student =
                new Student(studentId, name, programme, marks);

        if (studentList.addStudent(student)) {

            studentBST.insert(student);
            hashTable.insert(student);

            actionStack.push(
                    "Added student - ID: "
                    + studentId
                    + ", Name: "
                    + name
            );
        }
    }

    private static void updateStudent() {

        System.out.println("========== UPDATE STUDENT ==========");

        int studentId =
                readPositiveInt("Enter Student ID: ");

        Student student =
                studentList.searchStudent(studentId);

        if (student == null) {
            System.out.println("Student record was not found.");
            return;
        }

        System.out.println();
        System.out.println("Current Student Details:");
        student.displayStudent();

        System.out.println();

        String name =
                readNonEmptyString("Enter New Name: ");

        String programme =
                readNonEmptyString("Enter New Programme: ");

        double marks = readMarks();

        if (studentList.updateStudent(
                studentId,
                name,
                programme,
                marks)) {

            /*
             * Linked List, BST and Hash Table contain
             * references to the same Student object.
             * Therefore updating the Student object keeps
             * all three structures synchronized.
             */

            actionStack.push(
                    "Updated student - ID: " + studentId
            );
        }
    }

    private static void deleteStudent() {

        System.out.println("========== DELETE STUDENT ==========");

        int studentId =
                readPositiveInt("Enter Student ID: ");

        Student student =
                studentList.searchStudent(studentId);

        if (student == null) {
            System.out.println("Student record was not found.");
            return;
        }

        String studentName = student.getName();

        if (studentList.deleteStudent(studentId)) {

            studentBST.delete(studentId);
            hashTable.delete(studentId);

            actionStack.push(
                    "Deleted student - ID: "
                    + studentId
                    + ", Name: "
                    + studentName
            );
        }
    }

    // ================= QUEUE OPERATIONS =================

    private static void addServiceRequest() {

        System.out.println("========== ADD SERVICE REQUEST ==========");

        int studentId =
                readPositiveInt("Enter Student ID: ");

        if (studentList.searchStudent(studentId) == null) {

            System.out.println(
                    "Student record was not found. "
                    + "Request cannot be added."
            );

            return;
        }

        String requestType =
                readNonEmptyString("Enter Request Type: ");

        ServiceRequest request =
                new ServiceRequest(
                        nextRequestId,
                        studentId,
                        requestType
                );

        if (serviceQueue.enqueue(request)) {

            actionStack.push(
                    "Added service request - Request ID: "
                    + nextRequestId
                    + ", Student ID: "
                    + studentId
            );

            System.out.println(
                    "Request ID: " + nextRequestId
            );

            nextRequestId++;
        }
    }

    private static void processServiceRequest() {

        System.out.println(
                "========== PROCESS SERVICE REQUEST =========="
        );

        ServiceRequest request =
                serviceQueue.dequeue();

        if (request != null) {

            System.out.println();
            System.out.println("Processing Request:");

            request.displayRequest();

            actionStack.push(
                    "Processed service request - Request ID: "
                    + request.getRequestId()
            );
        }
    }

    // ================= HASHING =================

    private static void searchUsingHashing() {

        System.out.println("========== HASH SEARCH ==========");

        int studentId =
                readPositiveInt("Enter Student ID: ");

        Student student =
                hashTable.search(studentId);

        if (student == null) {

            System.out.println(
                    "Student record was not found."
            );

        } else {

            System.out.println();
            System.out.println(
                    "Student found using Hash Table:"
            );

            student.displayStudent();
        }
    }

    // ================= GRAPH OPERATIONS =================

    private static void addCampusLocation() {

        System.out.println(
                "========== ADD CAMPUS LOCATION =========="
        );

        String location =
                readNonEmptyString(
                        "Enter Location Name: "
                );

        if (campusGraph.addLocation(location)) {

            actionStack.push(
                    "Added campus location - "
                    + location
            );
        }
    }

    private static void removeCampusLocation() {

        System.out.println(
                "========== REMOVE CAMPUS LOCATION =========="
        );

        String location =
                readNonEmptyString(
                        "Enter Location Name: "
                );

        if (campusGraph.removeLocation(location)) {

            actionStack.push(
                    "Removed campus location - "
                    + location
            );
        }
    }

    private static void addCampusConnection() {

        System.out.println(
                "========== ADD CAMPUS CONNECTION =========="
        );

        String location1 =
                readNonEmptyString(
                        "Enter First Location: "
                );

        String location2 =
                readNonEmptyString(
                        "Enter Second Location: "
                );

        if (campusGraph.addConnection(
                location1,
                location2)) {

            actionStack.push(
                    "Added campus connection - "
                    + location1
                    + " <-> "
                    + location2
            );
        }
    }

    private static void removeCampusConnection() {

        System.out.println(
                "========== REMOVE CAMPUS CONNECTION =========="
        );

        String location1 =
                readNonEmptyString(
                        "Enter First Location: "
                );

        String location2 =
                readNonEmptyString(
                        "Enter Second Location: "
                );

        if (campusGraph.removeConnection(
                location1,
                location2)) {

            actionStack.push(
                    "Removed campus connection - "
                    + location1
                    + " <-> "
                    + location2
            );
        }
    }

    private static void traverseCampus() {

        System.out.println(
                "========== CAMPUS TRAVERSAL =========="
        );

        System.out.println("1. BFS - Breadth First Search");
        System.out.println("2. DFS - Depth First Search");

        int traversalChoice =
                readInt("Select Traversal Method: ");

        if (traversalChoice != 1
                && traversalChoice != 2) {

            System.out.println(
                    "Invalid traversal option."
            );

            return;
        }

        String startLocation =
                readNonEmptyString(
                        "Enter Starting Location: "
                );

        System.out.println();

        if (traversalChoice == 1) {

            campusGraph.bfs(startLocation);

        } else {

            campusGraph.dfs(startLocation);
        }
    }

    // ================= INPUT VALIDATION =================

    private static int readInt(String message) {

        while (true) {

            System.out.print(message);

            String input =
                    scanner.nextLine().trim();

            try {

                return Integer.parseInt(input);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. "
                        + "Please enter a valid integer."
                );
            }
        }
    }

    private static int readPositiveInt(String message) {

        while (true) {

            int value = readInt(message);

            if (value > 0) {
                return value;
            }

            System.out.println(
                    "Value must be greater than zero."
            );
        }
    }

    private static double readMarks() {

        while (true) {

            System.out.print(
                    "Enter Marks (0 - 100): "
            );

            String input =
                    scanner.nextLine().trim();

            try {

                double marks =
                        Double.parseDouble(input);

                if (marks >= 0 && marks <= 100) {
                    return marks;
                }

                System.out.println(
                        "Invalid marks. "
                        + "Marks must be between 0 and 100."
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. "
                        + "Please enter a numeric value."
                );
            }
        }
    }

    private static String readNonEmptyString(
            String message) {

        while (true) {

            System.out.print(message);

            String value =
                    scanner.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println(
                    "Input cannot be empty."
            );
        }
    }

    // ================= PAUSE SCREEN =================

    private static void pressEnterToContinue() {

        System.out.println();
        System.out.print(
                "Press Enter to return to Main Menu..."
        );

        scanner.nextLine();

        System.out.println();
    }
}