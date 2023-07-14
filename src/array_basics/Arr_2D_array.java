package array_basics;

import java.util.Scanner;

public class Arr_2D_array {

	public static void main(String[] args) {	
		
		int arr [][]=new int [2][3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the age of class "+i+" student "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		//Retrieving the data
		System.out.println("The age of students are ::");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}