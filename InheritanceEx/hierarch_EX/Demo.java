package hierarch_EX;

public class Demo {

	public static void main(String[] args) 
	{
		Student st = new Student();
		st.setName("Ravi");
		st.setCity("Ahmedabad");
		st.setDiv("B");
		
		System.out.println(st);
		
		Student su2 = new Student("uttam","Ahm","A");
		System.out.println(su2);
		
		//Person pr = new Person();
		//pr = new Emp();
		//System.out.println(pr);
		
		Emp e = new Emp("Nivi","Can","IT");
		System.out.println(e);
	}

}
