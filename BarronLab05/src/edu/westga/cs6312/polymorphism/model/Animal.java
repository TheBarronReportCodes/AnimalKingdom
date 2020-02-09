package edu.westga.cs6312.polymorphism.model;

/**
 * Abstract class that serves as base for all following subclasses
 * 
 * @author Jordan Barron
 * @version February 2nd, 2020
 */
public abstract class Animal {
	private String kind;
	private String covering;
	
	/**
	 * 2 parameter constructor to create Animal Object
	 * @param kind The kind of animal being created.
	 * @param covering The kind of covering for the animal.
	 * @precondition: both parameters cannot be null. If null, then throw exception!
	 */
	protected Animal(String kind, String covering) {
		if (kind == null) {
			throw new IllegalArgumentException("Invalid kind");
		}
		if (covering == null) {
			throw new IllegalArgumentException("Invalid covering");
		}
		this.kind = kind;
		this.covering = covering;
	}
	
	/**
	 * Method to see if animal walks or runs
	 * @param abilityToRun Does the animal have the abilityToRun
	 * @return Returns a phrase that notifies if the animal walks or runs
	 */
	public String getMovement(Boolean abilityToRun) {	
		if (abilityToRun) {
			return "I run on four legs";
		}
		return "I walk on four legs";
	}
	
	/**
	 * Creates subclass of Animal objects
	 * @param kind The kind of animal being created.
	 * @return Returns null if kind equals null
	 * @precondition: kind != null. If null, return null
	 */
	public static Animal getNewAnimal(String kind) {
		
		if ("Otter".equalsIgnoreCase(kind)) {
			return new Otter();
		}
		
		if ("Falcon".equalsIgnoreCase(kind)) {
			return new Falcon();
		}
		
		if ("Crocodile".equalsIgnoreCase(kind)) {
			return new Crocodile();
		}
		
		if ("Frog".equalsIgnoreCase(kind)) {
			return new Frog();
		}
		return null;
	
	}
	
	/**
	 * Creates requirement that all subclasses (unless abstract) must use this method
	 * @return Returns the sound the animal makes
	 */
	public abstract String getSound();

	/**
	 * String representation of the Animals kind and covering
	 */
	@Override
	public String toString() {
		String newString = "";
		newString += "The kind of animal is a " + this.kind + " and it is covered in " + this.covering;
		return newString;
	}
}
