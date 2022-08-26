package string_prg;

public class String_conversion_operation {

	public static void main(String[] args) {
		// int-string
		//int-hex etc
		//string-int
		//string-hex
		
		int num=100;
		System.out.println(Integer.toString(num));
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toOctalString(num));
		
		String str1="100";
		String str2="0101010";
		String str3="64";
		String str4="141";
		System.out.println(Integer.parseInt(str1));
         System.out.println(Integer.parseInt(str2,2));
         System.out.println(Integer.parseInt(str3,16));
         System.out.println(Integer.parseInt(str4, 8));
	}

}
