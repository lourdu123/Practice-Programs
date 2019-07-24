package methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InstanceMethodReferenceFromClassType {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("Ram", "Kapil", "Sagar");
		
		List<String> sorted = numbers.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(sorted);
		
		List<String> sorted2 = numbers.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println(sorted2);
	}
}
