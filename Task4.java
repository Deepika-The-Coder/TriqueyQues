import java.util.Scanner;
class  Task4
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
	   for(int i=0;i<value;i++){
	   System.out.println("enter "+i+"the elements");
	  arr[i]=sc.nextInt();
	}
	
	   
		
		   System.out.println();
		System.out.println( "array elements are:");
		for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]+"\t");
		}
           System.out.print( "Reverse of an array is:");

		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+"\t");
					}

	}
}
	

