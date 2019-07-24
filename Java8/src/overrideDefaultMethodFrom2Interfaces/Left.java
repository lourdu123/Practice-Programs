package overrideDefaultMethodFrom2Interfaces;

public interface Left {

	public default void m1(){
		System.out.println("This is Left interface default method.");
	}
}
