package java_prep;

import java.util.Set;
import java.util.TreeMap;

public class repeatedcharactersinarray {

	//input :  {1,3,4,6,4,6,8,9}
	//output : 4 6
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,3,4,6,4,6,8,9};
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		for(Integer arr1:arr)
		{
			if(tm.containsKey(arr1))
			{
				tm.put(arr1, tm.get(arr1)+1);
			}
			else
			{
				tm.put(arr1, 1);
			}
		}
		Set<Integer> st=tm.keySet();
		for(Integer st1:st)
		{
			if(tm.get(st1)>1)
			{
				System.out.println(st1);
			}
		}
			
			

	}
}

