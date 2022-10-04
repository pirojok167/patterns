package Middleware;

public class BusinessLogic implements Handler {
    @Override
    public Response handle(Request request) {
        return new Response("Success");
    }
}
