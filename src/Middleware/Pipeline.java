package Middleware;

import java.util.ArrayList;

public class Pipeline implements Handler {
    private final Handler handler;
    private final ArrayList<Middleware> middlewares;
    public Pipeline(Handler handler, ArrayList<Middleware> middlewares) {
        this.handler = handler;
        this.middlewares = middlewares;
    }

    public Response handle(Request request) {
        try {
            Middleware middleware = middlewares.remove(0);
            return middleware.handle(request, this);
        } catch (IndexOutOfBoundsException e) {
            return handler.handle(request);
        }
    }
}
