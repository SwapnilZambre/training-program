package assignment2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {

	public static void main(String[] args) {
		
		
		Set<String> s1= new LinkedHashSet();
		
		s1.add("swapnil");
		s1.add("ketan");
		s1.add("pratik");
		s1.add("suraj");
		s1.add("mahi");
		System.out.println("Linked hash set Data Is : "+s1);
		s1.add("swapnil");
		
		Set<String> s2=new HashSet();
		s2.add("swapnil");
		s2.add("ketan");
		s2.add("pratik");
		s2.add("suraj");
		s2.add("mahi");
		System.out.println("hashSet Data Is : "+s2);
		s1.add("swapnil");
		
		Set<String> s3=new TreeSet();
		
		s3.add("swapnil");
		s3.add("ketan");
		s3.add("pratik");
		s3.add("suraj");
		s3.add("mahi");
		System.out.println("TreeSet Data Is : "+s3);
		s1.add("swapnil");
		
		
		
		

	}

}
