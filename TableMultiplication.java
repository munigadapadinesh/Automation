package java_prep;

public class TableMultiplication {
//Table Multiplication
//input 2
////output: 2x1=2
//	      2x2=4
//	    -----
//	      2x10=20
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2;
		int t=1;
		for(int i=1;i<=10;i++)
		{
			t=n*i;
			System.out.println(n+ "X" +i+ "=" +t);
		}
	}

}
