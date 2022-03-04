package assignment2;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=0,c;
		int ar[] = { 1, 2, 3 };
		
		try {
		
			System.out.println("Inside the try block..");
			System.out.println(ar[4]);
			c = a / b;
			System.out.println("The c :" + c);
			System.out.println("After c value...");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside the array index block");
		}catch(ArithmeticException e) {
			System.out.println("inside the Arithmetic catch block");
		}
		catch(Exception e) {
			System.out.println("inside the exception catch block");
		}finally {
			System.out.println("inside the finally block");
		}
		System.out.println("After the finally block");

	}

}
