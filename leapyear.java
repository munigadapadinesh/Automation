package java_prep;

import java.util.Scanner;
//input:1900
//output: Not leap year
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int a=sc.nextInt();
		if(((a%4==0) && (a%100!=0 )) || (a%400==0) )
		{
			System.out.println("Entered year is leap year");
		}
		else
		{
			System.out.println("Entered year is not leap year");
		}

	}

}
