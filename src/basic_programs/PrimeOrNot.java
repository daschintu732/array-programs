package basic_programs;

import java.util.Scanner;

public class PrimeOrNot {

	private static void checkPrime(int num) {
		int count = 0;

		// negative numbers, 0 and 1 are not prime
		if (num < 2) {
			System.out.println(num + " is not a prime number!");
			System.exit(0);//Terminate the execution
		}
		// checking the number of divisors b/w [1, n]
		for(int i = 1; i <= num; i++) 
		{
			if (num % i == 0)
				count += 1;
		}

		// if count of divisors greater than 2 then its not prime
		if(count > 2)
			System.out.println(num + " is not a prime number");
		else
			System.out.println(num + " is a prime number");
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a number");
		int num = sc.nextInt();
		checkPrime(num);
		sc.close();
	}
}