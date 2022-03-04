package assignment2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> t1= new ArrayList();
		  
		  t1.add(10);
		  t1.add(20);
		  t1.add(30);
		  t1.add(40);
		  t1.add(50);
		  System.out.println(t1);
		  
		  Comparator<Integer> c1=(x1,x2)->x1.compareTo(x2);
		  List<Integer> result =t1.stream().sorted(c1).collect(Collectors.toList());
		  System.out.println(result);
		  
		  Integer m= t1.stream().max(c1).get();
		  System.out.println(m);		  

	}

}
