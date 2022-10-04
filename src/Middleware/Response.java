package Middleware;

public class Response {
    private final String status;

    public Response(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
