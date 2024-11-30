package week3;

public class duplicate {
	public static void main(String[] args) {
	String text = "We learn Java basics as part of java sessions in java week1";
	//text.substring(0);
	//text.substring(0,0);
	//String substring = text.substring(53);
	String replaceAll = text.replaceAll("java","    ");
	System.out.println(replaceAll);
	//System.out.println(substring);
		
	}

}
