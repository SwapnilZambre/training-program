package thisExamples;

public class Address {
	int dno;
	String street;
	String city;
	 
	public Address(int dno,String street,String city)
	{
		super();
		this.dno=dno;
		this.street=street;
		this.city=city;
	}
	
@Override
public String toString() {
	return "Adress[dno=" +dno +" ,street="+ street +",City=" + city+ "]";
	
	
}
}
