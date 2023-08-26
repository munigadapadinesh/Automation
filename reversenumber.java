package java_prep;

import java.util.Scanner;
//input:1234
//output:4321
public class reversenumber {

	public static void main(String[] args) {
    //Logic1
		
		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter a number");
		
		int num=sc.nextInt();	
		//1.using algorithm
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		} 
		System.out.println(rev);
		
		}

}
