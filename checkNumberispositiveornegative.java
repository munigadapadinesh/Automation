package java_prep;

import java.util.Scanner;

public class checkNumberispositiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive Number");
		}
		else if(n<0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("The Number is neither positive nor negative");
		}

	}

}
