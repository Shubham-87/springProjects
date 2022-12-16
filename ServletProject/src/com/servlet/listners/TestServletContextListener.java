package com.servlet.listners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//ServletContextListener to set context-param
@WebListener
public class TestServletContextListener implements ServletContextListener /*marker interface*/{
		
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContextListener.super.contextInitialized(sce);
		//Setting context param
		sce.getServletContext().setAttribute("OfficeName", "Google");
		
	}
	
}
