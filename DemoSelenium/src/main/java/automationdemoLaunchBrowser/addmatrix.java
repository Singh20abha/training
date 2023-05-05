package automationdemoLaunchBrowser;

import java.util.Scanner;

public class addmatrix 
{
	public static void main(String[] args)
	{
		int row, col, i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of row:");
		row = sc.nextInt();
		
		System.out.println("Enter the number of coloum:");
		col = sc.nextInt();
		
		Integer[][] matrix1 = new Integer[row][col];
		Integer[][] matrix2 = new Integer[row][col];
		Integer[][] result = new Integer[row][col];
		
		System.out.println("Enter the element of matrix1");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				matrix1[i][j]= sc.nextInt();
				System.out.println();
			}
		}
		
		System.out.println("Enter the element of matrix2");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				matrix2[i][j]= sc.nextInt();
				System.out.println();
			}
		}
		 
		for ( i= 0 ; i < row ; i++ )
		for ( j= 0 ; j < col ;j++ )
		result[i][j] = matrix1[i][j] + matrix2[i][j] ; 
		 
		System.out.println("Sum of matrices:-");
		
		for ( i= 0 ; i < row ; i++ )
		{ 
			for ( j= 0 ; j < col ;j++ )
			{
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		
		}
	}
}
