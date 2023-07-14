package array_basics;

import java.util.Scanner;

public class Arr_3D_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][][] arr = new int [2][3][4];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<4;k++)
				{
					System.out.println("Enter the age of school "+(i+1)+" class "+(j+1)+" student "+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println("Given students age are ::");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<4;k++)
				{
					System.out.print(arr[i][j][k] +" ");
				}
				System.out.println();
				sc.close();
			}
		}
	}
}