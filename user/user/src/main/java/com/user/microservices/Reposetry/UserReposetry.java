package com.user.microservices.Reposetry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.microservices.Model.User;

public interface UserReposetry extends JpaRepository<User,String>{
	
	User findByuserId(String userId);

}
