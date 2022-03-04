package programexample;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no,a,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No");
		no=sc.nextInt();
		
		for(int i=1;i<=no;i++)
		{
		if(i%2!=0)
		{
			sum+=i;
		}
		
		System.out.println("sum of odd numbers between 0 to"+no+"="+sum);
				
		}
	}
}
