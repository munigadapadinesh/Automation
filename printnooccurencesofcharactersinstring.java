package java_prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class printnooccurencesofcharactersinstring {
	// input: BBAAEJKYTRD
   // output:
//	A 2
//	B 2
//	D 1
//	E 1
//	J 1
//	K 1
//	R 1
//	T 1
//	Y 1	
	
	public static void main(String[] args) {
	// print no occurences of characters in string
		String str="Bangalore weather is good";
		String str1=str.replace(" ", "");
		System.out.println(str1);
		char[] ch=str1.toCharArray();
		LinkedHashMap<Character,Integer> tm=new LinkedHashMap<Character,Integer>();
		for(char chars:ch)
		{
			if(tm.containsKey(chars))
			{
				tm.put(chars, tm.get(chars)+1);
			}
			else
			{
				tm.put(chars, 1);
			}
		}
		for(Map.Entry tm1:tm.entrySet())
		{
			System.out.println(tm1.getKey()+ " " +tm1.getValue());
		}
	
	
			
}
}
 