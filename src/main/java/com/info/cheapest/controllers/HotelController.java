package com.info.cheapest.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.info.cheapest.dtos.HotelDTO;
import com.info.cheapest.dtos.HotelListDTO;
import com.info.cheapest.services.HotelService;

/**
 * Controller class of Hotel
 * @author Rafael Barros
 *
 */
@RestController
@RequestMapping(HotelController.BASE_URI)
public class HotelController {

	private HotelService service;
	
	public static final String BASE_URI = "api/hotels";

	public HotelController() {
		service = new HotelService();
	}
	
    @CrossOrigin(origins = "https://aw-cheapest-hotels-front.herokuapp.com/")
	@RequestMapping(value = "/cheapest", method = RequestMethod.GET)
	public ResponseEntity<List<HotelDTO>> getCheapest(@RequestParam(value = "check_in") String checkin, 
													  @RequestParam(value = "check_out") String checkout, 
													  @RequestParam(value = "location") String location) 
	{
		try {
			//Calling the service
			HotelListDTO hotels = service.getHotels(checkin, checkout, location);
			
			//Checking the results and sending a response
			if(hotels != null) {
				return ResponseEntity.ok().body(hotels.getResults());
			} else {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
			return ResponseEntity.badRequest().build();
		}
	}
	
}
