package java_prep;

public class swapnumbers {
////This program is to swap numbers
//	input: a=10; b=20;
//	output: a=20;b=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=20;
		
		//Logic 1  using third variable
		
	/*	System.out.println("Before Swapping the number are..."+a+" "  +b);
	
		int t=a;
		a=b;
		b=t;
		
		System.out.println("After Swapping the number are..."+a+" "  +b); */
		
		//Logic 2   use + & - operators
		
		System.out.println("Before Swapping the number are..."+a+" "  +b);

		
		a=a+b;  //a=10+20=30
		b=a-b;  //b=30-20=10
		a=a-b;   //a=30-10=20
		
		System.out.println("After Swapping the number are..."+a+" "  +b); 
		
		
		//Logic 3 using * & / operators
		
/*		System.out.println("Before Swapping the number are..."+a+" "  +b);
		
		a=a*b;   // a=10*20=200
		b=a/b;   //b=200/20=10
		a=a/b;   //a=200/10=20
		
		System.out.println("After Swapping the number are..."+a+" "  +b);  */

		//Logic4 bitwise XOR
		
	/*	System.out.println("Before Swapping the number are..."+a+" "  +b);

		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After Swapping the number are..."+a+" "  +b);  */
		
		//Logic 5 - single statement
		
			System.out.println("Before Swapping the number are..."+a+" "  +b);

		
		b=a+b-(a=b);
		
		System.out.println("After Swapping the number are..."+a+" "  +b);
	}

}
