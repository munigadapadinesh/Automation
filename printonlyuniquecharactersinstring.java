package java_prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class printonlyuniquecharactersinstring {
	//input: AABBCD
	//output: C D
	public static void main(String [] args) {
	
	String str="AABBCD";
	char[] ch=str.toCharArray();
	LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<Character,Integer>();
	for(Character chars:ch)
	{
		if(lhm.containsKey(chars))
		{
			lhm.put(chars, lhm.get(chars)+1);
		}
		else
		{
			lhm.put(chars, 1);
		}
	}
	Set<Character> st=lhm.keySet();
	for(Character st1:st)
	{
		if(lhm.get(st1)==1)
		{
			System.out.println("Non-Duplicate element " +st1+ " "+ lhm.get(st1));
		}
	}
		
		
	
			

}
}
 