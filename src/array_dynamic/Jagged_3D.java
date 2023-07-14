package array_dynamic;

import java.util.Scanner;

public class Jagged_3D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of college :");
		
		int arr[][][] = new int[sc.nextInt()][][];
		
		//Taking input for no of classes
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the no of class present in college : "+(i+1));
			arr[i] = new int[sc.nextInt()][];
			
		}
		//Taking dynamic input for no of student
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the no of students in college : "+(i+1)+" class : "+(j+1));
				arr[i][j] = new int[sc.nextInt()];
			}
		}
		

		//Storing the data from user
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter marks for college " +(i+1)+" class "+(j+1)+" student "+(k+1));
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		//Retrieving data
		sc.close();
		System.out.println("-----------------------------");
		for (int i = 0; i < arr.length; i++) 
		{	
			for (int j = 0; j < arr[i].length; j++) 
			{
				for (int k = 0; k<arr[i][j].length; k++) 
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}