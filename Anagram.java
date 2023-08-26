package java_prep;

import java.util.Arrays;

public class Anagram {
//This program is to check whether given Strings are Anagram or not
//	input: Str1=Abcd
//		   Str2=Dcba
//	output: both are anagram	   
		   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Grab";
		String str2="Brag";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length())
		{
			System.out.println("Both String are not Anagram");
		}
		else
		{
			char[] array1=str1.toCharArray();
			char[] array2=str2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			if(Arrays.equals(array1, array2)==true)
			{
				System.out.println("Both are Anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
			
		}
		
		

	}

}
