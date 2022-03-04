package springexample;


public class AnnotBeanTest {

 public static void main(String[] args) {
// TODO Auto-generated method stub
AnnotationConfigApplicationContext context=
new AnnotationConfigApplicationContext(BeanConfig.class);
Address a = context.getBean(Address.class);
System.out.println(a);
Student s = context.getBean(Student.class);

System.out.println(s);



 }

}