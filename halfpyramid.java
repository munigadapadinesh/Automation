package java_prep;

public class halfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//half pyramid using stars
		
		int rows=5;
		
		for(int i=1;i<=rows;++i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//half pyramid using numbers
		for(int i=1;i<=rows;++i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		// Inverted half pyramid using *
		for(int i=rows;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
