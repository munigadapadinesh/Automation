package java_prep;

public class checkprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=5;
		int count=0;
		
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
			
			
			
		}
		
		if(count==2)
		{
			System.out.println("prime number");
		}
		
		else
		{
			System.out.println("not prime number");
		}

	}

}
