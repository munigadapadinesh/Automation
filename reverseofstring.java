package java_prep;

public class reverseofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="1234";
		String output="";
		for(int i=str.length()-1;i>=0;i--)
		{
			output+=str.charAt(i);
		}
		System.out.println(output);

	}

}
