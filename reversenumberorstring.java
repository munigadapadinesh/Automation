package java_prep;

import java.util.Scanner;

public class reversenumberorstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str	=sc.next();
		//String str="1234";
		String str1="";
	      
	      for(int i=str.length()-1;i>=0;i--)
	      {
	    	  str1=str1+str.charAt(i);
	      }
	      System.out.println(str1);

	}

}
