package zenuo.demo.jib;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8000);
        server.setHandler(new AbstractHandler() {
            @Override
            public void handle(String s,
                               Request request,
                               HttpServletRequest httpServletRequest,
                               HttpServletResponse httpServletResponse) throws IOException {
                httpServletResponse.setContentType("text/html;charset=utf-8");
                httpServletResponse.setStatus(HttpServletResponse.SC_OK);
                request.setHandled(true);
                httpServletResponse.getWriter().println("Hello World!");
                httpServletResponse.getWriter().flush();
            }
        });

        server.start();
        server.join();
    }
}
