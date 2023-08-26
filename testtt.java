package excelhandson;

import java.util.ArrayList;

public class testtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
	    arrlist.add(i);
	     
        }
        System.out.println(arrlist);
	    ArrayList<Integer> arrlist1 = new ArrayList<Integer>();
	    for(int i=0;i<20;i++)
        {
		    boolean retval = arrlist.contains(i);
		    if (retval == true) {
			      System.out.println(i+ "Present");
			    } else {
			      System.out.println(i+ "is not Present");
			    }
			    
	     
        }
	   
}
}
