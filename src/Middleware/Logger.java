package Middleware;

public class Logger implements Middleware {

    @Override
    public Response handle(Request request, Handler handler) {
        System.out.println("Log request");

        return handler.handle(request);
    }
}
