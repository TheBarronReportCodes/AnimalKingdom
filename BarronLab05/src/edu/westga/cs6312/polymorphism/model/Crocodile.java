package edu.westga.cs6312.polymorphism.model;

/**
 * Concrete subclass of Animal that contains Specific information of a crocodile
 * 
 * @author Jordan Barron
 * @version February 2nd, 2020
 *
 */
public class Crocodile extends Animal {

	/**
	 * 0 parameter constructor that creates the Crocodile object
	 *
	 */
	public Crocodile() {
		super("Crocodile", "scales");
	}

	/**
	 * Defines the sound of a Crocodile
	 */
	@Override
	public String getSound() {
		String crocodileSound = "hssss";
		return crocodileSound;
	}

}
