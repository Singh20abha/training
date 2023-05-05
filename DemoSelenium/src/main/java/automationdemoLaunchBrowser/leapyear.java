package automationdemoLaunchBrowser;

import java.util.Scanner;

public class leapyear 
{
	public static void main(String[] args)
	{
		/*long y,r,q;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		y = sc.nextLong();
		
		if(y!=0)
		{
			r= (y%400==0)?(q=1):((y%100==0)?(q=0):((y%4==0)?(q=1):(q=0)));
			if(r==1)
			{
				System.out.println("Its a leap year");
			}
			else
			{
				System.out.println("its not a leap year");
			}			
		}
		else
		{
			System.out.println("year zero does not exist");
		}*/
		
		//int year = Integer.parseInt(args[0]);
		long year = Long.parseLong(args[0]);
				
		if(year!=0)
		{
			if(year%400==0)
			{
				System.out.println(year + "Its a leap year");
			}
			else if(year %100==0)
			{ 
				System.out.println(year +"Its a leap year");
			}
			else if(year%4==0)
			{
				System.out.println(year + "Its a leap year");
			}
			else 
			{
				System.out.println(year + "Its not a leap year");
			}
		}
		else
			{
			System.out.println(" year zero does not exist");
			}
	}
		

}
 