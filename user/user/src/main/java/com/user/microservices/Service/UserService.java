package com.user.microservices.Service;

import java.util.List;

import com.user.microservices.Model.User;

public interface UserService {
	
	User save(User user);
	
	List<User> getAll();

	void deleteById(String userId);
	
	User findByuserId(String userId);
}
