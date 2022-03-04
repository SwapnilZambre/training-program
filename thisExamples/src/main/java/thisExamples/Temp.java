package thisExamples;

public class Temp {
	
	String name;
	String dept;
	static String org;
	
	public Temp(String name,String dept)
	{
		System.out.println("inside the cionstructor");
		this.name=name;
		this.dept=dept;
		
	}
     public void showData() {
    	 System.out.println("NAmE: "+name+" "+"Dept: "+dept+" "+"org: "+org);
    	 
     }
     public static void showDetails() {
    	 System.out.println("org: "+org);
    	 
     } static {
    	 System.out.println("inside static block");
     }
     {
    	 System.out.println("Inside non-static block");
     }
}
