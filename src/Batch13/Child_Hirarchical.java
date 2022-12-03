package Batch13;

public class Child_Hirarchical extends Parent1 {

	public void Hirarchical() {
		System.out.println("I am Hirarchical");
	}
	
	public static void main(String[] args) {
		
		Child_Hirarchical test1 = new Child_Hirarchical();
		test1.ride();
		test1.play();
		test1.Hirarchical();
	}

}
