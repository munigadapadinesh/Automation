package java_prep;

import java.util.Arrays;

public class removeduplicatefromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input = "abbddddccckkkkkkkkkkkkkkkkkkkghj";
        String output="";
        String output1="";

        for(int i=0;i<input.length();i++)
        {
        	char ch=input.charAt(i);
        	int k=output.indexOf(ch);
        	if(output.indexOf(ch)==-1)
        		{
                    output+=ch;
        			//System.out.println("Non Duplicate String" + output);
        		}
        		else
        		{
        			output1+=ch;
        			//System.out.println("Duplicate String" + output1);
                }
        	}
        System.out.println(output);
        System.out.println(output1);

	}
}