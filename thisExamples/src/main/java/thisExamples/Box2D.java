package thisExamples;

public class Box2D {
	
	int length;
	int breadth;
	Box2D(){
		length=5;
		breadth=10;
		
	}
	Box2D(int length,int breadth){
		
		int area;
		this.length=length;
		this.breadth=breadth;
		
	}
	public void calArea() {
		System.out.println("the area of box 2D is: "+(length*breadth));
	}

}
