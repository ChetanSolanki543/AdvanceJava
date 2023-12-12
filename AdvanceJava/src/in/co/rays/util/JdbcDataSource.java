package in.co.rays.util;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSource {

	private static JdbcDataSource jds = null;

	private ComboPooledDataSource ds = null;
	
	private static ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.system");
	

	private JdbcDataSource() {

		try {

			ds = new ComboPooledDataSource();

			ds.setDriverClass(rs.getString("driver"));

			ds.setJdbcUrl(rs.getString("url"));

			ds.setUser(rs.getString("username"));

			ds.setPassword(rs.getString("password"));

			ds.setInitialPoolSize(Integer.parseInt(rs.getString("initialpoolsize")));

			ds.setAcquireIncrement(Integer.parseInt(rs.getString("acquiredIncrement")));

			ds.setMaxPoolSize(Integer.parseInt(rs.getString("maxpoolsize")));

		} catch (PropertyVetoException e) {

			e.printStackTrace();
		}
	}

	public static JdbcDataSource getInstance() {

		if (jds == null) {

			jds = new JdbcDataSource();

		}

		return jds;

	}

	public static Connection getConnection() {

		try {
			return getInstance().ds.getConnection();

		} catch (SQLException e) {
			return null;
		}
	}

}