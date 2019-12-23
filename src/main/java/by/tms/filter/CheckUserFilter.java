package by.tms.filter;

import by.tms.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebFilter(filterName = "CheckUserFilter", servletNames = {"AuthServlet"})
public class CheckUserFilter extends HttpFilter {

     public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws ServletException, IOException {

          User user = (User) getServletContext().getAttribute("currentUser");

          for (User user1 : ((List<User>) getServletContext().getAttribute("userList"))) {
               if (!(user1.equals(user))) {
                    chain.doFilter(req, resp);
               } else {
                    req.getRequestDispatcher("/errorCheckUser.jsp").forward(req, resp);
               }

          }
     }
}
