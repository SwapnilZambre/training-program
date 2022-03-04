package programexample;

public class FibbnociiSeries {

	public static void main(String[] args) {
		
		int n=5,a=0,b=1;
		System.out.println("Fibbnocii Series"+n);
		
		for(int i=0;i<=n;i++)
		{
			System.out.println(a+" ");
			int result=a+b;
			a=b;
			b=result;
	
		
	   }	
	}
}