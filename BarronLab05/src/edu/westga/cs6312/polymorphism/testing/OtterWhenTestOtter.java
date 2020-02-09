package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.polymorphism.model.Animal;
import edu.westga.cs6312.polymorphism.model.Otter;

/**
 * Test for the methods and constructors of the Otter Object
 * @author Jordan Barron
 * @version February 2nd, 2020
 *
 */
public class OtterWhenTestOtter {
	
	/**
	 * Test of String representation of Otter object
	 * Should return "Otter" as kind 
	 * and "hair" as covering
	 */
	@Test
	public void test0ParameterConstructorShouldHaveOtterKindHairCovering() {
		Animal animal1 = new Otter();
		assertEquals("The kind of animal is a Otter and it is covered in hair", animal1.toString());
	}


	/**
	 * Test of sound Otter makes
	 * Should return "yeow yeow"
	 */
	@Test
	public void testGetSoundNewOtterShouldHaveYeowYeow() {
		Animal animal1 = new Otter();
		assertEquals("yeow yeow", animal1.getSound());
	}
	
	/**
	 * Test of Otter movement when abilityToRun parameter is false
	 * Should return "I walk on four legs"
	 */
	@Test
	public void testGetMovementFalseNewOtterShouldHaveIWalkOnFourLegs() {
		Animal animal1 = new Otter();
		assertEquals("I walk on four legs", animal1.getMovement(false));
	}
	
	/**
	 * Test of Otter movement when abilityToRun parameter is true
	 * Should return "I run on four legs"
	 */
	@Test
	public void testGetMovementTrueNewOtterShouldHaveIRunOnFourLegs() {
		Animal animal1 = new Otter();
		assertEquals("I run on four legs", animal1.getMovement(true));
	}
}
