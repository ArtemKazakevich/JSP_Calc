package by.tms.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "AuthCheckFilter", servletNames = {"AuthServlet"})
public class AuthCheckFilter extends HttpFilter {
     
     public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws ServletException, IOException {
          if (req.getSession().getAttribute("userList") == null) {
               req.setAttribute("flagThree", true);
               req.getRequestDispatcher("/errorUser.jsp").forward(req, resp);
          } else {
               chain.doFilter(req, resp);
          }
     }
}
