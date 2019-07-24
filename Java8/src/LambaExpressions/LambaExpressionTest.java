package LambaExpressions;

public interface LambaExpressionTest {

	public static void main(String[] args) {
		
		FunctionalInterface0Arguments test0Argument = () -> System.out.println("hello");
		test0Argument.test0();
		
		FunctionalInterface1Argument test1Argument = name -> System.out.println(name);
		test1Argument.test1("sagar");
		
		FunctionalInterface2Arguments test2Argument = (a, b) -> {
			System.out.println(a);
			System.out.println(b);
		};
		test2Argument.test2("pre ", "suf");
		
		FunctionalInterface3Arguments test3Argument = (a, b, c) -> { return a+b+c; };
		System.out.println(test3Argument.test3(1,5,4));
	}
}
