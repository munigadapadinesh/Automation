package java_prep;

import java.util.Scanner;

public class findprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		
		int count=0;
		
		
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Non Prime Number");
		}
	

	}
}


