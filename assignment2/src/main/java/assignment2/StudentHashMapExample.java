package assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StudentHashMapExample {

 public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<Integer> marks1 = new ArrayList();
ArrayList<Integer> marks2 = new ArrayList();
ArrayList<Integer> marks3 = new ArrayList();
marks1.add(98);
marks1.add(87);
marks1.add(78);
marks1.add(76);



marks2.add(65);
marks2.add(59);
marks2.add(72);
marks2.add(64);


marks3.add(89);
marks3.add(84);
marks3.add(79);
marks3.add(82);

 HashMap<String,List> results = new HashMap();
results.put("Kishore",marks1);
results.put("Sunil",marks2);
results.put("Anil",marks3);
System.out.println(results);
Set<Map.Entry<String, List>> entries = results.entrySet();
Iterator itr = entries.iterator();
while(itr.hasNext()) {
Map.Entry<String,List> temp = (Entry<String, List>) itr.next();
List<Integer> marks = temp.getValue();
int sum=0;
for(Integer i :marks)
sum=sum+i;
System.out.println("Name: "+temp.getKey()+" "+"Total: "+sum);
}

 }

}