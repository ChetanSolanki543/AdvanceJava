package in.co.rays.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestApp {

	public static void main(String[] args) {

		//ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.app_hi");
		Locale lc = new Locale("hi");
		ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.app",lc);
		
		System.out.println(rs.getString("chetan"));
	}

}
