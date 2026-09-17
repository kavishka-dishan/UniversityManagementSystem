package linkedlist;

import student.Student;
import student.StudentNode;

public class StudentLinkedList {

    private StudentNode head;

    public StudentLinkedList() {
        head = null;
    }

    // Add a new student
    public boolean addStudent(Student student) {

        if (student == null) {
            System.out.println("Invalid student record.");
            return false;
        }

        // Check duplicate Student ID
        if (searchStudent(student.getStudentId()) != null) {
            System.out.println(
                    "Student ID " + student.getStudentId() + " already exists."
            );
            return false;
        }

        StudentNode newNode = new StudentNode(student);

        if (head == null) {
            head = newNode;
        } else {
            StudentNode current = head;

            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(newNode);
        }

        System.out.println("Student added successfully.");
        return true;
    }

    // Search student by ID
    public Student searchStudent(int studentId) {

        StudentNode current = head;

        while (current != null) {

            if (current.getStudent().getStudentId() == studentId) {
                return current.getStudent();
            }

            current = current.getNext();
        }

        return null;
    }

    // Update student
    public boolean updateStudent(int studentId,
                                 String name,
                                 String programme,
                                 double marks) {

        Student student = searchStudent(studentId);

        if (student == null) {
            System.out.println(
                    "Student with ID " + studentId + " was not found."
            );
            return false;
        }

        student.setName(name);
        student.setProgramme(programme);
        student.setMarks(marks);

        System.out.println("Student updated successfully.");
        return true;
    }

    // Delete student
    public boolean deleteStudent(int studentId) {

        if (head == null) {
            System.out.println("No student records available.");
            return false;
        }

        // Delete first node
        if (head.getStudent().getStudentId() == studentId) {
            head = head.getNext();

            System.out.println("Student deleted successfully.");
            return true;
        }

        StudentNode current = head;

        while (current.getNext() != null) {

            if (current.getNext().getStudent().getStudentId() == studentId) {

                current.setNext(current.getNext().getNext());

                System.out.println("Student deleted successfully.");
                return true;
            }

            current = current.getNext();
        }

        System.out.println(
                "Student with ID " + studentId + " was not found."
        );

        return false;
    }

    // Display all students
    public void displayAllStudents() {

        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println();
        System.out.println("========== STUDENT RECORDS ==========");

        StudentNode current = head;

        while (current != null) {

            current.getStudent().displayStudent();

            current = current.getNext();
        }

        System.out.println("------------------------------------------");
    }

    // Check whether list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Return number of students
    public int getStudentCount() {

        int count = 0;
        StudentNode current = head;

        while (current != null) {
            count++;
            current = current.getNext();
        }

        return count;
    }
}