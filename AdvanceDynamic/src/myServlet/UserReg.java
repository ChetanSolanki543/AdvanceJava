package myServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;
import in.co.rays.util.DataUtility;

@WebServlet("/UserReg")
public class UserReg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserReg() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: my servlet chetan ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String login = request.getParameter("loginId");
		String pass = request.getParameter("password");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");

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

		response.sendRedirect("user.jsp");

	}

}
