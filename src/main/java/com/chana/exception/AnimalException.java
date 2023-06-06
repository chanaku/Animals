package com.chana.exception;
/**
 * 
 * This class is intended for a dedicated error throw for animals.
 *
 */
public abstract class AnimalException extends RuntimeException {

	protected String message;

	public AnimalException(String message) {
		super(message);
		this.message = message;
	}

	public AnimalException() {
		super("Animal defined Error");
	}

}
