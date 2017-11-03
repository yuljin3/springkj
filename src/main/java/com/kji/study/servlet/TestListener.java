package com.kji.study.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("web container stop");	
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("web container start");
	}

}
