package com.info.cheapest.utils;

import com.info.cheapest.dtos.HotelDTO;
import com.info.cheapest.dtos.HotelListDTO;

public class HotelListUtil {

	/**
	 * Remove other contacts from all the hotels on the list.
	 * @param list
	 * @throws Exception 
	 */
	public static HotelListDTO removeOtherContacts(HotelListDTO list) throws Exception {
		try {
			for(HotelDTO hotel : list.getResults()) {
				HotelUtil.removeOtherContacts(hotel);
			}
			return list;
		} catch(Exception e) {
			throw e;
		}
	}
	
}
