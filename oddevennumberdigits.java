package java_prep;

public class oddevennumberdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="1234568";
		int odd_count=0;
	    int even_count=0;
	      for(int i=0;i<=str.length()-1;i++)
	      {
	    	  if(str.charAt(i)%2==0){
	    		  even_count++;
	    	  }
	    	  else
	    	  {
	    		  odd_count++;
	    	  }
	      }
	      System.out.println(even_count);
	      System.out.println(odd_count);

	}

}
