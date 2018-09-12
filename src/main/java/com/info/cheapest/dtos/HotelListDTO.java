package com.info.cheapest.dtos;

import java.util.List;

public class HotelListDTO extends GenericDTO {
	
	private List<HotelDTO> results;
	
	public HotelListDTO() {
		
	}

	public List<HotelDTO> getResults() {
		return results;
	}

	public void setResults(List<HotelDTO> results) {
		this.results = results;
	}

}
