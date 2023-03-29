package com.user.microservices.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.microservices.Model.User;
import com.user.microservices.Reposetry.UserReposetry;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserReposetry userReposetry;
	
	@Override
	public User save(User user) {
		return userReposetry.save(user);
	}

	@Override
	public List<User> getAll() {
		return userReposetry.findAll();
	}

	@Override
	public void deleteById(String userId) {
		userReposetry.deleteById(userId);
		
	}

	@Override
	public User findByuserId(String userId) {
		return userReposetry.findByuserId(userId);
	}

}
