package bst;

import student.Student;

public class StudentTreeNode {

    private Student student;
    private StudentTreeNode left;
    private StudentTreeNode right;

    public StudentTreeNode(Student student) {
        this.student = student;
        this.left = null;
        this.right = null;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentTreeNode getLeft() {
        return left;
    }

    public void setLeft(StudentTreeNode left) {
        this.left = left;
    }

    public StudentTreeNode getRight() {
        return right;
    }

    public void setRight(StudentTreeNode right) {
        this.right = right;
    }
}