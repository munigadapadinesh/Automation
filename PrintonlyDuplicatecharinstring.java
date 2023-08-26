package java_prep;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class PrintonlyDuplicatecharinstring {
//input: AAABCDD
// output:
//A
//D
	
	public static void main(String[] args) {
		String str="Bangalore weather is good";
		char[] ch=str.toCharArray();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		for(Character chars:ch)
		{
			if(hm.containsKey(chars))
			{
				hm.put(chars, hm.get(chars)+1);
			}
			else
			{
				hm.put(chars, 1);
			}
		}
		Set<Character> st=hm.keySet();
		for(Character hm1:st)
		{
			if(hm.get(hm1)>1)
			{
				System.out.println(hm1);
			}
		}
		
		
		       }  
		}  