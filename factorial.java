package java_prep;
public class factorial {
//input: n=5
//output: 120
	public static void main(String[] args) {
		
	int n=5;
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	
       
}
}
