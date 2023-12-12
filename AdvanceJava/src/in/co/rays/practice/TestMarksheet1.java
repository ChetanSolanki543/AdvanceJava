package in.co.rays.practice;

public class TestMarksheet1 {

	public static void main(String[] args) throws Exception {
		
		testAdd();
	}

	public static void testAdd() throws Exception {
		MarksheetBean1 bean = new MarksheetBean1();
		bean.setId(15);
		bean.setName("sagar");
		bean.setRollNo(110);
		bean.setPhysics(78);
		bean.setChemistry(56);
		bean.setMaths(43);
		
		MarksheetModel1 model = new MarksheetModel1();
		
		model.add3(bean);
		
	}

}
