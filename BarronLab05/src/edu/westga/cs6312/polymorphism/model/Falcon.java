package edu.westga.cs6312.polymorphism.model;

/**
 * Concrete Subclass of bird that contains specific information on an Falcon
 * 
 * @author Jordan Barron
 * @version February 2nd, 2020
 *
 */
public class Falcon extends Bird {
	
	/**
	 * 0 parameter constructor that creates the Falcon object
	 */
	public Falcon() {
		super("Falcon");
	}

	/**
	 * Defines the sound of a falcon
	 */
	@Override
	public String getSound() {
		String falconSound = "Skawww";
		return falconSound;
	}

}
