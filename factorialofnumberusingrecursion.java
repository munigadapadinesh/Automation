package java_prep;

public class factorialofnumberusingrecursion {
//input:5
//output:120
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		int factt=fact(num);
		System.out.println(factt);

	}
	
	public static int fact(int num)
	{
		if(num!=0)
		{
		return num*fact(num-1);
		}
		else
		{
			return 1;
		}
	}

}
