package array_basics;

import java.util.Scanner;

public class Regular_3D_arr {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String arr[][][] = new String [3][2][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<3;k++)
				{
					System.out.println("Enter name of bank "+(i+1)+" branch "+(j+1)+" customer "+(k+1));
					arr[i][j][k]=sc.next();
				}
			}
		}
		System.out.println("All Customers are given below ::");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<3;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
				sc.close();
			}
		}
	}
}