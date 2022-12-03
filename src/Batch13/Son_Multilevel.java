package Batch13;

public class Son_Multilevel extends Father_Class{

	public void son() {
		System.out.println("I am Son");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Son_Multilevel test = new Son_Multilevel();
		test.grandfather();
		test.father();
		test.son();
		
		Father_Class fat=new Father_Class();
		fat.grandfather();
		fat.father();
		
	}

}
