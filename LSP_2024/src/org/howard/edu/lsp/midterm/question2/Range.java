package org.howard.edu.lsp.midterm.question2;

/**
 * Range interface contains main range methods
 */
public interface Range {
	/**
	 * returns true of value is in the range
	 * @param value the value thats being checked
	 * @return true if the value is in the range and false if it isnt
	 */
	public boolean contains( int value ); 

	/**
	 * Returns true if the upper bound or lower bound are the same in both ranges
	 * @param other the other range
	 * @return true if they share a bound and false if they dont
	 */
	public boolean overlaps( Range other );

	/**
	 * Returns the difference between the bounds
	 * @return the size of the bounds
	 */
	public int size();
	
	
}
