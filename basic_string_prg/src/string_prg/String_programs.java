package string_prg;

public class String_programs {

	public static void main(String[] args) {
		// concatenation
		//length
		//trim
		//uppercase
		//lowercase
         //empty
		
		String str1=" hellow world";
		String str2=" i am back";
		String str3;
	     //	str3= str1+str2;
		//System.out.println(str3);
		
		//Another method for concatenation
		 System.out.println( str1. concat(str2));
		 
		 // find length of string
		 
		 System.out.println( str1. length());
		 
		 //trim remove extra spaces from front and back
		  
		 System.out.println(str1.trim());
		
		 // uppercase and lowercase
		 System.out.println( str1.toUpperCase());
		 
		 // empty check whether the string id empty or not specify as true or false
		 System.out.println(str1.isEmpty());
		 
		
	}

}
