package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Persondao {

		String driver = "com.mysql.cj.jdbc.Driver";
		String query = "jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=root";
		public int createTable() {
			try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(query);
			Statement statement  = connection.createStatement();
			int res = statement.executeUpdate("create table preson (id int primary key,name varchar(45),age int,email varchar(45),password varchar(20))");
			connection.close();
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
				
			
		
		return 0;
		
}

}
