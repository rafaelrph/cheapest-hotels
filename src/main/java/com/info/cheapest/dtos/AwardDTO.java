package com.info.cheapest.dtos;

/**
 * DTO of Award
 * @author Rafael Barros
 *
 */
public class AwardDTO extends GenericDTO {

	private String provider;
	
	private String rating;

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
