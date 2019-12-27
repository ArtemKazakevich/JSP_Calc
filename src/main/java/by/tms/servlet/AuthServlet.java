package by.tms.servlet;

import by.tms.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AuthServlet", urlPatterns = "/auth")
public class AuthServlet extends HttpServlet {
     
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          request.setCharacterEncoding("UTF-8");
          
          String login = request.getParameter("login");
          String pass = request.getParameter("pass");
          
          User user = new User();
          user.setLogin(login);
          user.setPassword(pass);
          
          for (User user1 : ((List<User>) getServletContext().getAttribute("userList"))) {
               if (user1.equals(user)) {
                    request.getSession().setAttribute("currentUser", user1);
                    request.getSession().setAttribute("history", new ArrayList<>());
               }
               else {
                    request.setAttribute("flagOne", true);
                    request.getRequestDispatcher("/errorUser.jsp").forward(request, response);
               }
          }
     
          response.sendRedirect("/auth");
     }
     
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          req.getRequestDispatcher("/authentication.jsp").forward(req, resp);
     }
}
