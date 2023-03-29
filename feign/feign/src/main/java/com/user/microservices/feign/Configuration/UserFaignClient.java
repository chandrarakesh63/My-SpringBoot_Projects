package com.user.microservices.feign.Configuration;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.microservices.feign.Model.User;

@FeignClient(value = "riki" , url = "http://localhost:5002/user")
public interface UserFaignClient {

	@PostMapping("/save")
	User save(@RequestBody User user);

	@GetMapping("/getAll")
	public List<User> getAll();

	@DeleteMapping("/deleteById/{userId}")
	void userDeleteById(@PathVariable String userId);

	@GetMapping("/findById/{userId}")
	User findByuserId(@PathVariable String userId);

}
