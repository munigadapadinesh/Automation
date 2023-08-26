package java_prep;

public class FinalFinally {

	public static void main(String[] args) {

		final int a = 4;
		int b = 10;

		// a = 10;
		System.out.println(a);

		try {

			int c = b / 0;
			System.out.println(c);

		} catch (Exception e)

		{

			System.out.println(e);
		}

		finally {
			
			System.out.println("done");
		}

	}
	
	

}
