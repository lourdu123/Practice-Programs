package Supplier;

import java.util.function.Supplier;

public class GenerateOTP {

	public static void main(String[] args) {
		
		Supplier<String> s = () -> {
			
			return "hello";
		};
		
		
		System.out.println(s.get());
	}
}
