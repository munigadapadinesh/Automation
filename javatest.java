package Capgemini.Automation;

import java.util.HashSet;
import java.util.Set;

public class javatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="123ABCDabcd";
		int upper_case_count=0;
		int lower_case_count=0;
		String str1="";
		String str2="";
		int num=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				upper_case_count++;
				str1+=str.charAt(i);
				
			}
			
			else if(Character.isLowerCase(str.charAt(i)))
			{
				lower_case_count++;
				str2+=str.charAt(i);
			}
			else
			{
				num++;
			}
			
			
			
		}
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(num);
		System.out.println(upper_case_count);
		System.out.println(lower_case_count);

	}

}
