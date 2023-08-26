package java_prep;

import java.util.Scanner;

public class findevenoddnumberinnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	if(a%2==0)
	{
		System.out.println("Even number");
	}
	else
	{
		System.out.println("Odd number");
	}
	}
}
