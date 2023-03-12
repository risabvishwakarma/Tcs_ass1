package org.nagarro.exception;

public class CarInsuranceTypeException extends Throwable  {
	public CarInsuranceTypeException(){
		super("Invalid input for car Insurance Type. Please try again.");
	}
}
