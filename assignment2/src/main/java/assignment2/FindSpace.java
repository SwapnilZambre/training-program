package assignment2;

import java.util.function.*;

public class FindSpace {

	public static void main(String[] args)
	{
		
		String str = "swapnil surendra zambre";
		Function<String,Integer> f= s1->s1.length()-s1.replace(" ","").length();
		System.out.println(f.apply(str));

	}

}
