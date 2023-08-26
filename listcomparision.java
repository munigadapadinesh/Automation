package java_prep;

public class listcomparision {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1;;2;;3::4;;::7;;";
		String[] str1 = str.split("::");
		for (int i = 0; i < str1.length; i++) {
			String str2 = str1[i];
			String str3[] = str2.split(";;");
			for (int j = 0; j < str3.length; j++) {
				System.out.println(str3[j]);
			}
		}
	}
}
