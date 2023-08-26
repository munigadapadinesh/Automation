package java_prep;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class findduplicateelementsinanarray {
//input:{1,5,6,7,6,5,4,7,5,4}
//output:5
//	     6
//	     7
//	     4

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,5,6,7,6,5,4,7,5,4};
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
		Set<Integer> hs=lhm.keySet();
		for(Integer arr1:hs)
		{
			if(lhm.get(arr1)>1)
			{
				System.out.println(arr1);
			}
		}

	}

}
