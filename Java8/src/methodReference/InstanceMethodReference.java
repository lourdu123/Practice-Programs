package methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class InstanceMethodReference {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,22,12,25,15);
		Optional<Integer> number = numbers.stream().reduce(Math::max);
		number.ifPresent(System.out::println);
	}
}
