package Batch13;

public class Test {

               // Program for addInteger	
		
		public int a=10;
		static int b=20;
		
		public void sum() {
			
			 int c=a+b;
			 System.out.println(c);
			 
	}
		
		public static void main(String [] args) {
			
			Test ts=new Test();
			System.out.println(ts.a);
			System.out.println(Test.b);
			ts.sum();
			
			
			
			
		}

}
