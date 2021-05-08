package demo.filters;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "demo.filters.DemoServlet")
public class DemoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String _username = request.getParameter("username");
        String _password = request.getParameter("password");
        if(_username == null)
        {
            this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }else{
            out.println("Bienvenue " + _username);
        }
    }
}
