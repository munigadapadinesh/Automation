package java_prep;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Dinesh Munigadapa";
		String str1="";
		char[] ch=str.toCharArray();
		for(Character ch1:ch)
		{
			if(ch1.equals('a') || ch1.equals('e'))
			{
				str1+=ch1;
				
			}
			
		}
		System.out.println(str1);

	}

}
