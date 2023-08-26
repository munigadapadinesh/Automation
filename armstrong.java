package java_prep;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=371 ;
		int org=num;
		int sum=0;
		while(num!=0)
		{
			
			sum=sum+(num%10)*(num%10)*(num%10);
			
			num=num/10;
		}
		System.out.println(sum);
		
		if(org==sum)
		{
			System.out.println("The number is Armstrong number");
		}
		
		else
		{
			System.out.println("The number is not Armstrong number");
		}

	}

}
