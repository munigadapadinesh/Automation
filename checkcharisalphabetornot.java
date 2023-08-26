package java_prep;

public class checkcharisalphabetornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='B';
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println(ch+ " is Alphabet");
		}
		else
		{
			System.out.println(ch+ " is not an Alphabet");
		}

	}

}
