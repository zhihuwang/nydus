package sk.javot.nydus.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(
    name="status",
    urlPatterns = { "/status" }
)
public class StatusServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().print("OK");
    }
}
