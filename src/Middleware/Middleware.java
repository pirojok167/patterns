package Middleware;

public interface Middleware {
    public Response handle(Request request, Handler handler);
}
