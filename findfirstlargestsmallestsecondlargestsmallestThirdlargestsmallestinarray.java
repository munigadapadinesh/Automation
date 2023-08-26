package java_prep;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class findfirstlargestsmallestsecondlargestsmallestThirdlargestsmallestinarray {
//findfirstlargestsmallest,secondlargestsmallest,Thirdlargestsmallestinarray
//input: {1,2,3,4,5,6}
//output: 1 - smallest
//	      2  - second smallest
//	      3  - Third smallest
//	      6- largest
//	      5 -second largest
//	      4- Third largest
	public static void main(String [] args) throws IOException {
		
		int arr[]= {1,2,3,4,5,6};
		int min1=Integer.MAX_VALUE;
		int min=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		int max=arr[0];
		int max1=arr[0];
		int max2=arr[0];
		for(Integer arr1:arr)
		{
			if(arr1<min)
			{
				min=arr1;
			}
			else if(arr1>max)
			{
				max=arr1;
			}
		}
		System.out.println(min);
		System.out.println(max);
		for(Integer arr1:arr)
		{
			if(arr1<min1 && arr1>min)
			{
				min1=arr1;
			}
			else if(arr1>max1 && arr1!=max)
			{
				max1=arr1;
			}
		}
		System.out.println(min1);
		System.out.println(max1);
		for(Integer arr1:arr)
		{
			if(arr1<min2 && arr1>min1 && arr1>min)
			{
				min2=arr1;
			}
			else if(arr1>max2 && arr1!=max1 && arr1!=max)
			{
				max2=arr1;
			}
		}
		System.out.println(min2);
		System.out.println(max2);

		
		
		
	}

	}

 