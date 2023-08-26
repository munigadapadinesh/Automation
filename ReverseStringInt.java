package java_prep;

public class ReverseStringInt {

	public static void main(String[] args) {

		int numb = 12345;
	//	 usig string Buuffer
		StringBuffer rev;
		StringBuffer sb = new StringBuffer(String.valueOf(numb));
		
		rev = sb.reverse();
		System.out.println(rev);
		String str = "Hello world";
		StringBuffer sb1 = new StringBuffer(str);
		
		System.out.println(sb1.reverse());
		String str1 = "Hello world";
		String revers = "";
		int len = str1.length();
		
		for (int i = len - 1; i >= 0; i--) {
			revers = revers + str1.charAt(i);
		}
		
//		System.out.println(revers);
		
		String str4 = "hi this is priya";
		String reve = "";
		
		for(int i=str4.length()-1;i>=0;i--) {
			
			reve= reve+ str4.charAt(i);
			
		}
		System.out.println(reve);

		
		// reverse each word without 
	}
	
	
	
	
	
	
	

}
