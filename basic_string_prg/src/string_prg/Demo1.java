package string_prg;

public class Demo1 {

	public static void main(String[] args) {
		
		for(int i=5; i<=50 ;i++) {
			i= i+5;
			if(i==25) {
				continue;
			}
			System.out.println(i);
		}

	}

}
