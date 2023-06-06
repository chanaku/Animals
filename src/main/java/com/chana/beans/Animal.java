package com.chana.beans;

import com.chana.exception.AnimalException;

public abstract class Animal {
	protected boolean mammals;
	protected boolean carnviorous;
	public static final int MOOD_HAPPY =1;
	public static final int MOOD_SCARE =2;
	protected int mood;

	public Animal(boolean mammals, boolean carnviorous, int mood) {
		this.mammals = mammals;
		this.carnviorous = carnviorous;
		this.mood = mood;
	}

	public abstract void sayHello();

	public abstract void sayHello(int mood);

	public abstract boolean isMammals();

	public abstract boolean isCarnviorous();

	public abstract void setCarnviorous(boolean carnviorous) throws AnimalException;

	public abstract void setMammals(boolean mammals) throws AnimalException;

}
