package edu.westga.cs6312.polymorphism.model;

/**
 * Concrete subclass of Animal that contains Specific information of a frog
 * 
 * @author Jordan Barron
 * @version February 2nd, 2020
 *
 */
public class Frog extends Animal {

	/**
	 * 0 parameter constructor that creates the Frog object
	 *
	 */
	public Frog() {
		super("Frog", "smooth skin");
	}

	/**
	 * Defines the sound of a Frog
	 */
	@Override
	public String getSound() {
		String frogSound = "rrribit";
		return frogSound;
	}

}
