package org.nagarro.exception;

public class CarPriceException extends Throwable {
	public CarPriceException(){
		super("Invalid input for car Price. Please try again.");
	}
}
