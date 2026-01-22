package com.example.springboot102;
import com.example.springboot102.Entity.User;
import com.example.springboot102.Repo.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Springboot102Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springboot102Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		// save one user at a time in databae
		/*User user= new User();
		user.setAge(20);
		user.setName("krishna Gupta");
		user.setPhonenom("8000xxxxxx");
		userRepository.save(user);*/

		// how to save multiple user at a time
		/*User user = new User();
		user.setPhonenom("8989xxxxxx");
		user.setName("harsh");
		user.setAge(25);

		User user1  = new User();
		user1.setAge(19);
		user1.setName("payal");
		user1.setPhonenom("6778xxxxxx");

		List<User> users = List.of(user,user1);
		userRepository.saveAll(users);*/

		//how to find user by name ,age,id
		//List<User> list = userRepository.findByAge(19);
		//List<User> list = userRepository.findByName("harsh");
		//List<User> list = userRepository.findByNameAndAge("krishns", 20);

		//how to update user details
		/*List<User> list = userRepository.findByAge(19);
		{
			User user = list.get(0);  // which index d u want to update
			user.setAge(30);
			user.setName("princy");
			userRepository.save(user);
		}*/

		//how to delete user
		/*List<User> list = userRepository.findByAge(30);{
			User user = list.get(0);
			userRepository.delete(user);
		}*/

		Optional<User> optional = userRepository.findById(1);
		{
			User user = optional.get();
			user.setName("krish");
			userRepository.save(user);
		}
	}
}








