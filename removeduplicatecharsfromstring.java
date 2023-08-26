package java_prep;
import java.util.HashSet;
public class removeduplicatecharsfromstring {
     //input:AAABBCDEFFG;
	 //output:ABCDEFG
	
	public static void main(String[] args) {
	
		String str="AAABCCDEEFG";
		char[] chars=str.toCharArray();
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			hs.add(chars[i]);
		}
		for(Character ch1:hs)
		{
			System.out.print(ch1);
		}
			
}
}
 