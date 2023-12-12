package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;
import in.co.rays.util.DataUtility;

@WebServlet("/UserRegistrationCtl")
public class UserRegistrationCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("index1.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("start");

		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String login = req.getParameter("loginId");
		String pass = req.getParameter("password");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");

		System.out.println("print = " + fname);

		UserBean bean = new UserBean();
		bean.setFirstName(fname);
		bean.setLastName(lname);
		bean.setLoginId(login);
		bean.setPassword(pass);
		bean.setDob(DataUtility.stringToDate(dob));
		bean.setAddress(address);

		UserModel model = new UserModel();

		
			try {
				model.add(bean);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("inside post");
		

		resp.sendRedirect("index1.jsp");

	}
}
