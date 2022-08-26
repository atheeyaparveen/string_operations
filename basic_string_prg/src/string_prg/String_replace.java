package string_prg;

public class String_replace {

	public static void main(String[] args) {
		//replace
		//replace all
		String str1="hellow asna  world";
				String str2="asna";
		String str3=" ";
		System.out.println(str1.replace(str2, str3));
		
		String str4=" hellow@#$%%^ world&*(^?  1234";
		String str5="[^A-Za-z0-9\\s]";
		System.out.println(str4.replaceAll(str5, ""));
		

	}

}
