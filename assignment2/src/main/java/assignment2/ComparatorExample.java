package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int Id;
	String name;
	String branch;
	public Student(int id, String name, String branch) {
		super();
		Id = id;
		this.name = name;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", branch=" + branch + "]";
	}
	
}
class IdComparator implements Comparator <Student>{
	@Override 
	public int compare (Student o1,Student o2) {
		if (o1.Id>o2.Id)
			return 1;
		else if(o1.Id<o2.Id)
			return -1;
		else return 0;
	}
}
class nameComparator implements Comparator <Student>{
	public  int compare (Student o1,Student o2) {
		return o1.branch.compareTo(o2.branch);
	}
}
public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studs = new ArrayList();
		studs.add(new Student(1,"swapnil","cse"));
		studs.add(new Student(2,"ketan","eee"));
		studs.add(new Student(3,"pratik","mech"));
		studs.add(new Student(4,"svk","biotech"));
		Comparator<Student> c1 = (s1,s2)-> {
		if(s1.Id > s2.Id)
		return 1;
		else if(s1.Id < s2.Id)
		return -1;
		else
		return 0;
		};
		Comparator<Student> c2 = (s1,s2)-> s1.name.compareTo(s2.name);
		Comparator<Student> c3 = (s1,s2)-> s1.branch.compareTo(s2.branch);
		//Collections.sort(studs, new HtnoComparator());
		Collections.sort(studs, c1);
		System.out.println("Sorted on Id..");
		for(Student s : studs)
		System.out.println(s);
		//Collections.sort(studs, new NameComparator());
		Collections.sort(studs, c2);
		System.out.println("Sorted on name basis..");
		for(Student s : studs)
		System.out.println(s);

		//Collections.sort(studs, new BranchComparator());
		Collections.sort(studs, c3);
		System.out.println("Sorted on branch basis..");
		for(Student s : studs)
		System.out.println(s);
		
		
		
		
	}

}
