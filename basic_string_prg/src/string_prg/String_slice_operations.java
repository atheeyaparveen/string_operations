package string_prg;

public class String_slice_operations {

	public static void main(String[] args) {
		//char at
		//substring
		//split
		
		String str1=" hellow world";
		String str2=" i am back";
		String str3="a";
		System.out.println(str1.charAt(4));
		
		System.out.println(str1.substring(4));
		System.out.println(str1.substring(4, 9));
		
		String  arr[]=str2.split(str3);
		for(String x : arr ) {
			System.out.println(x);
		}

	}

}
