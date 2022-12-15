import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Counter", urlPatterns = "/counter")
public class Counter extends HttpServlet {
private int counter = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        counter += 1;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>The count is " + counter + "</h2>");
    }

}
