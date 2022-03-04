package programexample;

public class ArrayAddElement {

	public static void main(String[] args){
	
		int [] array= {10,15,20,25,30,100};
		int sum=0,revNo;
		
		for(int i=0;i<=array.length;i++)
		{
			if(array[i]>15) {
	
			sum=sum+array[i];
			
		  System.out.println("total sum"+  sum);
		  
		  int num=sum;
			int revNum=0;
			
			while(num!=0)
			{
				int digit=num%10;
				num/=10;
				revNum=revNum*10+digit;
			}
			System.out.println("Reverse no"+revNum);
		    }
          }
	    }
     }
