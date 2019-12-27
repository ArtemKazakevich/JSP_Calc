package by.tms.servlet;

import by.tms.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ChangeServlet", urlPatterns = "/change")
public class ChangeServlet extends HttpServlet {
     
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          request.setCharacterEncoding("UTF-8");
          
          String name = request.getParameter("name");
          String login = request.getParameter("login");
          String age = request.getParameter("age");
          String pass = request.getParameter("pass");
          
          User currentUser = (User) request.getSession().getAttribute("currentUser");
          request.getSession().setAttribute("name", name);
          
          currentUser.setName(name);
          currentUser.setLogin(login);
          currentUser.setAge(Integer.parseInt(age));
          currentUser.setPassword(pass);
     
          response.sendRedirect("/change");
     }
     
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//          request.getRequestDispatcher("/change.jsp").forward(request, response);
          response.sendRedirect("/change.jsp");
     }
}
