/*
 * Mitch Westing
 * CSE360
 * Assignment2
 */

/**
 * This class Adds and Subtracts from the current total,
 * and keeps a log of all operations already done,
 * which can be printed by the toString method
 * 
 */

package cse360assign2;

public class AddingMachine {

	private int total;
	
	/**
	 * Constructor, initializes the total variable to 0
	 * 
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the current total
	 * 
	 * @return 0
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds the value to the current total, and stores the operation
	 * 
	 * @param value an int value that will be added to the current total
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts the vale to the current total, and stores the operation
	 * 
	 * @param value an int value that will be subrracted from the current total
	 */
	public void subtract (int value) {
		
	}
	/**
	 * Prints the history of operations used
	 * 
	 */
	public String toString () {
		return "";
	}
	
	public void clear() {
	
	}
}
