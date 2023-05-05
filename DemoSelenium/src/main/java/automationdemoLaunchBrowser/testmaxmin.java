package automationdemoLaunchBrowser;
import java.util.Scanner;

public class testmaxmin
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the number of element in array");
		int num , max, min;
		num = reader.nextInt();
		int arr[]= new int[num];
		//int arr1[]= new int[num];
		System.out.println( "Enter elements in the array:");
		for(int i=0; i<num; i++)
		{
			arr[i]=reader.nextInt();
			//arr1[i]=arr[i];
		}
		max = arr[0];
		
		/*for(int i=0; i<num; i--)
		{
			arr[i]=reader.nextInt();
		}*/
		min = arr[0];
		
		for(int i=0; i<num; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
						
			}
			
			else if (min>arr[i])
			
			{
				min=arr[i];
			}
			
		}
		System.out.println("max number:" +max);
		
		System.out.println("min number:" +min);
		
	}

}
