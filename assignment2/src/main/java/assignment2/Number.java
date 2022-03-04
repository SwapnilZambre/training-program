package assignment2;
import java.util.Scanner;
public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		try {
		checkNumber(num);
		}
		catch( PrimeNumberException e)
		{
			System.out.println(e);
		}
	}
	public static void checkNumber(int n) { 
		int count =0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			throw new PrimeNumberException();
		}
		else 
		{
			if(n%2==0)
			{
				System.out.println("Even number");
			}
			else
			{
				System.out.println("Odd Number");
			}
		}
	}

}