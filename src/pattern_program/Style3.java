package pattern_program;

import java.util.Scanner;

public class Style3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) 
		{
			for (int j = 1; j <= (2*i)-1; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			scan.close();
		}
	}
}