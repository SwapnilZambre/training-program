package assignment2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Person{
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
}

public class AllFunctionExample {

	public static void main(String[] args) {
		System.out.println("Example using predicate ......");
		
		
		Predicate<String> checkLength= str->str.length()>5;
		System.out.println(checkLength.test("swa"));
		
		System.out.println("Example using Consumer........");
		
		Person p=new Person();
		Consumer<Person> setName=t->t.setName("swapnilzambre");
		setName.accept(p);
		System.out.println(p.getName());
		
		
		System.out.println("Example using Function........");
		
		Function<Integer,String> getInt=t->t*25+"  "+"data multiply by 25";
		System.out.println(getInt.apply(4));
		
		
	
	}

}
