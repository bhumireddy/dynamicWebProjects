package com.tutorials.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext acwctx = new AnnotationConfigWebApplicationContext();
		acwctx.register(WebAppConfig.class);
		servletContext.addListener(new ContextLoaderListener(acwctx));
		acwctx.setServletContext(servletContext);
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(acwctx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
			
		
		
	}
	
	
}
