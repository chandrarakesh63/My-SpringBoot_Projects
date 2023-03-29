package com.hotel.microservices.Reposetry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.microservices.Model.Hotel;

public interface Reposetry extends JpaRepository<Hotel,String>{
	
	Hotel findByhotelId(String hotelId);

}
