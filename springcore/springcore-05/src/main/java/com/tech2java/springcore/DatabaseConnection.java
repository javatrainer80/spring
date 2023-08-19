package com.tech2java.springcore;


public class DatabaseConnection {

	private String url;
	private String username;
	private String password;
	private String driverClassName;
	
	
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	
    public void init() throws Exception {
		
		System.out.println("Inside DatabaseConnection::init method..");
		
	}

	@Override
	public String toString() {
		return String.format("DatabaseConnection [url=%s, username=%s, password=%s, driverClassName=%s]", url, username,
				password, driverClassName);
	}
	
	
	
	
	
}
