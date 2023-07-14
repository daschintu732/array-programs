package array_dynamic;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter "+len+" elements :");
		//Storing elements in array
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//Coping data from array
		int copy_arr[] =new int [arr.length];
		
		for(int i=0;i<copy_arr.length;i++)
		{
			copy_arr[i]=arr[i];
		}
		//Retrieving the data
		System.out.println("Main Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n---------------");
		System.out.println("Copied Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(copy_arr[i]+" ");
		}
		sc.close();
	}
}