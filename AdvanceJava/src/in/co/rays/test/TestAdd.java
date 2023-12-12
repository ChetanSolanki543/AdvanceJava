package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import in.co.rays.util.JdbcDataSource;

public class TestAdd {
	public static void main(String[] args) throws Exception {
		
		Connection con =JdbcDataSource.getConnection();
    	Statement st = con.createStatement();
		int i = st.executeUpdate("delete from marksheet where id = 7");
		
		System.out.println("data deleted = "+i);
	

//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root", "12345678");
//		Statement st = con.createStatement();
//		int i = st.executeUpdate("insert into marksheet values(9,'dilip',108,67,87,45)");
//		
//		System.out.println("inserted data = "+i);
		
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "12345678");
//		Statement st = con.createStatement();
////		int i = st.executeUpdate("create table school(id int ,name varchar(20))");
//		int i = st.executeUpdate("insert into school values(1,'chetan')");
//		System.out.println("inserted data = "+i);
//		
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "12345678");
//		Statement st = con.createStatement();		
//		int i = st.executeUpdate("update marksheet set physics = 33 where id = 7");
//		System.out.println("inserted data = "+i);
	}

}
