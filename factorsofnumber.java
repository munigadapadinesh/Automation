package java_prep;

public class factorsofnumber {
//input:60
//output:1 2 3 4 5 6 10 12 15 20 30 60 
	public static void main(String[] args) {
		
		int num=60;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+ " ");
			}
		}

	}

}
