package java_prep;

public class fibancciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		int a=0;
		int b=1;
		int temp;
		System.out.print(a);
	    System.out.print(" "+b);
		for(int i=2;i<num;i++)
		{
			temp=a+b;
			a=b;
			b=temp;
			System.out.print(" " + temp);
			
		}
		

	}

}
