package array_basics;

import java.util.Scanner;

public class Jagged_3D_arr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String arr[][][]=new String[2][][];
		
		arr[0]=new String[2][];
		arr[1]=new String[3][];
		
		arr[0][0]=new String[2];
		arr[0][1]=new String[3];
		
		arr[1][0]=new String[1];
		arr[1][1]=new String[2];
		arr[1][2]=new String[3];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter name of college "+(i+1)+" class "+(j+1)+" student "+(k+1));
					arr[i][j][k]=sc.next();
				}
			}
		}
		System.out.println("-------------------------------------");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
				sc.close();
			}
		}
	}
}