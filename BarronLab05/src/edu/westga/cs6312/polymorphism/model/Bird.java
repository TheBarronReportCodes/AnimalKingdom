package edu.westga.cs6312.polymorphism.model;

/**
 * Abstract subclass of Animal that contains generic information of a bird
 * 
 * @author Jordan Barron
 * @version February 2nd, 2020
 */
public abstract class Bird extends Animal {
	
	/**
	 * 1 parameter constructor to create Bird Object
	 * @param kind The kind of Bird being created.
	 */
	protected Bird(String kind) {
		super(kind, "feathers");
	}
	
	/**
	 * Method to see if animal walks or flies
	 * @param abilityToFly Does the Bird have the abilityToFly
	 * @return Returns a phrase that notifies if the bird walks or flies
	 */
	@Override
	public String getMovement(Boolean abilityToFly) {
		if (abilityToFly) {
			return "I fly";	
		}
		return "I walk on two legs";
	}

}
