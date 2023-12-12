package in.co.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) throws Exception {
		
//		 int i = 1;
//		while(i<50) {
//			System.out.println("print = "+i);
//			testFindByPk();
//			i++;
//		}
		
		//testAdd();
		 //testUpdate();
		// testDelete();
		 
		 testSearch();
		// testAdd2();
		//testSearch2();
		
	}
	

	private static void testSearch2() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		 bean.setName("a");
		bean.setRoll_no(110);

		MarksheetModel model = new MarksheetModel();

		List list = model.search2(null, 1, 10);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (MarksheetBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRoll_no());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		}

		
	}


	private static void testAdd2() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		//bean.setId(11);
		bean.setRoll_no(110);
		bean.setName("sagar");
		bean.setPhysics(85);
		bean.setChemistry(78);
		bean.setMaths(98);
		
		
		MarksheetModel model = new MarksheetModel();
		
		model.add2(bean);
	
		
	}


	private static void testFindByPk() throws Exception {

		MarksheetModel model = new MarksheetModel();

		MarksheetBean bean = model.findByPk(1);

		if (bean != null) {

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRoll_no());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		} else {
			System.out.println("ID not found...!!!");
		}

	}
	

	
	
	private static void testSearch() throws Exception {

		MarksheetModel model = new MarksheetModel();

		List list = model.search();

		Iterator it = list.iterator();

		while (it.hasNext()) {

			MarksheetBean bean = (MarksheetBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRoll_no());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		}

	}

	

	private static void testDelete() throws Exception {
			
		MarksheetModel model = new MarksheetModel();
		model.delete(11);

		}

		
	

	private static void testUpdate()throws Exception {
		
		MarksheetBean bean = new MarksheetBean();
		bean.setId(7);
		bean.setChemistry (99);
		bean.setMaths(88);
		bean.setPhysics(77);
		bean.setName("Ramesh");
		bean.setRoll_no(107);
		
		MarksheetModel modal = new MarksheetModel();
		modal.update(bean);
	}

	private static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(11);
		bean.setRoll_no(110);
		bean.setName("sagar");
		bean.setPhysics(85);
		bean.setChemistry(78);
		bean.setMaths(98);
		
		
		MarksheetModel model = new MarksheetModel();
		
		model.add(bean);
	
	
	}

}

/*   
		
  */
