package predicate;

import java.util.function.Predicate;

public class ApplePredicate {

	public static Predicate<Apple> isWeightGreaterThan150(){
		return apple -> apple.getWeight() > 150;
	}
	
	public static Predicate<Apple> isColorGreen(){
		return apple -> apple.getColor().equals("green");
	}
	
	public static Predicate<Apple> isColorRed(){
		return apple -> apple.getColor().equals("red");
	}
}
