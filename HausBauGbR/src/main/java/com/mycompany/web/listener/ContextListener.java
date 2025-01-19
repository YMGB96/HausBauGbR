package com.mycompany.web.listener;

import com.mycompany.utils.HibernateUtil;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


@WebListener()
public class ContextListener implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent sce) 
    { 
        System.out.println("---------------------------------------------"); 
        System.out.println(">>> Application-Start"); 
        System.out.println("---------------------------------------------"); 
        System.out.println("Database --> " + HibernateUtil.getDbVersion());
    }

    
    @Override
    public void contextDestroyed(ServletContextEvent sce) 
    { 
        System.out.println("---------------------------------------------"); 
        System.out.println(">>> Application-Shutdown"); 
        System.out.println("---------------------------------------------"); 
    }


}
