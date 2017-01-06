package com.kji.study.mybatis.origin;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class EmailDataSource implements DataSource {

	private BasicDataSource target = new BasicDataSource();

	public EmailDataSource() {
		target.setDriverClassName("cubrid.jdbc.driver.CUBRIDDriver");
		target.setUrl("jdbc:cubrid:10.161.142.69:30102:toast_mail:::?charset=UTF-8");
		target.setUsername("toast_mail");
		target.setPassword("toast_mail!@#123");
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection getConnection() throws SQLException {
		return target.getConnection();
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
