package automationdemoLaunchBrowser;

import java.util.Scanner;

public class vowelinstring 
{

	public static void main(String[] args)
	{
		
		int i=0;
		String s;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string:" );
		s = sc.nextLine();
		
		System.out.println("vowels in a string are:");
		for(int j=0; j<s.length(); j++)
		{
			ch=s.charAt(j);
			switch(ch)
			{
			case 'a' :i=1;
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :	
			System.out.println(ch);
			}
			
			
		}
		if(i==0)
		{
			System.out.println("No vowel in the string:");
		}
		sc.close();
	}
	
}
