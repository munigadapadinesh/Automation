package java_prep;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class findsmallestsecondsmallestthirdsmallestinanarray {
//findsmallest,secondsmallest,thirdsmallestnumber of an Array
//input: {-90,1,5,7,89,768,769,98,895,897}
//output: -90 - smallest
//	       1  - second smallest
//	       5  - Third smallest
	public static void main(String [] args) throws IOException {
		
		int arr[]= {-90,1,5,7,89,768,769,98,895,897};
		System.out.println(Arrays.toString(arr));
		int min1=Integer.MAX_VALUE;
		int min=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(Integer arr1:arr)
		{
			
			if(arr1<min)
			{
				min=arr1;
			}
		}
		System.out.println(min);
		for(Integer arr1:arr)
		{
			if(arr1<min1 && arr1>min)
			{
				min1=arr1;
			}
		}
		System.out.println(min1);
		for(Integer arr1:arr)
		{
			if(arr1<min2 && arr1>min1 && arr1>min)
			{
				min2=arr1;
			}
		}
		System.out.println(min2);	
	}

	}

 