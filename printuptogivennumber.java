package java_prep;

import java.util.Scanner;

public class printuptogivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			
			System.out.print(" " + i );
			System.out.print(" ");
		}
		

	}

}
