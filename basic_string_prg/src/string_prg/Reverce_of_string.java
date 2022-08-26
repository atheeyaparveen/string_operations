package string_prg;

public class Reverce_of_string {

	public static void main(String[] args) {
		String str1="hellow world";
	String rev="";
	for(int i=0;i<=str1.length()-1; i++) {
		//rev=rev+str1.charAt(i);
		rev=str1.charAt(i)+rev;
		//System.out.println(rev);
		}
	System.out.println(rev);
		
//		char[] chars = str1.toCharArray();
//		for(int i=chars.length-1; i >= 0; i--) {
//			
//			System.out.print(chars[i]);
//		}

	}

}
