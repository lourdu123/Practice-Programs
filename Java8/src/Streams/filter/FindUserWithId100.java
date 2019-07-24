package Streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Streams.User;

public class FindUserWithId100 {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		User user1 = new User(100, "KIRAN");
		User user2 = new User(101, "RAMESH");
		
		users.add(user1);
		users.add(user2);
		
		System.out.println(users);
		
		User requitedUser = users.stream().filter(user -> user.getId() == 100).findFirst().get();
		System.out.println(requitedUser);
		
		User requitedUser1 = users.stream().filter(user -> user.getId() == 100).collect(Collectors.toList()).get(0);
		System.out.println(requitedUser1);
	}
	
}
