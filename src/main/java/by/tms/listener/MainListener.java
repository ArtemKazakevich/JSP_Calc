package by.tms.listener;

import by.tms.entity.User;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.ArrayList;
import java.util.List;

@WebListener()
public class MainListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {
     
     // Public constructor is required by servlet spec
     public MainListener() {
     }
     
     // -------------------------------------------------------
     // ServletContextListener implementation
     // -------------------------------------------------------
     public void contextInitialized(ServletContextEvent sce) {
          List<User> users = new ArrayList<>();
          sce.getServletContext().setAttribute("userList", users);
     }
     
     public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
     }
     
     // -------------------------------------------------------
     // HttpSessionListener implementation
     // -------------------------------------------------------
     public void sessionCreated(HttpSessionEvent se) {
          List<String> history = new ArrayList<>();
          se.getSession().setAttribute("history", history);
     }
     
     public void sessionDestroyed(HttpSessionEvent se) {
          /* Session is destroyed. */
     }
     
     // -------------------------------------------------------
     // HttpSessionAttributeListener implementation
     // -------------------------------------------------------
     
     public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
     }
     
     public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
     }
     
     public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attribute
         is replaced in a session.
      */
     }
}
