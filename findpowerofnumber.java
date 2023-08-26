package java_prep;

public class findpowerofnumber {
//input: base=4; exponent=3
//output: 4^3=64
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=4;
		int result=1;
		int exponent=3;
		System.out.println(Math.pow(base, exponent));


		while(exponent!=0)
		{
			result*=base;
			exponent--;
		}
		System.out.println(result);

	}

}
