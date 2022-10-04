package Middleware;

public class Validator implements Middleware {
    @Override
    public Response handle(Request request, Handler handler) {
        if (request.getId() == 1) {
            throw new RuntimeException("Not valid request id");
        }

        System.out.println("Validation success");

        return handler.handle(request);
    }
}
