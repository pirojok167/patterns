package Middleware;

import java.util.ArrayList;

public class Application {
    private final Handler handler;
    private final ArrayList<Middleware> middlewares;

    public Application(Handler handler, ArrayList<Middleware> middlewares) {
        this.handler = handler;
        this.middlewares = middlewares;
    }

    public static void main(String[] args) {
        Application application = new Application(
                new BusinessLogic(),
                new ArrayList<>(){{
                    add(new Logger());
                    add(new Validator());
                }}
        );

        Request request = new Request(2);
        Response response = application.handle(request);

        System.out.println(response.getStatus());
    }

    public Response handle(Request request) {
        return (new Pipeline(handler, middlewares)).handle(request);
    }
}
