package array_dynamic;

import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of classes :");
		int a=sc.nextInt();
		System.out.println("Enter no of students :");
		int b=sc.nextInt();
		
		int [][] arr=new int [a][b];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter marks for class "+(i+1)+" student "+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println("-----------------------------------");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}