package BiConsumer;

import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> bc = (a,b) -> {
			System.out.println(a);
			System.out.println(b);
		};
		
		bc.accept(5, 6);
	}
	
}
