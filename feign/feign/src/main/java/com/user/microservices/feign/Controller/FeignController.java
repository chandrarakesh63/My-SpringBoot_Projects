package com.user.microservices.feign.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.microservices.feign.Configuration.HotelFaignClient;
import com.user.microservices.feign.Configuration.UserFaignClient;
import com.user.microservices.feign.Model.Hotel;
import com.user.microservices.feign.Model.User;

@RestController
@RequestMapping("/user_hotel")
public class FeignController {
	
	@Autowired
	private HotelFaignClient hotelFaignClient;
	 
	@Autowired
	private UserFaignClient userFaignClient;
	
	@PostMapping("/save")
	public User save(@RequestBody User user) {
		return userFaignClient.save(user);
	}

	@PostMapping("/save")
	Hotel save(@RequestBody Hotel hotel)
	{
		return hotelFaignClient.save(hotel);
	}
	
	@DeleteMapping("/deleteById/{userId}")
	void userDeleteById(@PathVariable String userId)
	{
		userFaignClient.userDeleteById(userId);
	}
	@DeleteMapping("/delete/{hotelId}")
	public void deleteById(@PathVariable String hotelId)
	{
		hotelFaignClient.deleteById(hotelId);
	}
}
