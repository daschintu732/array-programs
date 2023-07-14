package array_dynamic;

import java.util.Scanner;

public class Array_1D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of students :");
		int a = sc.nextInt();
		int arr[] = new int[a];
		// Storing data
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the mark for student : "+(i+1));
			arr[i]=sc.nextInt();
		}
		// Retrieving data
		sc.close();
		System.out.println("--------------------------------------");
		System.out.println("Marks are given below ::");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+"  ");
		}
	}
}