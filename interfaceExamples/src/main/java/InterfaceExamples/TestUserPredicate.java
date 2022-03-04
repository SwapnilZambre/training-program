package interfaceExamples;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String username;
	String password;
	
	public User (String username,String password) {
		super();
		this.username=username;
		this.password=password;
		
	}
}

public class TestUserPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner (System.in);
		
		Predicate<User> u=usr->usr.username.equals("admin")&&usr.password.equals("admin"); 
		String uname=sc1.next();
		System.out.println("enter passeord");

		String passwd=sc1.next();
		System.out.println("enter password");
		User user =new User(uname,passwd);
		if(u.test(user))
			System.out.println("Valid user");
			else
			System.out.println("Invalid user");

	}

}
