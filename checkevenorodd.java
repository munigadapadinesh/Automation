package java_prep;

import java.util.Scanner;

public class checkevenorodd {
//to check even or odd
//input: 3
//output: odd
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd Number");
		}

	}

}
