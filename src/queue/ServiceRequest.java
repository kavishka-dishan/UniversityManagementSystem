package queue;

public class ServiceRequest {

    private int requestId;
    private int studentId;
    private String requestType;

    public ServiceRequest(int requestId, int studentId, String requestType) {
        this.requestId = requestId;
        this.studentId = studentId;
        this.requestType = requestType;
    }

    public int getRequestId() {
        return requestId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getRequestType() {
        return requestType;
    }

    public void displayRequest() {
        System.out.println("------------------------------------------");
        System.out.println("Request ID   : " + requestId);
        System.out.println("Student ID   : " + studentId);
        System.out.println("Request Type : " + requestType);
    }
}