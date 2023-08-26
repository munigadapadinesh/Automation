package java_prep;

public class eliminatecharacterfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String s="abcd1234";
	    char[] ch=s.toCharArray();
		String s1="";
		int count_alpha=0;
		int count_number=0;
		
		for(Character ch1:ch)
		{
			if(Character.isDigit(ch1))
			{
				s1=s1+ch1;
				count_number++;
			}
			
			else
				
		{
				
				count_alpha++;
			}
		
		
		
		
		

	}
		System.out.println(s1);
		System.out.println(count_alpha);
		System.out.println(count_number);
	}
}




