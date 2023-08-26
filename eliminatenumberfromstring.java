package java_prep;

public class eliminatenumberfromstring {

	public static void main(String[] args) {

		// Java Program: String s = �sub53od73th�; Eliminate the numbers alone. Print the Alphabet.

		String s = "123456abcdefghij";
		char[] ch=s.toCharArray();
		String s1 = "";
		int count_digits=0;
		int count_char=0;

		for (Character ch1:ch) {

			if (Character.isDigit(ch1)) {
				//continue;
				count_digits++;
			}

			else {
				s1 = s1 + ch1;
				count_char++;
			}

		}

		System.out.println(s1);
		System.out.println("The number of characters in an string is " +count_char);
		System.out.println("The number of digits in an string is " +count_digits);

	}

}
