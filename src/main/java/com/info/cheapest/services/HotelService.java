package com.info.cheapest.services;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.info.cheapest.dtos.HotelListDTO;
import com.info.cheapest.utils.HotelListUtil;

/**
 * Service of Hotel. Consume an external API.
 * @author Rafael Barros
 *
 */
public class HotelService {

	public static final String EXTERNAL_URI = "https://api.sandbox.amadeus.com/v1.2/hotels/search-airport";
	
	public static final String API_KEY = "OHKQ326GGgXvmvGH5l5on7iEuBUx5S4j";
	
	private static final int NUMBER_OF_RESULTS = 3;
	
	public HotelListDTO getHotels(String checkin, String checkout, String location) throws Exception {
		try {
			//Instance of RestTemplate to consume the API
			RestTemplate restTemplate = new RestTemplate();
	
			//Building the URI
			UriComponentsBuilder builder = UriComponentsBuilder
										    .fromUriString(EXTERNAL_URI)
										    .queryParam("apikey", API_KEY)
										    .queryParam("number_of_results", NUMBER_OF_RESULTS)
										    .queryParam("check_in", checkin)
										    .queryParam("check_out", checkout)
										    .queryParam("location", location);
			
			//Consuming the API
			HotelListDTO list =  restTemplate.getForObject(builder.toUriString(), HotelListDTO.class);
			
			//Checking the results
			if(list != null) {
				if(list.getResults().size() > 0) {
					//Removing other contacts. Keeping just the phone number.
					return HotelListUtil.removeOtherContacts(list);
				}
			}
			
		} catch(Exception e) {
			throw e;
		}
		return null;
	}
	
}
