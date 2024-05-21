package TDS;
public class getSetMethod {
	
	private String name;
	private int rollNo;



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public static void main(String args[]){
		getSetMethod obj=new getSetMethod();
		obj.setName("Ravi Sakhavala");
		obj.setRollNo(12);
		System.out.println(obj.getName());
		System.out.println(obj.getRollNo());
	}

}
