package com.info.cheapest.dtos;

/**
 * DTO of Price
 * @author Rafael Barros
 *
 */
public class PriceDTO extends GenericDTO {

	private double amount;
	
	private String currency;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}
