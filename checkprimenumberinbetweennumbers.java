package java_prep;

public class checkprimenumberinbetweennumbers {
//check prime numbers in between numbers
//input: low=20, high=50
//output: 23,29,31,37,41,43,47
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int low=20;
		int high=100;
		int n=0;
		while(low<high)
		{
			boolean flag=false;
			for(int i=2;i<low;i++)
			{
				if(low%i==0)
				{
					flag=true;
					break;
				}
			}
			
			if(!flag)
			{
				System.out.println(low+ " ");
				n++;
			}
			
			low++;
		}
		System.out.println("The number of Prime Numbers : "+n);
			
		}

	}


