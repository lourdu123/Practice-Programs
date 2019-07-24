package overrideObjectClassMethodInInterface;

public interface Test {

	// we can not override Object class methods in Interface in java8
	public default String toString(){
		
	}
}
