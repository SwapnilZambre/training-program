package programexample;

import java.util.Scanner;

public class DistanceBetween {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter X1");
		int X1=sc.nextInt();
		
		System.out.println("Enter y1");
		int Y1=sc.nextInt();
		
		System.out.println("Enter X2");
		int X2=sc.nextInt();
		
		System.out.println("Enter Y2");
		int Y2=sc.nextInt();
		 
		
		double distance=Math.sqrt((X1-X2)*(X1-X2)+(Y1-Y2)*(Y1-Y2));
		
	
		System.out.println("distance is"+ distance);
		

	}

}
