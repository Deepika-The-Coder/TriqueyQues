import java.util.*;
class Task2 
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
	   int count=0;
	   {
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
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value");
		int a=scan.nextInt();
		for(int i=0;i<value;i++)
		{
         if(arr[i]==a)
			{
			 count++;
			}
		}
	
		if(count>0)
		{
			System.out.println("element found "+count+"times");
		}
		else 
		{
			System.out.println("element not found");
		}
		 

	}
}

	
