package java_prep;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=371;
		int org=num;
		double result=0;
		
		while(num>0)
		{
			int n=num%10;
			result=result+Math.pow(n, 3);
			num=num/10;
			
		}
		if(result==org)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}

	}

}
