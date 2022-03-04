package assignment2;

public class ThrowExample {

	 public static void main(String[] args) {
	// TODO Auto-generated method stub

	 try {
	int a = 100, b = 200;
	System.out.println("Inside the try block...");
	if (a < b)
	throw new ArrayIndexOutOfBoundsException(); //object of exception
	else
	throw new NullPointerException();           //object of exception

	} catch (ArrayIndexOutOfBoundsException e) {
		
	System.out.println("Inside the array index out of bounds exception");
	}
	catch (NullPointerException e) {
	System.out.println("Inside the nullpointer exception");
	}
	finally {
	System.out.println("Inside the finally block...");
	}

	 }

	}