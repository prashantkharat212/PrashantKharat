 package Batch13;

public class Fibnscci_Series {

	public static void main(String[] args) {
		// FABNOSCIS SERIES
		
		int a=0;
		int b=1;
		int c;
		
		for(int i=1; i<=10;i++) {       //i=1
			
			c=a+b;
		  System.out.println(c);        //c=1,2,3,5,8
		   a=b;                // 1,2,3,5
		   b=c;                // 1,2,3,8
			
			
		}

	}

}
