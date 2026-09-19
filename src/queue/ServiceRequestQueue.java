package queue;

public class ServiceRequestQueue {

    private ServiceRequest[] requests;
    private int front;
    private int rear;
    private int size;
    private int maxSize;

    public ServiceRequestQueue(int maxSize) {
        this.maxSize = maxSize;
        requests = new ServiceRequest[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean enqueue(ServiceRequest request) {

        if (isFull()) {
            System.out.println("Service request queue is full.");
            return false;
        }

        rear = (rear + 1) % maxSize;
        requests[rear] = request;
        size++;

        System.out.println("Service request added successfully.");
        return true;
    }

    public ServiceRequest dequeue() {

        if (isEmpty()) {
            System.out.println("No service requests available.");
            return null;
        }

        ServiceRequest request = requests[front];
        requests[front] = null;

        front = (front + 1) % maxSize;
        size--;

        return request;
    }

    public ServiceRequest peek() {

        if (isEmpty()) {
            return null;
        }

        return requests[front];
    }

    public void displayRequests() {

        if (isEmpty()) {
            System.out.println("No pending service requests.");
            return;
        }

        System.out.println("\n========== PENDING SERVICE REQUESTS ==========");

        for (int i = 0; i < size; i++) {

            int index = (front + i) % maxSize;
            requests[index].displayRequest();
        }

        System.out.println("------------------------------------------");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public int getSize() {
        return size;
    }
}