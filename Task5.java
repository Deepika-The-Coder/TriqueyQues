import java.util.Scanner;
class Task5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int flag=1;
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
		  System.out.print("the array elements are:");

		  for(int i=0;i<arr.length;i++)
		{
		 System.out.print(arr[i]+"\t");
		   }
		   int j=value-1;
	for(int i=0;i<value/2;i++)
		{
		if (arr[i]!=arr[j])
		{
			flag=0;
			break;
		}
		else
			j--;
		}
		System.out.println();
		if(flag==1)
		{
			System.out.println("elements in an array are same from front to back:");
		}
		else
		{
			System.out.println("elements in an array not same:");
		}
		
	}
}
