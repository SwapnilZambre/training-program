package programexample;

public class RemoveArrayElement {

	public static void main(String[] args) 
	{
		int arr[]= {2,7,3,54,1,6,7,7};
		int evenNo=0;
		
		for(int a=0;a<arr.length;a++)
		{
			if(a%2==0)
				evenNo+=arr[a];
		}
				System.out.println("odd no sum is"+evenNo);
			}
		}

	

