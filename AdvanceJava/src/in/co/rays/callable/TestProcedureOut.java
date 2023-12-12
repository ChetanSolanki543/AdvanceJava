package in.co.rays.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class TestProcedureOut {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "12345678");

		CallableStatement callStmt = conn.prepareCall("{CALL getAllParts()}");
		
		callStmt.execute();
		ResultSet rs = callStmt.getResultSet();
		while(rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.println("\t"+rs.getInt(3));
		}
		
		
	}

}
