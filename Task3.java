import java.util.Scanner;
class  Task3
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
	   int x, pos=0,neg=0,even=0,odd=0,zero=0;
	   for(int i=0;i<value;i++){
	   System.out.println("enter "+i+"the elements");
	  arr[i]=sc.nextInt();
	}
		   
		System.out.println( "array elements are:");
		 for(int i=0;i<arr.length;i++)
			{
			 System.out.println(arr[i]+"\t");

		}
        for(int i=0;i<arr.length;i++)
		{
	if(arr[i]<0)
			{
		neg++;
			}
	else if(arr[i]>0){
		pos++;
	}
	else{
		zero++;
	}
	x=arr[i]%2;
	if(x==0)
			{
		even++;
			}
	else {
		odd++;
	}
		}
		System.out.println();
		System.out.println("Total even number is:"+even);
		System.out.println("Total odd number is:"+odd);
		System.out.println("Total zero number is:"+zero);
		System.out.println("Total negative number is:"+neg);
		System.out.println("Total positive number is:"+pos);

		
	}
}
	


