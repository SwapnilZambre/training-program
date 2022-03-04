package interfaceExamples;

import java.util.function.Predicate;

public class PredicateKNameDisplay {

	public static void main(String[] args) 
		
		{
			String[] names= {"Suraj","Karan","Rohit","Kiran","Karina","Katrina"};
			
			Predicate<String> startwithK=s->s.charAt(0)=='K'; 	 
			System.out.println("The Name Start With K are :");
			for(String s: names)
			{
				if(startwithK.test(s))
				{
					System.out.println(s);
				}
			}

	}
	}