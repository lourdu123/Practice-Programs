package Consumer;

import java.util.function.Consumer;

import Streams.User;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<User> c = u -> {
			System.out.println(u.getId());
			System.out.println(u.getName());
		};
		
		
		c.accept(new User(100, "santosh"));
	}
}
