package by.tms.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "UserFilter", servletNames = {"HistoryServlet", "CalcServlet", "PersonAccountServlet"})
public class UserFilter extends HttpFilter {

     @Override
     protected void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws IOException, ServletException {
          if (req.getSession().getAttribute("currentUser") == null) {
               req.setAttribute("flagTwo", true);
               req.getRequestDispatcher("/errorUser.jsp").forward(req, resp);
          } else {
               chain.doFilter(req, resp);
          }
     }
}
