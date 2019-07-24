package Streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElementsThatStartsWithLurdhu {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Lurdhu");
		names.add("Sagar");
		names.add("Ramesh");
		
		System.out.println(names);
		
		List<String> filteredList = names.stream().filter(e -> (!e.startsWith("Lurdhu"))).collect(Collectors.toList());
		System.out.println(filteredList);
	}
	
}
