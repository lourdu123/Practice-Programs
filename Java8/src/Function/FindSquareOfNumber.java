package Function;

import java.util.function.Function;

public class FindSquareOfNumber {

	public static void main(String[] args) {
		
		// first Integer is for input and second Integer is for output
		Function<Integer, Integer> square = i -> i*i;
		int result = square.apply(4);
		System.out.println(result);
		
	}
}
