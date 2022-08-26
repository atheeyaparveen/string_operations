package string_prg;

public class String_comparision {

	public static void main(String[] args) {
		// compare to(case sensitive)
		//matches
		//equals(case sensitive)
		String str1=" i love java coding";
		String str2="java";
		String a="ABC";
		String b="ABC";
		System.out.println( str1.compareTo(str2));
        System.out.println( str1.compareToIgnoreCase(str2));
        
        System.out.println(str1.matches(str2));
        
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
	}

}
