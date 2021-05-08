package demo.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "/DemoServlet")
public class UsernameFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        HttpServletRequest request = (HttpServletRequest) req;
        String _username = request.getParameter("username");
        if(_username.equals("admin"))
        {
            chain.doFilter(req, resp);
        }else{
            out.println("Username incorrect");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
