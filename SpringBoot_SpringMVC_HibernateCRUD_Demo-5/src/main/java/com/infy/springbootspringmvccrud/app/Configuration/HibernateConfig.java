package com.infy.springbootspringmvccrud.app.Configuration;

import java.util.Properties;


import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class HibernateConfig {

	@Value("${db.driver}")
	private String DRIVER;
	@Value("${db.url}")
	private String URL;
	@Value("${db.username}")
	private String USERNAME;
	@Value("${db.password}")
	private String PASSWORD;
	@Value("${hp.dialect}")
	private String DIALECT;
	@Value("${hp.hbm2ddl}")
	private String HBM2DDL;
	@Value("${hp.show_sql}")
	private String SHOW_SQL;
	@Value("${hp.packageToScan}")
	private String packageToScan;
	
	
	@Bean
	public DriverManagerDataSource dataSource() {
		
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(DRIVER);
		dmds.setUrl(URL);
		dmds.setUsername(USERNAME);
		dmds.setPassword(PASSWORD);
		
		return dmds;
	}
	
	@Bean
	public LocalSessionFactoryBean sf() {
		
		 LocalSessionFactoryBean sf = new  LocalSessionFactoryBean();
		 sf.setDataSource(dataSource());
		 
		 Properties pt = new Properties();
		 pt.put(Environment.DIALECT,DIALECT);
		 pt.put(Environment.HBM2DDL_AUTO,HBM2DDL);
		 pt.put(Environment.SHOW_SQL,SHOW_SQL);
		 sf.setHibernateProperties(pt);
		 sf.setPackagesToScan(packageToScan);
		 
		 return sf;
	}
	
}
