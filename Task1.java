import java.util.Scanner;
class  Task1
{
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
	   System.out.println("enter number of elements:");
	   int value =sc.nextInt();
	    if(value<=0)
		{
		System.out.println("invalid output");
		}
	   int[] arr=new int[value];
	
	   System.out.println("enter the elements");
	   	   for(int i=0;i<value;i++)
		   {
	  arr[i]=sc.nextInt();
	}
	   
		   		System.out.println( "array elements are:");
		for(int i=0;i<arr.length;i++)
			{
			System.out.print(arr[i]+"\t");
			}

		
		
		
	}
}
