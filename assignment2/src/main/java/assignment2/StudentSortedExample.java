package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Studt4 {
	int marks;
	String name;

	public Studt4(String name,int marks) {
		super();
	    this.marks= marks;
		this.name = name;
	
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks =" + marks + "]";
	}
	
}
class MarksComparator implements Comparator <Studt4>{
	@Override 
	public int compare (Studt4 o1,Studt4 o2) {
		if (o1.marks>o2.marks)
			return 1;
		else if(o1.marks<o2.marks)
			return -1;
		else return 0;
	}
}

public class StudentSortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Studt4> studs = new ArrayList();
		studs.add(new Studt4("swapnil",80));
		studs.add(new Studt4("ketan",90));
		studs.add(new Studt4("pratik",70));
		studs.add(new Studt4("svk",60));
		Comparator<Studt4> c1 = (s1,s2)-> {
		if(s1.marks > s2.marks)
		return 1;
		else if(s1.marks< s2.marks)
		return -1;
		else
		return 0;
		};
		Comparator<Studt4> c2 = (s1,s2)-> s1.name.compareTo(s2.name);
//		Comparator<Student> c3 = (s1,s2)-> s1.branch.compareTo(s2.branch);
		//Collections.sort(studs, new HtnoComparator());
		Collections.sort(studs, c1);
		System.out.println("Sorted marks..");
		
	}
}

