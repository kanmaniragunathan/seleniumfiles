package stringlearning;

public class strings {
	public static void main(String[] args) {
		String Value="KANMANI";
		char[]ch=Value.toCharArray();
		for(int a=0;a<ch.length-6;a++) {
			System.out.println( ch );

			char[]c=Value.toCharArray();
			for(int i= c.length-1;i>=0;i--) {
				System.out.print(c[i]);
			}


		}


	}

}



