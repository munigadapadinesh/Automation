package java_prep;

public class largestnumberamong3numbers {
//input:a=100;b=200;c=300
	//output:c is largest
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=200,c=300;
		if(a>b && a>c)
		{
			System.out.println("a is largest");
		}
		else if(b>c)
		{
			System.out.println("b is largest");
		}
		else
		{
			System.out.println("c is largest");
		}

	}

}
