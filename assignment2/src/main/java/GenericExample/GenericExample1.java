package GenericExample;
class Gen<T>{
T ob;
Gen(T y){
ob=y;
}
T getOb() {
return ob;
}
void showType() {
System.out.println("Type of Object is " + ob.getClass().getName());
}

}

public class GenericExample1 {
public static void main(String args[]) {
Gen<String> g = new Gen("Hello");
g.showType();
Gen<Double> g1 = new Gen(14.8888);
g1.showType();
}

}