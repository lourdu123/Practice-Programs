package overrideDefaultMethodFrom2Interfaces;

public interface Right {

	public default void m1(){
		System.out.println("This is Right interface default method.");
	}
}
