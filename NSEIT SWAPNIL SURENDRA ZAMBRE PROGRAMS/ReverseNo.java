package programexample;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int orgNum=sc.nextInt();
		int num=orgNum;
		int revNum=0;
		
		while(num!=0)
		{
			int digit=num%10;
			num/=10;
			revNum=revNum*10+digit;
		}
		System.out.println("Reverse no"+revNum);

	}

}
