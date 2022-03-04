package thisExamples;

public class OverloadingClass {
	public void test (int x, int y)
	{
		System.out.println("Inside tow int variables");
	}
public void test(int x)
{
	System.out.println("inside one variables");
	
}
public void test(int x,int y,char a)
{
	System.out.println("inside three variables ");
}

}
