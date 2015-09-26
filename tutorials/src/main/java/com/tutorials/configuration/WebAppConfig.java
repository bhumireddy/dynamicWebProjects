package com.tutorials.configuration;

//import java.util.Properties;

import javax.annotation.Resource;
//import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate4.HibernateTransactionManager;
//import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("com.simplesite")
@EnableWebMvc
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class WebAppConfig {

	// Database
//	private static final String DB_DRIVER = "db.driver";
//	private static final String DB_URL = "db.url";
//	private static final String DB_USERNAME = "db.username";
//	private static final String DB_PASSWORD = "db.password";
//	
//	private static final String HB_DIALECT = "hibernate.dialect";
//	private static final String HB_SHOW_SQL = "hibernate.show_sql";
//	private static final String ENTITI_MANAGER_BASE_PACKAGE = "entitymanager.packages.to.scanl";
	
	@Resource
	private Environment env;
	

//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//		dataSource.setDriverClassName(env.getRequiredProperty(DB_DRIVER));
//		dataSource.setUrl(env.getRequiredProperty(DB_URL));
//		dataSource.setUsername(env.getRequiredProperty(DB_USERNAME));
//		dataSource.setPassword(env.getRequiredProperty(DB_PASSWORD));
//
//		return dataSource;
//	}
//	
//	
//	private Properties hibProperties() {
//		Properties properties = new Properties();
//		properties.put(HB_DIALECT, env.getRequiredProperty(HB_DIALECT));
//		properties.put(HB_SHOW_SQL, env.getRequiredProperty(HB_SHOW_SQL));
//		return properties;	
//	}
//
//	
//	@Bean
//	public LocalSessionFactoryBean sessionFactory() {
//		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
//		sessionFactoryBean.setDataSource(dataSource());
//		sessionFactoryBean.setPackagesToScan(env.getRequiredProperty(ENTITI_MANAGER_BASE_PACKAGE));
//		sessionFactoryBean.setHibernateProperties(hibProperties());
//		return sessionFactoryBean;
//	}
//	
//	@Bean
//	public HibernateTransactionManager transactionManager() {
//		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
//		transactionManager.setSessionFactory(sessionFactory().getObject());
//		return transactionManager;
//	}
	
	
	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

}
