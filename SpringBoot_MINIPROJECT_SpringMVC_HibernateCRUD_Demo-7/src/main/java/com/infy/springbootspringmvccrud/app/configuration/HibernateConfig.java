package com.infy.springbootspringmvccrud.app.configuration;

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
	@Value("${hp.format_sql}")
	private String FORMAT_SQL;
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
		
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(dataSource());
		
		Properties pt = new Properties();
		pt.setProperty(Environment.DIALECT, DIALECT);
		pt.setProperty(Environment.HBM2DDL_AUTO, HBM2DDL);
		pt.setProperty(Environment.SHOW_SQL, SHOW_SQL);
		pt.setProperty(Environment.FORMAT_SQL, FORMAT_SQL);
		lsfb.setHibernateProperties(pt);
		lsfb.setPackagesToScan(packageToScan);
		
		return lsfb;
	}
}
