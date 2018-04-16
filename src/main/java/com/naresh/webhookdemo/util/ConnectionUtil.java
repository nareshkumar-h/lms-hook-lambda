package com.naresh.webhookdemo.util;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.mysql.cj.jdbc.Driver;

public class ConnectionUtil {

	//private static final String serverName ="knowledgetracker.ck1ayq0lncmp.ap-south-1.rds.amazonaws.com";
	//private static final String url = "jdbc:mysql://"+ serverName + ":3306/lms_db?useSSL=false&zeroDateTimeBehavior=convertToNull";
	private static final String url = "jdbc:mysql://13.126.90.207:3306/lms_prod?useSSL=false&zeroDateTimeBehavior=convertToNull";
	private static final String username = "prod_user" ;//"spinnaresh";
	private static final String password = "prod_pass123" ;// "spinteam2018";

	private static DataSource getDataSource() {
		SimpleDriverDataSource ds = new SimpleDriverDataSource();
		ds.setDriverClass(Driver.class);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}

	public static JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
}
