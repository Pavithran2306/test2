package employee_details;



public class Employee 
{

	private int empid;
	private String empname;
	private String empaddress;
	private String empphone;
	
	
	public Employee(int empid, String empname, String empaddress, String empphone) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
		this.empphone = empphone;
	}
	
	
	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empaddress);
		System.out.println(empphone);
		
	}

	

	
}
