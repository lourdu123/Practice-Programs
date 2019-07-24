package LambaExpressions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Java8_Sorting {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Lurdhu");
		names.add("Sagar");
		names.add("Ramesh");
		System.out.println(names);
		Collections.sort(names, (s1,s2) -> s1.compareTo(s2));
		System.out.println(names);
	}
	
}
