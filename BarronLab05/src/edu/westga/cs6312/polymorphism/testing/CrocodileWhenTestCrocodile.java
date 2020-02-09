package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.polymorphism.model.Animal;
import edu.westga.cs6312.polymorphism.model.Crocodile;

/**
 * Test for the methods and constructors of the Crocodile Object
 * @author Jordan Barron
 * @version February 2nd, 2020
 *
 */
public class CrocodileWhenTestCrocodile {

	/**
	 * Test of String representation of Falcon object
	 * Should return "Crocodile" as kind 
	 * and "scales" as covering
	 */
	@Test
	public void test0ParameterConstructorShouldHaveCrocodileKindScalesCovering() {
		Animal animal3 = new Crocodile();
		assertEquals("The kind of animal is a Crocodile and it is covered in scales", animal3.toString());
	}

	/**
	 * Test of sound Crocodile makes
	 * Should return "hssss"
	 */
	@Test
	public void testGetSoundNewCrocodileShouldHaveHssss() {
		Animal animal3 = new Crocodile();
		assertEquals("hssss", animal3.getSound());
	}

	/**
	 * Test of Crocodile movement when abilityToRun parameter is false
	 * Should return "I walk on four legs"
	 */
	@Test
	public void testGetMovementFalseNewCrocodileShouldHaveIWalkOnFourLegs() {
		Animal animal3 = new Crocodile();
		assertEquals("I walk on four legs", animal3.getMovement(false));
	}
	
	/**
	 * Test of Crocodile movement when abilityToRun parameter is true
	 * Should return "I run on four legs"
	 */
	@Test
	public void testGetMovementTrueNewCrocodileShouldHaveIRunOnFourLegs() {
		Animal animal3 = new Crocodile();
		assertEquals("I run on four legs", animal3.getMovement(true));
	}

}
