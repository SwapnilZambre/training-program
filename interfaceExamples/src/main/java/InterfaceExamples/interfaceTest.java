package interfaceExamples;

interface Employee {
	void getDesignation();

	void getSalary();

}

class Developer implements Employee {
	public void getDesignation() {
		System.out.println("Designation is developer");
	}

	public void getSalary() {
		System.out.println("Salary of is 35000");
	}
}

class Tester implements Employee {
	public void getDesignation() {
		System.out.println("Designation is tester");
	}

	public void getSalary() {
		System.out.println("Salary is 25000");
	}
}

public class interfaceTest {
	public static void main(String[] args) {
		Developer d1 = new Developer();
		d1.getDesignation();
		d1.getSalary();

		Tester t2 = new Tester();
		t2.getDesignation();
		t2.getSalary();

	}
}
