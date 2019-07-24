package sortListElementsUsingLambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(7);
		numbers.add(1);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(100, "a"));
		students.add(new Student(101, "c"));
		students.add(new Student(102, "b"));
		
		// java7 way
		/*Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
			
		});*/
		
		// java8 way
		Collections.sort(students,(s1,s2) -> s1.getName().compareTo(s2.getName()));
		
		System.out.println(students);
		
		
	}
}
