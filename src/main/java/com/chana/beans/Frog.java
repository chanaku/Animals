package com.chana.beans;

import com.chana.exception.AnimalException;
import com.chana.exception.FrogException;

public class Frog extends Animal implements Land, Water {

	public Frog(boolean mammals, boolean carnviorous, int mood) throws FrogException {
		super(mammals, carnviorous, mood);
		if (mammals || carnviorous)
			throw new FrogException();
		numberOfLegs = 4;
	}

	private int numberOfLegs;

	public boolean hasGills() {
		return true;
	}

	public boolean hasLaysEggs() {
		return true;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void sayHello() {
		sayHello(mood);

	}

	public void sayHello(int mood) {
		if (mood == MOOD_HAPPY)
			System.out.println("quack quack quack..");
		else {
			System.out.println("plop into the water..");
		}
	}

	public boolean isMammals() {
		return super.mammals;
	}

	public boolean isCarnviorous() {
		return super.carnviorous;
	}

	public void setCarnviorous(boolean carnviorous) throws AnimalException {
		if (carnviorous)
			throw new FrogException("ERROR: frog is not belong to the carnviorous");
		this.carnviorous = carnviorous;
	}

	public void setMammals(boolean mammals) throws AnimalException {
		if (mammals)
			throw new FrogException("ERROR: frog is not belong to the mammals");
		this.mammals = mammals;
	}

}
