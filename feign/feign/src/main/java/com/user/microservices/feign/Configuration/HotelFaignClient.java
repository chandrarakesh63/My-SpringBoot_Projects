package com.user.microservices.feign.Configuration;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.microservices.feign.Model.Hotel;

@FeignClient(value = "feign", url = "http://localhost:5003/hotel")
public interface HotelFaignClient {

	@GetMapping("/getAll")
	List<Hotel> getAll();

	@PostMapping("/save")
	Hotel save(@RequestBody Hotel hotel);

	@DeleteMapping("/delete/{hotelId}")
	public void deleteById(@PathVariable String hotelId);

	@GetMapping("/findById/{hotelId}")
	Hotel findById(@PathVariable String hotelId);
}
