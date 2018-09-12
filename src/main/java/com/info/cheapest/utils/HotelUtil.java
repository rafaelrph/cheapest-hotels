package com.info.cheapest.utils;

import java.util.ArrayList;
import java.util.List;

import com.info.cheapest.dtos.ContactDTO;
import com.info.cheapest.dtos.HotelDTO;

public class HotelUtil {
	
	public static final String PHONE_TYPE_CONTACT = "PHONE";

	/**
	 * Remove the other contacts from Hotel. Keep just the phone number.
	 * @param hotel
	 * @throws Exception 
	 */
	public static HotelDTO removeOtherContacts(HotelDTO hotel) throws Exception {
		try {
			List<ContactDTO> contactsPhone = new ArrayList<ContactDTO>();
			for(ContactDTO contact : hotel.getContacts()) {
				if(contact.getType().equals(PHONE_TYPE_CONTACT)) {
					contactsPhone.add(contact);
				}
			}
			hotel.setContacts(contactsPhone);
			return hotel;
		} catch(Exception e) {
			throw e;
		}
	}
}
