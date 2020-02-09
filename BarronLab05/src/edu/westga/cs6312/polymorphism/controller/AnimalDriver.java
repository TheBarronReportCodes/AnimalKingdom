package edu.westga.cs6312.polymorphism.controller;

import edu.westga.cs6312.polymorphism.view.AnimalTUI;

/**
 * Executes the user interface for the application
 * 
 * @author Jordan Barron
 * @version February 2nd, 2020
 *
 */
public class AnimalDriver {

	/**
	 * Entry point into application
	 * 
	 * @param args
	 * 
	 * not used
	 */
	public static void main(String[] args) {
		AnimalTUI animalObject = new AnimalTUI();
		animalObject.run();

	}

}
