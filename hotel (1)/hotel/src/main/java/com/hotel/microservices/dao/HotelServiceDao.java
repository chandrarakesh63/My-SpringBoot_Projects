package com.hotel.microservices.dao;

import java.util.List;

import com.hotel.microservices.Model.Hotel;

public interface HotelServiceDao {
	Hotel save(Hotel hotel);
	
	List<Hotel> getAll();
	
	void deleteById(String hotelId);
}
