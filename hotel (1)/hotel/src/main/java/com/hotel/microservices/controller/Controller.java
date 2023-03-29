package com.hotel.microservices.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.microservices.Model.Hotel;
import com.hotel.microservices.service.HotelService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/hotel")
public class Controller {

	@Autowired
	private HotelService service;

//	Logger log=LoggerFactory.
	
	@PostMapping("/save")
	public Hotel save(@RequestBody Hotel hotel) {
		log.info("========== Save Method Started ===========");
		log.info("save(Hotel) -> | Hotel : {}",hotel);
		Hotel save = service.save(hotel);
		log.info("save(Hotel) -> | Hotel : {}",save);
		log.info("========== Save Method End ===========");
		return save;
	}
	
	@GetMapping("/getAll")
	public List<Hotel> getAll(){
		log.info("========== GetAll Method Started ===========");
		log.info("getAll() -> | ");
		List<Hotel> all = service.getAll();
		log.info("getAll() -> | List Hotel : {}",all);
		log.info("========== GetAll Method End ===========");
		return all;
	}
	
	@DeleteMapping("/delete/{hotelId}")
	public void deleteById(@PathVariable String hotelId)
	{
		log.info("========== Controller delete By Id Started ===========");
		service.deleteById(hotelId);
	}

	@GetMapping("/findById/{hotelId}")
	public Hotel findById(@PathVariable String hotelId)
	{
		log.info("========== Controller Find By Id Started ===========");
		Hotel getValue = service.findByhotelId(hotelId);
		return getValue;
	}
}
