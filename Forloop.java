package java_prep;

public class Forloop {

	public static void main(String[] args) {
	
		for(int i=5; i<=10;i++) {
			
			if(i==9) {
				
				continue;
				
			}			
			System.out.println(i);
		}

		int j=0;
		
		while(j<=5) {
			
			System.out.println(j);
			j++;
		}

	}
	
	
}
