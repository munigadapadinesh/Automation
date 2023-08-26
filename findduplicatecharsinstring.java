package java_prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class findduplicatecharsinstring {
//input: AAABCCDEEFG
//output: A 3
//	      C 2
//	      E 2
	
	
	public static void main(String[] args) {
	
		String str="AAABCCDEEFG";
		char[] chars=str.toCharArray();
		LinkedHashMap<Character,Integer> hm =new LinkedHashMap<Character,Integer>();

		for(Character ch:chars)
		{
						if(hm.containsKey(ch))
			{
				hm.put(ch, (hm.get(ch))+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		Set<Character> st=hm.keySet();
		
		for(Character st1:st)
		{
			if(hm.get(st1)>1)
			{
				System.out.println(st1);
				System.out.println("Char" +st1+"  " +hm.get(st1));
			}
		}
		
		
}
}
 