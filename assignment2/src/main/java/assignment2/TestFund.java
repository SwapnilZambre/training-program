package assignment2;

public class TestFund {
	public void checkFundAmount(int fundAmt) {
		if(fundAmt>0 || fundAmt<5000)
			throw new InsufficientFundException();
		else if(fundAmt>5000)
			throw new SufficientFundAmount();
		else 
			System.out.println("your are eligible for fund amount");
	}

}
