package overrideDefaultMethodFrom2Interfaces;

public class Test implements Left, Right {
	
	public void m1(){
		
		System.out.println("This is myown m1() method.");
		
		// calling supertype Left interface m1() method.
		Left.super.m1();
		
		// calling supertype Right interface m1() method.
		Right.super.m1();
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.m1();
		
		

	}

}
