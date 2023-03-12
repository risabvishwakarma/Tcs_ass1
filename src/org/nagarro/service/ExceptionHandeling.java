package org.nagarro.service;

import java.beans.ExceptionListener;

public class ExceptionHandeling implements ExceptionListener {

	@Override
	public void exceptionThrown(Exception e) {
		System.out.println("invalid input");

	}

}
