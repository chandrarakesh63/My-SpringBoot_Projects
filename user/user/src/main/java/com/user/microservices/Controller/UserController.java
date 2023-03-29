package com.user.microservices.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.microservices.Model.User;
import com.user.microservices.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/save")
	public User save(@RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping("/getAll")
	public List<User> getAll() {
		return userService.getAll();
	}

	@DeleteMapping("/deleteById/{userId}")
	public void userDeleteById(@PathVariable String userId) {
		userService.deleteById(userId);
	}
	
	@GetMapping("/findById/{userId}")
	public User findByuserId(@PathVariable String userId)
	{
		return userService.findByuserId(userId);
	}

}
