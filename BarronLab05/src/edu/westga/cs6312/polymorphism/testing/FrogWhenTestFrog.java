package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.polymorphism.model.Animal;
import edu.westga.cs6312.polymorphism.model.Frog;

/**
 * Test for the methods and constructors of the Frog Object
 * 
 * @author Jordan Barron
 * @version February 2nd, 2020
 *
 */
public class FrogWhenTestFrog {

	/**
	 * Test of String representation of Falcon object
	 * Should return "Frog" as kind 
	 * and "smooth skin" as covering
	 */
	@Test
	public void test0ParameterConstructorShouldHaveFrogKindSmoothSkinCovering() {
		Animal animal4 = new Frog();
		assertEquals("The kind of animal is a Frog and it is covered in smooth skin", animal4.toString());
	}

	/**
	 * Test of sound Frog makes
	 * Should return "rrribit"
	 */
	@Test
	public void testGetSoundNewFrogShouldHaveRrribit() {
		Animal animal4 = new Frog();
		assertEquals("rrribit", animal4.getSound());
	}

	/**
	 * Test of Frog movement when abilityToRun parameter is false
	 * Should return "I walk on four legs"
	 */
	@Test
	public void testGetMovementFalseNewFrogShouldHaveIWalkOnFourLegs() {
		Animal animal4 = new Frog();
		assertEquals("I walk on four legs", animal4.getMovement(false));
	}
	
	/**
	 * Test of Frog movement when abilityToRun parameter is true
	 * Should return "I run on four legs"
	 */
	@Test
	public void testGetMovementTrueNewFrogShouldHaveIRunOnFourLegs() {
		Animal animal4 = new Frog();
		assertEquals("I run on four legs", animal4.getMovement(true));
	}

}
