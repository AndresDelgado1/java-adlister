import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/profile.jsp").forward(request, response);

        if (request.getSession().getAttribute("user") != null) {
            request.setAttribute("adminName", "Andres");
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
//            response.sendRedirect("/WEB-INF/profile.jsp");
        } else{
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
