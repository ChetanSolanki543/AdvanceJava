package in.co.rays.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarksheetModel1 {
	
	public void add3(MarksheetBean1 bean) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root", "12345678");
		PreparedStatement ps = con.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getRollNo());
		ps.setInt(4,bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		
		int i = ps.executeUpdate();
		
		System.out.println("data added = "+i);
		
	}

}
