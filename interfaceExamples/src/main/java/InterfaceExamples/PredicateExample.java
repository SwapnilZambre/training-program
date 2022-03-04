package interfaceExamples;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		
		Predicate <Integer> p4= n->n>=5;
		Predicate<Integer> p1=n->n%2==0;
		Predicate<Integer> p2=n->n>100;
		Predicate <Integer> p3=n->{
			boolean isPrime=true;
			for (int i=2;i<n-1;i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
			return isPrime;
		};
		
		System.out.println("No is Greater: "+p3.test(10));
		System.out.println(" no is: "+p4.test(9));
		System.out.println("Prime no: "+p2.test(10));
             
		
		System.out.println(">100 and Even: "+p1.and(p2).test(24));
		System.out.println(">100 and Even: "+p1.or(p2).test(24));
		System.out.println("Odd Number: "+p1.negate().test(11));
	}

}
