package week3;

  public class odduppercase {
	public static void main(String[] args) {

	String name="changeme";
	char[] ch = name.toCharArray();
	for(int k = 0; k <ch.length; k= k + 2){
	String UpperCase =name.toUpperCase();
	System.out.println(ch[k]);
	System.out.println(UpperCase);

}
	
	}
  }
