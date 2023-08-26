package java_prep;

import java.util.LinkedHashMap;
import java.util.Set;

public class removeduplicatefromarray {
//remove duplicates from Array
//input : {1,4,4,7,8,7,8,9}
//output: 1 9
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,4,7,8,7,8,9};
		LinkedHashMap<Integer, Integer> lhm=new LinkedHashMap<Integer, Integer>();
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
		Set<Integer> st=lhm.keySet();
		for(Integer st1:st)
		{
			if(lhm.get(st1)==1)
			System.out.println(st1);
		}
		}

}
