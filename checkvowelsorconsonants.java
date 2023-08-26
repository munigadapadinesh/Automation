package java_prep;

public class checkvowelsorconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      String str="aeioubcd";
      char[] ch=str.toCharArray();
      int vowel_count=0;
      int consonant_count=0;
      for(Character ch1:ch)
      {
    	  if(ch1=='a' || ch1=='e'|| ch1=='i' || ch1=='o' || ch1=='u')
    	  {
    		  vowel_count++;
    	  }
    	  else
    	  {
    		  consonant_count++;
    	  }
      }
      System.out.println(vowel_count);
      System.out.println(consonant_count);


	}

}
