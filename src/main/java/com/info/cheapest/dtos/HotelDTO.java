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
	 * Price
	 */
	private PriceDTO total_price;
	
	/**
	 * Object of Address
	 */
	private AddressDTO address;
	
	/**
	 * List of contacts
	 */
	private List<ContactDTO> contacts;
	
	
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

	public PriceDTO getTotal_price() {
		return total_price;
	}

	public void setTotal_price(PriceDTO total_price) {
		this.total_price = total_price;
	}
	
}
