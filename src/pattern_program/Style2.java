package pattern_program;

import java.util.Scanner;

public class Style2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		int row = scan.nextInt();

		for (int i = 1; i <= row; i++) 
		{
			for (int j = row; j >= i; j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
			scan.close();
		}
	}
}