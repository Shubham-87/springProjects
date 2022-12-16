package com.servlet.listners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class TestServletAttributeListner
 *
 */
@WebListener
public class TestServletAttributeListner implements ServletContextAttributeListener, HttpSessionAttributeListener, ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public TestServletAttributeListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
         System.out.println("Attribute added in the servlet context");
         
         scae.getServletContext().getAttributeNames().asIterator().forEachRemaining(System.out::println);
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent scae)  {
    	

        System.out.println("Attribute removed in the servlet context");
        System.out.println(scae.getServletContext().getAttributeNames().toString());
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 

        System.out.println("Req Attribute removed.");
        System.out.println(srae.getServletRequest().getAttributeNames().toString());
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 

        System.out.println("Req Attribute added");
       // System.out.println(srae.getServletRequest().getAttributeNames().toString());
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 

        System.out.println("Req Attribute replaced in the servlet context");
        System.out.println(srae.getServletRequest().getAttributeNames());
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 

        System.out.println("Attribute added in the session binding");
        System.out.println(se.getSession().getAttributeNames().toString());
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 

        System.out.println("Attribute removed in the session bindning");
        System.out.println(se.getSession().getAttributeNames().toString());
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 

        System.out.println("Attribute replaced in the session bindning");
        System.out.println(se.getSession().getAttributeNames().toString());
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 

        System.out.println("Attribute replaced in the servlet context");
        System.out.println(scae.getServletContext().getAttributeNames().toString());
    }
	
}
