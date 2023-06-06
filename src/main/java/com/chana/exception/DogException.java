package com.chana.exception;

public class DogException extends AnimalException{


	public DogException(String message) {
		super(message);
		this.message = message;
	}
	public DogException() {
		super("dog must be mammals and cornivorous");
	}
}
