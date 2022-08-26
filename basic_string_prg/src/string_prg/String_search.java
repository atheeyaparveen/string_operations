package string_prg;

public class String_search {

	public static void main(String[] args) {
		//contains(case sensitive)
		//start with "
		//ends with
		//index of 
		//last index of
		String str1="i love java coding java";
		String str2="java";
		String str3="LOVE";
		
		System.out.println( str1.contains(str2));
        System.out.println(str1.toLowerCase().contains(str3.toLowerCase()));
        
        System.out.println(str1.startsWith(str3));
        
        System.out.println(str1.endsWith(str3));
        
        System.out.println( str1.indexOf(str2));
        System.out.println(str1.indexOf(str2, 8));
        System.out.println(str1.lastIndexOf(str2));
	}

}
