package java_prep;

public class countdigitsininteger {
//to count no of digits in number
//input:156789
//output:6
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1507890;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
