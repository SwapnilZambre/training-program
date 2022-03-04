package thisExamples;

public class Box3D extends Box2D {
	
	int heigth;
	int length;
	
	Box3D(){
		heigth=1;
		length=5;
		
	}
	public void calValume() {
		System.out.println("The Volume is :"+(super.length*breadth*heigth));
	}

}
