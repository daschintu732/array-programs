package pattern_program;

import java.util.Scanner;

public class Style4 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++)
		{
			for (int j = num; j >= (2*i)-1; j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
			scan.close();
		}
	}
}