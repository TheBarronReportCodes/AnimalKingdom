package edu.westga.cs6312.polymorphism.view;

import java.util.ArrayList;
import java.util.Scanner;

import edu.westga.cs6312.polymorphism.model.Animal;

/**
 * user interface class for application
 * 
 * @author Jordan Barron
 * @version February 2nd, 2020
 */
public class AnimalTUI {
	private Scanner scan;
	private ArrayList<Animal> theAnimals;
	
	/**
	 * 0 parameter constructor that Initializes the instance variables
	 */
	public AnimalTUI() {
		this.scan = new Scanner(System.in); 
		this.theAnimals = new ArrayList<Animal>();
	}

	/**
	 * runs different tasks of the application
	 */
	public void run() {
		System.out.println("Welcome to the Animal Application \n");
		int userOptionInt;
		
		do {
			this.displayMenu();
			System.out.print("Enter your choice: ");
			String userOptionString = this.scan.nextLine();
			userOptionInt = Integer.parseInt(userOptionString);
			switch (userOptionInt) {
				case 1:
					this.addAnimal();
					break;
				case 2:
					this.displayAnimals();
					break;
				case 3:
					System.out.println("Thank you for using the Animal application. Goodbye! \n");
					break;
				default:
					System.out.println("That's not a valid choice. Please try again \n");
					break;
			}
		} while (userOptionInt != 3);
	}
	
	/**
	 * Displays the different options for the user to choose and interact with
	 */
	private void displayMenu() {
		System.out.println("1 - Add an animal to the list");
		System.out.println("2 - Print the animals in the list");
		System.out.println("3 - Quit");
	}
	
	/**
	 * adds an animal object to the ArrayList
	 */
	private void addAnimal() {
		System.out.print("Please type the name of the animal you wish to add. Choices are: Otter, Falcon, Crocodile, or Frog \t");
		String userInputKind = this.scan.nextLine();
		
		this.theAnimals.add(Animal.getNewAnimal(userInputKind));
	}
	
	
	
	/**
	 * Displays the Animals in the list
	 * @precondition: the list cannot be empty. If the list is empty, the notify that there are no animals in the list
	 */
	private void displayAnimals() {
		System.out.println();
		
		String result = "";
		String separation = "\n"; 
		
		if (this.theAnimals.isEmpty()) {
			System.out.println("No animals in list \n");
			return;
		}
		
		for (Animal element : this.theAnimals) {
			result += element + separation;
		}
		
		System.out.println(result);
		System.out.println();
	}
	
}
