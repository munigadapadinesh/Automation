package java_prep;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "Hi This is Priya from salessm";
		// length
		System.out.println(str.length());

		// particular leeter in index
		System.out.println(str.charAt(6));

		// index of some letter

		System.out.println(str.indexOf('s')); // frst occurence of s

		System.out.println(str.indexOf('s', (str.indexOf('s')) + 2)); // 2 nd occurence of S

		// System.out.println('s',(str.indexOf(str.indexOf('s',(str.indexOf('s'))+1
		// ))+1)); // 3rd occurence

		// COMPARE THE STRING
		String s = "hi hello";
		String s2 = "Hi hello";
		System.out.println(s.equals(s2));// with case sensitive
		System.out.println(s.equalsIgnoreCase(s2));

		// substring
		System.out.println(str.substring(0, 7));

		// Split method
		String h = "Hi_Hello_World";
		String h2[] = h.split("_");
		for(int i=0;i<h2.length;i++) {			
			System.out.println(h2[i]);		
		}
		//replace
		String date = "01-10-2019";
		System.out.println(date.replace("-", "/"));
		
		// trim - it will remove only front and back space 
		
		String t =  "  hi world  ";
		System.out.println(t.trim());

		//concat some thing
		 String con = "cons";
		 System.out.println(con.concat("ss"));
		 
		 String x = "hi";
		 String y = "hello";
		 int a =100;
		 int b = 300;
		 
		 System.out.println(x+y);
		 System.out.println(x+y+a+b);
		 System.out.println(a+b+x+y);
		

		
	}

}
