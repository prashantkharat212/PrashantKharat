package Batch13;

public class Child1 extends Parent1 {

	public void child1() {
		System.out.println("I am child 1");
	}
	
	
	
	public static void main(String[] args) {
		
		Child1 test=new Child1();
		test.ride();
		test.play();
		test.child1();

	}

}
