package java_prep;

import java.util.Scanner;

public class reversingeachwordinstring {
	//reverseeachwordatsameplace
		//input: My Name is Dinesh
		//output: yM emaN si hseniD
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My Name is Dinesh";
		String revstring="";
		String[] words=str.split(" ");
		for(String word:words)
		{
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
