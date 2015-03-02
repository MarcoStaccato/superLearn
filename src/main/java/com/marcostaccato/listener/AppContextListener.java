package com.marcostaccato.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext sc;
        String contextJSP;
        
        sc = event.getServletContext();
        sc.setAttribute("ctxJSP", sc.getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) { }
    
}
