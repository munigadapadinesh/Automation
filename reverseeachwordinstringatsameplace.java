package java_prep;

import java.util.LinkedHashMap;
import java.util.Map;

public class reverseeachwordinstringatsameplace {
	
	// Input: I am Dinesh
	// Output: I ma hseniD

	public static void main(String[] args) {
		
	String str="I am Dinesh";
	String revstring="";
	String words[] =str.split(" ");
	for(int i=0;i<words.length;i++)
	{
		String word=words[i];
		String revword="";

		for(int j=word.length()-1;j>=0;j--)
		{
			revword+=word.charAt(j);
		}
		revstring+=revword+" ";
	}
	System.out.println(revstring);
		
		
}
}
 