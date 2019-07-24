package LambaExpressions;

@FunctionalInterface
public interface FunctionalInterface3Arguments {

	public int test3(int a, int b, int c);
	
	default void test4(){      // default method 
		System.out.println("this is default method....");
	}
	
	public static void test5(){  // static method
		System.out.println("this is static method...");
	}
	
	@Override
	public String toString();  // overridden from object class
	
}
