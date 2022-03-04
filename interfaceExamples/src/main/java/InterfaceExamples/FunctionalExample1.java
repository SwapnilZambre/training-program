package interfaceExamples;


@FunctionalInterface

interface Maths{
	public int add(int a,int b);
}
@FunctionalInterface
interface Geometry{
	public double calCircleArea(int radius);
	
}
class GeometryImpl implements Geometry{
	public double calCircleArea (int radius) {
		return 3.14*radius*radius;
	}
}
class MathsImpl implements Maths{
	public int add (int a,int b) {
		return a+b;
	}
}

public class FunctionalExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m=(a,b)->a+b;
			
		
		System.out.println(m.add(20,40));
		
		Geometry g1 =(radius)-> radius*radius;
		System.out.println("The area of circle is"+g1.calCircleArea(10));

	}

}
