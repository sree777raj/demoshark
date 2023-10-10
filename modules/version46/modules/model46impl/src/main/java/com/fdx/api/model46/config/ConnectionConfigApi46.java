package com.fdx.api.model46.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;

@Configuration("config46")
public class ConnectionConfigApi46 {

	static DataSource dataSource;
	static NamedParameterJdbcTemplate template;

	private static String url;
	private static String userName;
	private static String password;

	@Primary
	@Bean(name = "dataSource46")
	public static void dataSource() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url(url);
		dataSourceBuilder.username(userName);
		dataSourceBuilder.password(password);
		dataSource = dataSourceBuilder.build();
	}

	@Value("${spring.datasource.url}")
	public void setUrl(String jdbcUrl) {
		url = jdbcUrl;
	}

	@Value("${spring.datasource.password}")
	public void setPassword(String passwordString) {
		password = passwordString;
	}

	@Value("${spring.datasource.username}")
	public void setUserName(String userNameString) {
		userName = userNameString;
	}

	public static String getUrl() {
		return url;
	}

	public static String getUserName() {
		return userName;
	}

	public static String getPassword() {
		return password;
	}

	public static NamedParameterJdbcTemplate getTemplate() {
		if (template == null)
			template = new NamedParameterJdbcTemplate(dataSource);
		return template;
	}

	public Connection getConnection() {
		return null;
	}
}
