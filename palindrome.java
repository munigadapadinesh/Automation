package java_prep;

public class palindrome {
//input:madam
//output: Palidnrome
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="1234321";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
