package com.chana.beans;

import com.chana.exception.AnimalException;
import com.chana.exception.DogException;



public class Dog extends Animal implements Land {

	private int numberOfLegs;

	public Dog(boolean mammals, boolean carnviorous, int mood) throws DogException {
		super(mammals, carnviorous, mood);
		if (!mammals || !carnviorous)
			throw new DogException();
		numberOfLegs = 4;
	}

	public void sayHello() {
		sayHello(mood);
	}

	public void sayHello(int mood) {
		System.out.println("wagging his tail");
		if (mood == MOOD_HAPPY)
			System.out.println("bark loudly");
		else {
			System.out.println("whoop whoop");
		}
	}

	public boolean isMammals() {
		return super.mammals;
	}

	public boolean isCarnviorous() {
		return super.carnviorous;
	}

	public void setCarnviorous(boolean carnviorous) throws AnimalException {
		if (!carnviorous)
			throw new DogException("Dog must be carnviorous ! !");
		this.carnviorous = carnviorous;

	}

	public void setMammals(boolean mammals) throws AnimalException {
		if (!mammals)
			throw new DogException("Dog must be mammals ! !");
		this.mammals = mammals;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}
}
