package com.chana.beans;

import com.chana.exception.CatException;

public class Cat extends Animal implements Land{

	private int numberOfLegs;

	public Cat(boolean mammals, boolean carnviorous, int mood) throws CatException {
		super(mammals, carnviorous, mood);
		if (!mammals || !carnviorous)
			throw new CatException();
		numberOfLegs = 4;
	}

	
	public void sayHello() {
		sayHello(mood);

	}

	
	public void sayHello(int mood) {
		System.out.println("meowww  meowww...");
		if (mood == MOOD_HAPPY)
			System.out.println("purr purr...");
		else {
			System.out.println("hiss..");
		}
	}

	
	public boolean isMammals() {
		return super.mammals;
	}

	
	public boolean isCarnviorous() {
		return super.carnviorous;
	}

	
	public void setCarnviorous(boolean carnviorous) throws CatException {
		if(!carnviorous) throw new CatException("Cat must be carnviorous ! !");
		this.carnviorous = carnviorous;
	}

	
	public void setMammals(boolean mammals) throws CatException {
		if(!mammals) throw new CatException("Cat must be mammals ! !");
		this.mammals =mammals;

	}
	public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
