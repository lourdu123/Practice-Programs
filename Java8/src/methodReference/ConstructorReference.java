package methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReference {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("sagar", "vijay", "hanu", "santosh");
		names.stream().filter(s -> s.startsWith("s")).collect(Collectors.toList());
	}
}
