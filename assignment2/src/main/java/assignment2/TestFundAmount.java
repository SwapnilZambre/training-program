package assignment2;

import java.util.Scanner;

public class TestFundAmount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount to be withdrawn");
		int fundAmt=sc.nextInt();
		TestFund t=new TestFund();
		try {t.checkFundAmount(fundAmt);
			
		} catch(InsufficientFundException e) {
			System.out.println(e);
		}
		catch(SufficientFundAmount e) {
			System.out.println(e);
			
		}
		
	}

}
