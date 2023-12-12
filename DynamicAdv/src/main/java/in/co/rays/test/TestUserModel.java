package in.co.rays.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Iterator;
	import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

	public class TestUserModel {

		public static void main(String[] args) throws Exception {

			// testAdd();
			testSearch();
			//testAuthenticate();
			//testUpdate();
			

		}

		private static void testUpdate() throws Exception {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			UserBean bean = new UserBean();

			bean.setId(2);
			bean.setFirstName("chetan");
			bean.setLastName("solanki");
			bean.setLoginId("chetan@gmail.com");
			bean.setPassword("123");
			bean.setDob(sdf.parse("2001-10-31"));
			bean.setAddress("khargone");

			UserModel model = new UserModel();

			model.update(bean);

		
	}

		private static void testAuthenticate() throws Exception {
			UserModel model = new UserModel();
			UserBean bean = model.authenticate("chetan@gmail.com", "123");
			if(bean!=null) {
				System.out.print(bean.getId());
				System.out.print("\t" + bean.getFirstName());
				System.out.print("\t" + bean.getLastName());
				System.out.print("\t" + bean.getLoginId());
				System.out.print("\t" + bean.getPassword());
				System.out.print("\t" + bean.getDob());
				System.out.println("\t" + bean.getAddress());

				
			}
		}

		private static void testSearch() throws Exception {

		//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			UserBean bean = new UserBean();

			//bean.setDob(sdf.parse("2001-01-01"));
			bean.setAddress("khargone");

			UserModel model = new UserModel();

			List list = model.search(bean);

			Iterator it = list.iterator();

			while (it.hasNext()) {

				bean = (UserBean) it.next();

				System.out.print(bean.getId());
				System.out.print("\t" + bean.getFirstName());
				System.out.print("\t" + bean.getLastName());
				System.out.print("\t" + bean.getLoginId());
				System.out.print("\t" + bean.getPassword());
				System.out.print("\t" + bean.getDob());
				System.out.println("\t" + bean.getAddress());

			}

		}

		private static void testAdd() throws Exception {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			UserBean bean = new UserBean();

			bean.setId(1);
			bean.setFirstName("aditya");
			bean.setLastName("sharma");
			bean.setLoginId("aditya@gmail.com");
			bean.setPassword("123");
			bean.setDob(sdf.parse("2001-01-01"));
			bean.setAddress("indore");

			UserModel model = new UserModel();

			model.add(bean);

		}

	


}
