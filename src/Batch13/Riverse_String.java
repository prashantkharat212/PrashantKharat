package Batch13;

public class Riverse_String {

	public static void main(String[] args) {
		// Riverse String
		
		String s1="Prashant";
		String s2="";
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(7));
		
		//reverse string
		
		for(int i=s1.length()-1;i>=0;i--) {
			
			s2=s2+s1.charAt(i);
			
		}
		System.out.println(s2);

	}

}
