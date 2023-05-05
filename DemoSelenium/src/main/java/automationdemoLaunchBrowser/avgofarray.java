package automationdemoLaunchBrowser;
import java.util.Scanner;

public class avgofarray
{
	public static void main(String[] args)
	{
		int i;
		double avg=0;
		System.out.println("Enter the number of Subject:");
		Scanner sc = new Scanner(System.in);
		int numofsub = sc.nextInt();
		int a[] = new int[numofsub];
		
		System.out.println("Enter the marks:");
		for( i=0; i<numofsub; i++)
		{
			a[i] = sc.nextInt();
		}
		
		calculateavg c = new calculateavg(a);
		
		System.out.println("Average of number(" );
		for( i=0; i<numofsub-1; i++)
		{
			System.out.println(a[i]+ ",");
		}
		System.out.println(a[i]+ ")=" +avg/numofsub );
		sc.close();
		
	}

}
