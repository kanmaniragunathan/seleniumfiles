package week3;

public class anagram {

	public static void main(String[] args) {

		String value="Stops";
		
		String value1="Spots";
		if
		(value==value1) {
			System.out.println("he given strings are Anagram");
		}
		else
		{
		char[] ch = value.toCharArray();
		
		for (int i = ch.length; i <=0 ; i++) {
			System.out.print(ch[i]);
		}
	
		 char[] dh = value1.toCharArray();
		
		for (int j = dh.length; j <=0 ; j++) {
			System.out.print(dh[j]);
		}
			System.out.println("strings are not an Anagram");
}
	}
	
}



