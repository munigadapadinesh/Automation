package java_prep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int r=5;
//		double area=3.14*r*r;
//		System.out.println(area);
		String str="textbook";
		
		Pattern pattern = Pattern.compile("ext");
	    Matcher matcher = pattern.matcher("textbook");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }

	}

}
