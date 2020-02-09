package edu.westga.cs6312.polymorphism.model;

/**
 * Concrete Subclass of mammal that contains specific information on an Otter
 * 
 * @author Jordan Barron
 * @version February 2nd, 2020
 *
 */
public class Otter extends Mammal {
	
	/**
	 * 0 parameter constructor that creates the Otter object
	 */
	public Otter() {
		super("Otter");
	}

	/**
	 * Defines the sound of the Otter
	 * 
	 */
	@Override
	public String getSound() {
		String otterSound = "yeow yeow";
		return otterSound;
	}

}
