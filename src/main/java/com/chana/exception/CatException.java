package com.chana.exception;

public class CatException extends AnimalException{


	public CatException(String message) {
		super(message);
		this.message = message;
	}
	public CatException() {
		super("cat must be mammals and cornivorous");
	}
}