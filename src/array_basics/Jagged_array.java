package array_basics;

import java.util.Scanner;

public class Jagged_array {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int[][] arr=new int [3][];
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[4];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the age for class "+i+", student "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Jagged Array :: Displaying all students age :-->");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			sc.close();
		}
	}
}