package java_prep;

public class sumofnaturalnumbersusingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int sum=addNum(5);
		System.out.println(sum);

	}
	
	public static int addNum(int num)
	{
		if(num!=0)
		{
			return num +addNum(num-1);
	}
		else
		{
			return num;
		}

}
}
