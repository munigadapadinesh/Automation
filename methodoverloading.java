package java_prep;

public class methodoverloading {
	
	int add(int a,int b)
	{
		return (a+b);
	}
	
	int add(int a,int b,int c)
	{
		return (a+b+c);
	}
	
	double add(double a,double b,double c)
	{
		return (a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodoverloading mo=new methodoverloading();
		System.out.println(mo.add(0.5, 1.4, 5.6));
		System.out.println(mo.add(3, 5));
		System.out.println(mo.add(0, 0, 0));
		
		

	}

}
