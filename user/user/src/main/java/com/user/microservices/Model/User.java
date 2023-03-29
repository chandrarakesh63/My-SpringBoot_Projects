package com.user.microservices.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	@Id
	private String userId;
	private String userName;
    private String userAddress;
    private String hotelId;
    private Date checkIn;
    private Date checkOut;
  

}
