package com.info.cheapest.dtos;

/**
 * DTO of Contact
 * @author Rafael Barros
 *
 */
public class ContactDTO extends GenericDTO {

	private String type;
	
	private String detail;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
