package by.tms.servlet;

import by.tms.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "RegServlet", urlPatterns = "/reg")
public class RegServlet extends HttpServlet {
     
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          request.setCharacterEncoding("UTF-8");
          
          String name = request.getParameter("name");
          String login = request.getParameter("login");
          String age = request.getParameter("age");
          String pass = request.getParameter("pass");
          
          request.getSession().setAttribute("name", name);
          
          User user = new User(name, login, Integer.parseInt(age), pass);
          request.getSession().setAttribute("user", user);
          
          List<User> userList = (List<User>) getServletContext().getAttribute("userList");
          userList.add(user);
          request.getSession().setAttribute("userList", userList);
          
          response.sendRedirect("/reg");
     }
     
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          req.getRequestDispatcher("/registration.jsp").forward(req, resp);
     }
}
