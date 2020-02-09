package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.polymorphism.model.Animal;
import edu.westga.cs6312.polymorphism.model.Crocodile;
import edu.westga.cs6312.polymorphism.model.Falcon;
import edu.westga.cs6312.polymorphism.model.Frog;
import edu.westga.cs6312.polymorphism.model.Otter;

/**
 * Test of the getNewAnimal method for concrete subclasses
 * 
 * @author Jordan Barron
 * @version February 2nd, 2020
 *
 */
public class AnimalWhenGetNewAnimal {

	/**
	 * Test of New Otter and otter creation through static method 
	 * should equal one another
	 */
	@Test
	public void testGetNewAnimalWithOtterStringShouldBeSameAsWhenNewOtter() {
		Animal animal1 = new Otter();
		Animal animal2 = Animal.getNewAnimal("otter");
		assertEquals(animal1.toString(), animal2.toString());
	}
	
	/**
	 * Test of New Falcon and falcon creation through static method
	 * should equal one another
	 */
	@Test
	public void testGetNewAnimalWithFalconStringShouldBeSameAsWhenNewFalcon() {
		Animal animal3 = new Falcon();
		Animal animal4 = Animal.getNewAnimal("FALCON");
		assertEquals(animal3.toString(), animal4.toString());
	}
	
	/**
	 * Test of New Crocodile and Crocodile creation through static method
	 * should equal one another
	 */
	@Test
	public void testGetNewAnimalWithCrocodileStringShouldBeSameAsWhenNewCrocodile() {
		Animal animal5 = new Crocodile();
		Animal animal6 = Animal.getNewAnimal("CrOcOdIlE");
		assertEquals(animal5.toString(), animal6.toString());
	}
	
	/**
	 * Test of New Frog and frog creation through static method
	 * should equal one another
	 */
	@Test
	public void testGetNewAnimalWithFrogStringShouldBeSameAsWhenNewFrog() {
		Animal animal7 = new Frog();
		Animal animal8 = Animal.getNewAnimal("fROg");
		assertEquals(animal7.toString(), animal8.toString());
	}

}
