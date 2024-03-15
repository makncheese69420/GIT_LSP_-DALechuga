package org.howard.edu.lsp.midterm.question2;
/**
 * This class exists to check if ranges are equal whilst implements a Range interface
 */
public class IntegerRange implements Range {
	
	private int upperbound;
	private int lowerbound;
	
	/**
	 * The IntegerRange Constructor
	 */
	public IntegerRange() {
		
	}
	
	public IntegerRange(int upper, int lower) {
		upperbound = upper;
		lowerbound = lower;
	}
	/**
	 * return the upper bound
	 * @return upperbound returns the upper bound
	 */
	
	public int getupper() {
		return upperbound;
	}
	
	/**
	 * returns the lower bound
	 * @return lowerbound returns the lower bound
	 */
	
	public int getlower() {
		return lowerbound;
	}
	

	/**
	 * checks if a value is in the range
	 *@param value the value of the integer we check to see if its outside the range
	 *@return true if the value is in the range and false if it isnt 
	 */
	@Override
	public boolean contains(int value) {
		if(value > upperbound) {
			return false;
		}
		else if(value < lowerbound) {
			return false;
		}
		else {
			return true;
		}
	}
	
	/**
	 * Overrides the equals method in order to compare ranges
	 * @param another object of class IntegerRange
	 * @return true if the upper and lower bounds of the ranges match and false if not
	 */
	
	public boolean equals(Object o) { 
		if(this == o) {
			return true;
		}
		
		IntegerRange o1 = (IntegerRange) o;
		
		if((upperbound == o1.getupper()) && (lowerbound == o1.getlower())) {
			return true;
		}
		else {
			return false;
		}
		
	}

	/**
	 * returns true if at least the upper or lower bound are equal to each other
	 * @return true if at least the upper or lower bound are equal to each other
	 */
	@Override
	public boolean overlaps(Range other) {
		// Returns true if the receiver contains at least 
		// one value in common with other, and false otherwise
		IntegerRange o3 = (IntegerRange) other;
		
		if((upperbound == o3.getupper())||(lowerbound == o3.getlower())){
			return true;
		}
		else {
			return false;
		}
		
		
	}

	/**
	 * Returns the size of the range
	 * @return the size of the range
	 */
	@Override
	public int size() {
		// Returns the number of integers in the range
		return upperbound - lowerbound;
	}

}
