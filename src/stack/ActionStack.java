package stack;

public class ActionStack {

    private String[] actions;
    private int top;
    private int maxSize;

    public ActionStack(int size) {
        maxSize = size;
        actions = new String[maxSize];
        top = -1;
    }

    public boolean push(String action) {
        if (isFull()) {
            System.out.println("Action stack is full.");
            return false;
        }

        actions[++top] = action;
        return true;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("No recent actions available.");
            return null;
        }

        return actions[top--];
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }

        return actions[top];
    }

    public void displayActions() {
        if (isEmpty()) {
            System.out.println("No recent actions available.");
            return;
        }

        System.out.println("\n========== RECENT ACTIONS ==========");

        for (int i = top; i >= 0; i--) {
            System.out.println(actions[i]);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }
}