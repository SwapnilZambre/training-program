package programexample;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		
		int no,a,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No");
		no=sc.nextInt();
		
		while(no%2==1)
		{
			a=no%10;
			sum+=a;
			no=no/10;
		}no++;
		
		System.out.println("sum of odd numbers is"+sum);
			
			
		}
}