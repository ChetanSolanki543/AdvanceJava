package in.co.rays.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class meta {
	public static void main(String[] args) throws Exception {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "12345678");
		PreparedStatement ps =conn.prepareStatement("select * from marksheet");
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmt = rs.getMetaData();
		System.out.println("Catelog Name : "+rsmt.getCatalogName(1));
		System.out.println("Table Name : "+rsmt.getTableName(1));
		int columnCount = rsmt.getColumnCount();
		System.out.println("Total column "+ columnCount);
		for(int i=1; i<columnCount; i++) {
			System. out. println ("Column :"+i);
			System. out. println ("Lable: "+rsmt. getColumnLabel (i)) ;
			System. out. println ("Name : "+rsmt.getColumnName (i)) ;
			System.out.println ("Type: "+rsmt.getColumnTypeName (i)) ;
			System. out. println ("Size:"+rsmt.getColumnDisplaySize (i)) ;
			System. out. println ();
		}
		
		
	}

}
