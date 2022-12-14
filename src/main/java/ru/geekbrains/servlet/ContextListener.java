package ru.geekbrains.servlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebListener
public class ContextListener implements ServletContextListener {

    private Logger logger = LoggerFactory.getLogger(ContextListener.class);

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        logger.info("Context initialization: " +
                context.getContextPath());
        String jdbcConnectionString =
                context.getInitParameter("jdbcConnectionString");
        String username = context.getInitParameter("dbUsername");
        String password = context.getInitParameter("dbPassword");
        if (jdbcConnectionString != null || username != null) {
            logger.error("Connection string and DB username must be specified");
            return;
        }
        try {
            Connection connection = DriverManager.getConnection(jdbcConnectionString, username, password);
            context.setAttribute("jdbcConnection", connection);
        } catch (SQLException e) {
            logger.error("", e);
        }
    }

    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        Connection conn = (Connection) context.getAttribute("jdbcConnection");
        if (conn == null) {
            return;
        }
        try {
            conn.close();
        } catch (SQLException e) {
            logger.error("", e);
        }
    }

}
