package com.infy.springmvc.utility;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class HibernateConfiguration {
	@Value("${db.driver}")
	private String DRIVER;
	
	@Value("${db.url}")
	private String URL;
	@Value("${db.username}")
	private String USERNAME;
	@Value("${db.password}")
	private String PASSWORD;
	@Value("${hb.hbm2ddl}")
	private String HBM2DDL;
	@Value("${hb.show_sql}")
	private String SHOW_SQL;
	@Value("${hb.dialect}")
	private String DIALECT;
	@Value("${hb.packagetoscan}")
	private String PACKAGETOSCAN;

	@Bean
	public DriverManagerDataSource dataSource() {
		
		DriverManagerDataSource d = new DriverManagerDataSource();
		d.setDriverClassName(DRIVER);
		d.setUsername(USERNAME);
		d.setPassword(PASSWORD);
		d.setUrl(URL);
		return d;
	}
	
	@Bean
	public LocalSessionFactoryBean lsfb() {
		LocalSessionFactoryBean sf= new LocalSessionFactoryBean();
		sf.setDataSource(dataSource());
		
		Properties p= new Properties();
		p.put("hibernate.dialect", DIALECT);
		p.put(Environment.HBM2DDL_AUTO, HBM2DDL);
		p.put(Environment.SHOW_SQL, SHOW_SQL);
		
		sf.setHibernateProperties(p);
		sf.setPackagesToScan(PACKAGETOSCAN);
		
		return sf;
		
		
	}
	
}
