package assignment2;

import java.util.Set;
import java.util.TreeSet;

class Empl implements Comparable<Empl>{
int empid;
String name;
String dept;
public Empl() {
}
public Empl(int empid, String name, String dept) {
super();
this.empid = empid;
this.name = name;
this.dept = dept;
}
@Override
public String toString() {
return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + "]";
}
@Override
public int compareTo(Empl o) {
// TODO Auto-generated method stub
if( this.name.compareTo(o.name) < 0)
return -1;
else if (this.name.compareTo(o.name) > 0)
return 1;
else
return 0;
}

}

public class SetEmployeeExample {

 public static void main(String[] args) {
// TODO Auto-generated method stub
Empl emp1 = new Empl(1001,"Kumar","IT");
Empl emp2 = new Empl(9021,"Sunil","Marketing");
Empl emp3 = new Empl(5329,"Babji","QA");
Empl emp4 = new Empl(2245,"John","Operations");
Set<Empl> hs = new TreeSet();
hs.add(emp1);
hs.add(emp2);
hs.add(emp3);
hs.add(emp4);
for(Empl e: hs)
System.out.println(e);

 }

}