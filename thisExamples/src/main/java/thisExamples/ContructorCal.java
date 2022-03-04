package thisExamples;

public class ContructorCal {
	
	int id;
	String name;
	String location;
	
	ContructorCal()
	{
		id=111;
		name="suraj";
	    location="mumbai";
		System.out.println("Default Constructor");
	}
	
	ContructorCal(int a,String b,String c)
	{
		this.id=a;
		this.name=b;
		this.location=c;
		System.out.println("this is parameterized constructor");
	}
	public void getData()
	{
		System.out.println("inside the method");
	}
	public void printData() {
		System.out.println("id: "+id+" "+"NAME: "+name+" "+"location: "+location);
	}

}
