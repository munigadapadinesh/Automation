package java_prep;

public class checkuppercaseorlowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int uppercase_count=0;
	      int lowercase_count=0;
	      
	      String str1="ABCDEFGhj";
	      char[] ch=str1.toCharArray();
	      for(Character ch1:ch)
	      {
	    	  if(Character.isUpperCase(ch1))
	    	  {
	    		  uppercase_count++;
	    	  }
	    	  
	    	  else
	    	  {
	    		  lowercase_count++;
	    	  }
	      }
	      
	      System.out.println(uppercase_count);
	      System.out.println(lowercase_count);

	      
			


	}

}
