package com.hotel.microservices.service;

import java.util.List;

import com.hotel.microservices.Model.Hotel;

public interface HotelService {
	
	Hotel save(Hotel hotel);
	
	List<Hotel> getAll();
	
	void deleteById(String hotelId);
	
	Hotel findByhotelId(String hotelId);
	
	 Hotel updateById(String hotelId, Hotel hotel);

}
