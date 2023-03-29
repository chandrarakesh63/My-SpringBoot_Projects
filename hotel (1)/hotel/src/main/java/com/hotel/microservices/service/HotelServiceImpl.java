package com.hotel.microservices.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.microservices.Model.Hotel;
import com.hotel.microservices.Reposetry.Reposetry;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private Reposetry reposetry;

	@Override
	public Hotel save(Hotel hotel) {
		log.info("save(Hotel) -> | Hotel : {}", hotel);
		hotel.setHotelId(UUID.randomUUID().toString());
		log.info("save(Hotel) -> | Hotel : {}", hotel);
		Hotel save = reposetry.save(hotel);
		log.info("save(Hotel) -> | Hotel : {}", save);
		return save;
	}

	@Override
	public List<Hotel> getAll() {
		log.info("============ ServiceImpl Get All method Start =============");
		return reposetry.findAll();
	}

	@Override
	public void deleteById(String hotelId) {

		log.info("deleteById(String hotelId) -> | HotelId : {}", hotelId);
		reposetry.deleteById(hotelId);
	}

	@Override
	public Hotel findByhotelId(String hotelId) {
		log.info("============ ServiceImpl find By Id method Start =============");
		return reposetry.findByhotelId(hotelId);
	}

	@Override
	public Hotel updateById(String hotelId, Hotel hotel) {

		log.info("updateById(String,Hotel) -> | HotelId : {} | Hotel : {}", hotelId, hotel);
		Hotel hotelValue = reposetry.findById(hotelId).orElse(null);

		log.info("updateById(String,Hotel) -> | Hotel : {}", hotelValue);
		if (hotelValue == null) {
			throw new NullPointerException("Hotel Null");
		}

		hotelValue.setHotelName(hotel.getHotelName());
		hotelValue.setHotelAddress(hotel.getHotelAddress());

		log.info("updateById(String,Hotel) -> | Hotel : {}", hotelValue);
		Hotel save = reposetry.save(hotelValue);
		log.info("updateById(String,Hotel) -> | Hotel : {}", save);
		return save;
	}

}
