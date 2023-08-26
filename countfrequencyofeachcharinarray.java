package java_prep;

import java.util.LinkedHashMap;
import java.util.Map;

public class countfrequencyofeachcharinarray {
//countfrequencyofeachcharacterinarray
//input: {5,7,4,5,7,3}
//output :Number 5 repeated 2 times
//	Number 7 repeated 2 times
//	Number 4 repeated 1 times
//	Number 3 repeated 1 times

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,7,4,5,7,3};
		LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<Integer,Integer>();
		for(Integer arr1:arr)
		{
			if(lhm.containsKey(arr1))
			{
				lhm.put(arr1, lhm.get(arr1)+1);
			}
			else
			{
				lhm.put(arr1, 1);
			}
		}
		for(Map.Entry hm:lhm.entrySet())
		{
			System.out.println("Number " +hm.getKey()+ " repeated " +hm.getValue()+ " times" );
		}

	}

}
