package FlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		List<Integer> c = new ArrayList<>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		
		b.add(4);
		b.add(5);
		b.add(6);
		
		c.add(7);
		c.add(8);
		c.add(9);
		
		List<List<Integer>> numbers = new ArrayList<List<Integer>>();
		numbers.add(a);
		numbers.add(b);
		numbers.add(c);
		
		List<Integer> numbersStream = numbers.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(numbersStream);
	}
}
