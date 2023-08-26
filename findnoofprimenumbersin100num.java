package java_prep;

public class findnoofprimenumbersin100num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		String primenumbers="";
		
		
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				//System.out.println("Prime Number");
				primenumbers+= i+ " ";
				//a+=10  a=a+10;
				
			}
		}
		System.out.println(primenumbers);
		

	}

}
