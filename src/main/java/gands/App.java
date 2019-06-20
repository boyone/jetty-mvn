package gands;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;

public class App {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ContextHandler context = new ContextHandler();
        context.setContextPath(Hello.path);
        context.setHandler(new Hello());

        server.setHandler(context);

        server.start();
        server.join();
    }
}
