package com.chana;

import org.junit.Assert;

import com.chana.beans.Animal;
import com.chana.beans.Cat;
import com.chana.beans.Dog;
import com.chana.beans.Frog;
import com.chana.exception.AnimalException;
/**
 * 
 * @author: Chana Kurtz  06-06-2023
 * this main class is intended for tests of the correctness of methods and values 
 * by using Junit and prints.
 * 
 */
public class TestAnimal {

	public static void main(String[] args) throws AnimalException {

		Dog dog = new Dog(true, true, Animal.MOOD_HAPPY);

		Cat cat = new Cat(true, true, Animal.MOOD_HAPPY);

		Frog frog = new Frog(false, false, Animal.MOOD_SCARE);

		System.out.println("Testing the say hello with defult mood: ");
		dog.sayHello();
		cat.sayHello();
		frog.sayHello();
		System.out.println("Testing the say hello for happy and scared:");
		System.out.println("*(^o^)*:");
		dog.sayHello(1);
		dog.sayHello(2);
		System.out.println("(^-^)");
		cat.sayHello(1);
		cat.sayHello(2);
		System.out.println("\\*-*/");
		frog.sayHello(1);
		frog.sayHello(2);

		System.out.println("Testing isMmammals & isCarnviorous methods:");
		
		System.out.println("Dogs:");
		
		Assert.assertEquals("The dog belongs to mammals", dog.isMammals(), true);
		Assert.assertEquals("The dog belongs to carnviorous", dog.isCarnviorous(), true);


		System.out.println("Cats:");
		Assert.assertEquals("The cat belongs to mammals", cat.isMammals(), true);
		Assert.assertEquals("The cat belongs to carnviorous", cat.isCarnviorous(), true);
		
		
		System.out.println("Frog:");
		Assert.assertEquals("The frog dosn't belongs to mammals", frog.isMammals(), false);
		Assert.assertEquals("The frog dosn't belongs to carnviorous", frog.isCarnviorous(), false);

		
		System.out.println("Testing the setCarnivorous & setMammals methods: ");
		System.out.println("valid input:");
		cat.setCarnviorous(true);
		dog.setCarnviorous(true);
		frog.setCarnviorous(false);
		cat.setMammals(true);
		dog.setMammals(true);
		frog.setMammals(false);
		
		System.out.println("invalid input:");
		Assert.assertThrows(AnimalException.class,()->{cat.setMammals(false);});
		Assert.assertThrows(AnimalException.class,()->{dog.setMammals(false);});
		Assert.assertThrows(AnimalException.class,()->{frog.setMammals(true);});

		Assert.assertThrows(AnimalException.class,()->{cat.setCarnviorous(false);});
		Assert.assertThrows(AnimalException.class,()->{dog.setCarnviorous(false);});
		Assert.assertThrows(AnimalException.class,()->{frog.setCarnviorous(true);});
		
		System.out.println("testing the numberOfLegs method:");
		Assert.assertEquals("cat num of legs: ",cat.getNumberOfLegs(), 4); 
		Assert.assertEquals("frog num of legs: ",frog.getNumberOfLegs(), 4); 
		Assert.assertEquals("dog num of legs: ",dog.getNumberOfLegs(), 4); 
		
		System.out.print("Works well!");
	

	}
}
