package java_prep;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstsecondThirdLargestnumberinarray {

	//firstsecondandthirdlargestnumberinanarray
//	input:{-90,1,5,7,89,768,769,98,895,897}
//	output: largest 897;secondlargest 895;thirdlargest 769
	public static void main(String [] args) throws IOException {
		
		int arr[]= {-90,1,5,7,89,768,769,98,895,897};
		int max=arr[0];
		int max1=arr[0];
		int max2=arr[0];
		for(Integer arr1:arr)
		{
			if(arr1>max)
			{
				max=arr1;
			}
		}
		System.out.println(max);
		for(Integer arr1:arr)
		{
			if(arr1>max1 && arr1!=max)
			{
				max1=arr1;
			}
		}
		System.out.println(max1);
		for(Integer arr1:arr)
		{
			if(arr1>max2 && arr1!=max1 && arr1!=max)
			{
				max2=arr1;
			}
		}
		System.out.println(max2);
		}

}
