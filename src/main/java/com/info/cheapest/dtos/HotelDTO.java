package com.info.cheapest.dtos;

import java.util.List;

/**
 * DTO of Hotel
 * @author Rafael Barros
 *
 */
public class HotelDTO extends GenericDTO {

	/**
	 * The name of the hotel
	 */
	private String property_name;
	
	/**
	 * Object of Address
	 */
	private AddressDTO address;
	
	/**
	 * List of contacts
	 */
	private List<ContactDTO> contacts;
	
	/**
	 * List of awards (ratings)
	 */
	private List<AwardDTO> awards;
	
	public HotelDTO() {
		
	}

	public String getProperty_name() {
		return property_name;
	}

	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public List<ContactDTO> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactDTO> contacts) {
		this.contacts = contacts;
	}

	public List<AwardDTO> getAwards() {
		return awards;
	}

	public void setAwards(List<AwardDTO> awards) {
		this.awards = awards;
	}
	
}
