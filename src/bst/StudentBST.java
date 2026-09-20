package bst;

import student.Student;

public class StudentBST {

    private StudentTreeNode root;

    public StudentBST() {
        root = null;
    }

    public boolean insert(Student student) {

        if (student == null) {
            return false;
        }

        StudentTreeNode newNode = new StudentTreeNode(student);

        if (root == null) {
            root = newNode;
            return true;
        }

        StudentTreeNode current = root;
        StudentTreeNode parent;

        while (true) {

            parent = current;

            if (student.getStudentId() == current.getStudent().getStudentId()) {
                System.out.println("Student ID already exists in BST.");
                return false;
            }

            if (student.getStudentId() < current.getStudent().getStudentId()) {

                current = current.getLeft();

                if (current == null) {
                    parent.setLeft(newNode);
                    return true;
                }

            } else {

                current = current.getRight();

                if (current == null) {
                    parent.setRight(newNode);
                    return true;
                }
            }
        }
    }

    public Student search(int studentId) {

        StudentTreeNode current = root;

        while (current != null) {

            if (studentId == current.getStudent().getStudentId()) {
                return current.getStudent();
            }

            if (studentId < current.getStudent().getStudentId()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }

        return null;
    }

    public boolean delete(int studentId) {

        if (search(studentId) == null) {
            return false;
        }

        root = deleteRecursive(root, studentId);
        return true;
    }

    private StudentTreeNode deleteRecursive(StudentTreeNode node, int studentId) {

        if (node == null) {
            return null;
        }

        if (studentId < node.getStudent().getStudentId()) {

            node.setLeft(deleteRecursive(node.getLeft(), studentId));

        } else if (studentId > node.getStudent().getStudentId()) {

            node.setRight(deleteRecursive(node.getRight(), studentId));

        } else {

            if (node.getLeft() == null) {
                return node.getRight();
            }

            if (node.getRight() == null) {
                return node.getLeft();
            }

            StudentTreeNode successor = findMinimum(node.getRight());

            node.setStudent(successor.getStudent());

            node.setRight(
                    deleteRecursive(
                            node.getRight(),
                            successor.getStudent().getStudentId()
                    )
            );
        }

        return node;
    }

    private StudentTreeNode findMinimum(StudentTreeNode node) {

        while (node.getLeft() != null) {
            node = node.getLeft();
        }

        return node;
    }

    public void inOrder() {

        if (root == null) {
            System.out.println("BST is empty.");
            return;
        }

        System.out.println("\n========== STUDENTS USING BST ==========");
        inOrderRecursive(root);
        System.out.println("------------------------------------------");
    }

    private void inOrderRecursive(StudentTreeNode node) {

        if (node != null) {
            inOrderRecursive(node.getLeft());
            node.getStudent().displayStudent();
            inOrderRecursive(node.getRight());
        }
    }

    public void preOrder() {
        preOrderRecursive(root);
    }

    private void preOrderRecursive(StudentTreeNode node) {

        if (node != null) {
            node.getStudent().displayStudent();
            preOrderRecursive(node.getLeft());
            preOrderRecursive(node.getRight());
        }
    }

    public void postOrder() {
        postOrderRecursive(root);
    }

    private void postOrderRecursive(StudentTreeNode node) {

        if (node != null) {
            postOrderRecursive(node.getLeft());
            postOrderRecursive(node.getRight());
            node.getStudent().displayStudent();
        }
    }

    public boolean isEmpty() {
        return root == null;
    }
}