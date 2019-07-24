package methodReference;

public class StaticMethodReference2 {

	public static void myTest(){
		System.out.println("this is interface test() method implementation..");
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceExample fi = StaticMethodReference2::myTest;
		fi.test();  // fi's test() referce myTest() method. here the rule is test() method
		            // and myTest() method argument types should match.... ReturnType and method
		            // name doesn't matter..
	}
}
