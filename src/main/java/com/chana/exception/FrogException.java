package com.chana.exception;

public class FrogException extends AnimalException{

	public FrogException() {
		super("frogs are neither mammalian nor carnivorous");
	}
	public FrogException(String message) {
		super(message);
		this.message=message;
	}
}
