package Streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiplyArrayElements {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,9,7,12,10);
		List<Integer> numbersMultiplied = numbers.stream().map(n -> n*2).collect(Collectors.toList());
		System.out.println(numbersMultiplied);
		
		// count
		long count = numbers.stream().map(i -> i*3).count();
		System.out.println(count);
		
		// sorted
		List<Integer> sortedIntegers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedIntegers);
		
		// sort using comparator
		List<Integer> customSortedIntegers = numbers.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(customSortedIntegers);
		
		// min
		int min = numbers.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		
		// max
		 int max = numbers.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		 System.out.println(max);
		 
		 // toArray + constructor reference
		 Integer[] array = numbers.stream().toArray(Integer[]::new);
		 
		 // of
		 Stream s = Stream.of(1,11,111,1111,11111);
		 s.forEach(System.out::println);
		 
		
	}
}
