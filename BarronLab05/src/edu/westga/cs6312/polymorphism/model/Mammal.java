package edu.westga.cs6312.polymorphism.model;

/**
 * Abstract subclass of Animal that contains generic information of a mammal
 * 
 * @author Jordan Barron
 * @version February 2nd, 2020
 *
 */
public abstract class Mammal extends Animal {
	
	/**
	 * 1 parameter constructor to create Mammal Object
	 * @param kind The kind of mammal being created.
	 */
	protected Mammal(String kind) {
		super(kind, "hair");
	}

}
