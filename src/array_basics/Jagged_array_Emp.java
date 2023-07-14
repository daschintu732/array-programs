package array_basics;

import java.util.Scanner;

public class Jagged_array_Emp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String arr[][]=new String [4][];
		arr[0]=new String[2];
		arr[1]=new String[4];
		arr[2]=new String[3];
		arr[3]=new String[5];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the Emp name of company "+(i+1)+" and Emp "+(j+1));
				arr[i][j]=sc.next();
			}
		}
		//Retrieving data
		sc.close();
		System.out.println("Employee names are ::");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("The name of Company "+(i+1)+" Employee "+(j+1)+" is ::"+arr[i][j]+" ");
			}
		}
	}
}