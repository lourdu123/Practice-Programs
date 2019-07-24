package FunctionChaining;

import java.util.function.Function;

public class FunctionCompose {

	public static void main(String[] args) {
		Function<Integer,Integer> f1 = i -> i*2;
		Function<Integer,Integer> f2 = i -> i*i*i;
		
		// f1 will be executed first and then f2
		System.out.println(f1.andThen(f2).apply(2));
		
		// f2 will be executed first and then f1
		System.out.println(f1.compose(f2).apply(2));
		
	}
}
