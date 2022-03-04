package assignment2;

public class InsufficientFundException extends RuntimeException {
	public InsufficientFundException(){
		super("fund amount is not sufficient");
		
	}

}
