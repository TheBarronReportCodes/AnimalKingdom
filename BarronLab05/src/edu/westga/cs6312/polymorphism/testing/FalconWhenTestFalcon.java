package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.polymorphism.model.Animal;
import edu.westga.cs6312.polymorphism.model.Falcon;

/**
 * Test for the methods and constructors of the Falcon Object
 * @author Jordan Barron
 * @version February 2nd, 2020
 *
 */
public class FalconWhenTestFalcon {

	/**
	 * Test of String representation of Falcon object
	 * Should return "Falcon" as kind 
	 * and "feathers" as covering
	 */
	@Test
	public void test0ParameterConstructorShouldHaveFalconKindFeathersCovering() {
		Animal animal2 = new Falcon();
		assertEquals("The kind of animal is a Falcon and it is covered in feathers", animal2.toString());
	}

	/**
	 * Test of sound Falcon makes
	 * Should return "Skawww"
	 */
	@Test
	public void testGetSoundNewFalconShouldHaveSkawww() {
		Animal animal2 = new Falcon();
		assertEquals("Skawww", animal2.getSound());
	}

	/**
	 * Test of Falcon movement when abilityToFly parameter is false
	 * Should return "I walk on two legs"
	 */
	@Test
	public void testGetMovementFalseNewFalconShouldHaveIWalkOnTwoLegs() {
		Animal animal2 = new Falcon();
		assertEquals("I walk on two legs", animal2.getMovement(false));
	}
	
	/**
	 * Test of Falcon movement when abilityToFly parameter is true
	 * Should return "I fly"
	 */
	@Test
	public void testGetMovementTrueNewFalconShouldHaveIFly() {
		Animal animal2 = new Falcon();
		assertEquals("I fly", animal2.getMovement(true));
	}

}
