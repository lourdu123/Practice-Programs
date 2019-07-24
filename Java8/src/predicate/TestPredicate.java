package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestPredicate {

	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple("green", 200), new Apple("red", 150), new Apple("orange",200));
		
		List<Apple> applesWeightMoreThan150 = apples.stream().filter(apple -> apple.getWeight() > 150).collect(Collectors.toList());
		System.out.println(applesWeightMoreThan150);
		
		// get apples whose weight is morethan 150
		List<Apple> applesWeightMoreThan150WithPredicate = apples.stream().filter(ApplePredicate.isWeightGreaterThan150()).collect(Collectors.toList());
		System.out.println(applesWeightMoreThan150WithPredicate);
		
		// get apples whose weight is morethan 150 AND color is green  // AND
		List<Apple> applesWeightMoreThan150AndColorGreenWithPredicate = apples.stream().filter(ApplePredicate.isWeightGreaterThan150().and(ApplePredicate.isColorGreen())).collect(Collectors.toList());
		System.out.println(applesWeightMoreThan150AndColorGreenWithPredicate);
		
		// get apples whose weight is morethan 150 OR color is red  // OR
		List<Apple> applesWeightMoreThan150AndColorRedWithPredicate = apples.stream().filter(ApplePredicate.isWeightGreaterThan150().or(ApplePredicate.isColorRed())).collect(Collectors.toList());
		System.out.println(applesWeightMoreThan150AndColorRedWithPredicate);
		
		// get apples whose color is otherthan red  // NEGATE
		List<Apple> applesColorOtherThanRedWithPredicate = apples.stream().filter(ApplePredicate.isColorRed().negate()).collect(Collectors.toList());
		System.out.println(applesColorOtherThanRedWithPredicate);
		
		// TEST METHOD
		boolean isColorRedWithPredicate = ApplePredicate.isColorRed().test(new Apple("pink", 300));
		System.out.println(isColorRedWithPredicate);
		
		boolean isColorRedWithPredicate2 = ApplePredicate.isColorRed().test(new Apple("red", 300));
		System.out.println(isColorRedWithPredicate2);
				
	}
}
