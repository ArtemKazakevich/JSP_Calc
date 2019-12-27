package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PersonAccountServlet", urlPatterns = "/personAccount")
public class PersonAccountServlet extends HttpServlet {
     
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//          request.getRequestDispatcher("/personAccount.jsp").forward(request, response);
          response.sendRedirect("/personAccount.jsp");
     }
}
