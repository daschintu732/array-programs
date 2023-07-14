package array_basics;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr=new String [5];
		System.out.println("enter 5 students");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.next();
		}
		sc.close();
		System.out.println("5 students are  : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}