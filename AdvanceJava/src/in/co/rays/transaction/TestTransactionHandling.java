package in.co.rays.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTransactionHandling {

	public static void main(String[] args) throws Exception {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "12345678");

			conn.setAutoCommit(false);

			Statement stmt = conn.createStatement();

			int i = stmt.executeUpdate("insert into emp values(11, 'abc', 1000)");
			i = stmt.executeUpdate("insert into emp values(12, 'abc', 1000)");
			i = stmt.executeUpdate("insert into emp values(13, 'abc', 1000)");

			conn.commit();

			System.out.println("Data Inserted = " + i);
		} catch (Exception e) {
			conn.rollback();
		}

	}

}
