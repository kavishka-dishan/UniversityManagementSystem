package hashing;

import student.Student;

public class StudentHashTable {

    private Student[] table;
    private int tableSize;

    public StudentHashTable(int tableSize) {
        this.tableSize = tableSize;
        table = new Student[tableSize];
    }

    private int hashFunction(int studentId) {
        return Math.abs(studentId) % tableSize;
    }

    public boolean insert(Student student) {

        if (student == null) {
            return false;
        }

        if (search(student.getStudentId()) != null) {
            System.out.println("Student ID already exists in hash table.");
            return false;
        }

        int index = hashFunction(student.getStudentId());
        int startIndex = index;

        do {

            if (table[index] == null) {
                table[index] = student;
                return true;
            }

            index = (index + 1) % tableSize;

        } while (index != startIndex);

        System.out.println("Hash table is full.");
        return false;
    }

    public Student search(int studentId) {

        int index = hashFunction(studentId);
        int startIndex = index;

        do {

            if (table[index] != null &&
                table[index].getStudentId() == studentId) {

                return table[index];
            }

            index = (index + 1) % tableSize;

        } while (index != startIndex);

        return null;
    }

    public void displayTable() {

        System.out.println("========== HASH TABLE ==========");

        for (int i = 0; i < tableSize; i++) {

            System.out.print("Index " + i + ": ");

            if (table[i] == null) {
                System.out.println("Empty");
            } else {
                System.out.println(
                    "ID = " + table[i].getStudentId()
                    + ", Name = " + table[i].getName()
                );
            }
        }
    }
}