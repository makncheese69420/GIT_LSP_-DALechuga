/**
 * This class creates a set and performs various operations with sets.
 * @author Makuochukwu Onwubiko
 * @version 1.0
 */





package org.howard.edu.assignment5;
import java.util.ArrayList;





/**
 * This class contains the code for the operations
 */
public class IntegerSet {
   private ArrayList<Integer> set = new ArrayList<Integer>();
   

   /**
    * Constructor
    * 
    */
	public IntegerSet() {
		
	}

	/**
	 * 
	 * Constructor that creates a set from an existing set
	 * @param set takes an ArrayList filled with integers
	 */
	public  IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	/**
	 * returns the current set for the object
	 * @return It returns the current set
	 */
	public ArrayList<Integer> getSet(){
		return set;
	}
	
		
	/**
	 * Deletes the set
	 * 
	 */
	public void clear() {
		set.clear();
	}
	
	
	/**
	 * Returns the length of the set
	 * 
	 * @return returns the size or number of elements in the set
	 */
	public int length() {
		return set.size();
	}
	
	
	/**
	 * Returns true if the set contains the value, otherwise false
	 * @param value the value thats being looked for in the set
	 * @return returns true if it found the value and false if it didn't.
	 */
	public boolean contains(int value) {
		return set.contains(value);	
	}    
		
	
	
	/**
	 *  Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
	 * the equal method from the Object class.
	 * @param o takes another object and converts to be a set
	 * @return returns true if the sets are equal and false if they aren't regardless of order.
	 */
	public boolean equals(Object o) { 
		if(this == o) {
			return true;
		}
		IntegerSet o1 = (IntegerSet) o;
		
		if(o1.length() != set.size()) {
			return false;
		}
			
		boolean IsInSet = true;
		
		for(int i = 0; i < set.size(); i++) {
			if(set.contains(o1.getSet().get(i))) {
				continue;
			}
			else {
				IsInSet = false;
				break;
			}
			}
		return IsInSet;
	 }
	
	/**
	 * creates the IntegerSetEXception if something impossible occurs
	 */
	//public class IntegerSetException extends Exception{
		
	//}
	
	/**
	 * Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	 * @return returns the largest number in the set
	 * @throws IntegerSetException if the set is empty the exception is thrown
	 */
	public int largest() throws IntegerSetException {
		if(set.isEmpty()) {
			throw new IntegerSetException();
		}
		int max = set.get(0);
		for(int i = 1; i < set.size(); i++) {
			if(max < set.get(i)) {
				max = set.get(i);
			}
		}
		return max;
	};
	
	
	/**
	 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 * @return returns the smallest number in the set
	 * @throws IntegerSetException if the list is empty.
	 */
	public int smallest() throws Exception {
		if(set.isEmpty()) {
			throw new IntegerSetException();
		}
		int min = set.get(0);
		for(int i = 1; i < set.size(); i++) {
			if(min > set.get(i)) {
				min = set.get(i);
			}
		}
		return min;
	};
	
	    /**
	     * Adds an item to the set or does nothing it already there
	     * @param item the integer thats being added to the set
	     */
	 	public void add(int item) {
	 		if(set.contains(item)) {
	 			return;
	 		}
	 		else {
	 			set.add(item);
	 		}
	 	}
	
		// Removes an item from the set or does nothing if not there
	/**
	 * Removes an item from the set or does nothing if not there 	
	 * @param item the integer being removed from the set
	 */
	public void remove(int item) {
		if(!set.contains(item)) {
			return;
		}
		else {
			for(int i = 0; i < set.size(); i++) {
				if(set.get(i) == item) {
					set.remove(i);
					break;
				}
			}
		}
	}
	
	/**
	 * Unifies two sets
	 * @param intSetb another set object
	 */
	public void union(IntegerSet intSetb) {
		for( int i = 0; i < intSetb.length(); i++) {
			if(set.contains(intSetb.getSet().get(i))) {
				continue;
			}
			else {
				set.add(intSetb.getSet().get(i));
			}
		}
	}
	
	
	/**
	 * Set intersection, all elements in s1 and s2
	 * @param intSetb another set object
	 */
	public void intersect(IntegerSet intSetb) {
		int isBiggest;
		if(set.size() > intSetb.length()) {
			isBiggest = set.size();
		}
		else {
			isBiggest = intSetb.length();
		}
		
		ArrayList<Integer> intersect = new ArrayList<Integer>();
		
		for(int i = 0; i < isBiggest; i++) {
			if(set.contains(intSetb.getSet().get(i))) {
				intersect.add(intSetb.getSet().get(i));
			}
		}
		set = intersect;
	}
	
	// Set difference, i.e., s1 –s2
	/**
	 * finds the difference between the current set and another integer set
	 * @param intSetb another set object
	 */
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> difference = new ArrayList<Integer>();
		for(int i = 0; i < set.size(); i++) {
			if(!intSetb.getSet().contains(set.get(i))) {
				difference.add(set.get(i));
			}
		}
		set = difference;
	}
	
	
	/**
	 * Set complement, all elements not in s1
	 * @param intSetb another set object
	 */
	public void complement(IntegerSet intSetb) {
		ArrayList<Integer> comp = new ArrayList<Integer>();
		for(int i = 0; i < intSetb.getSet().size(); i++) {
			if(!set.contains(intSetb.getSet().get(i))) {
				comp.add(intSetb.getSet().get(i));
			}
		}
		set = comp;
	}
	
	
	/**
	 * Returns true if the set is empty, false otherwise
	 * @return returns true if the list is empty or false if its not
	 */
	public boolean isEmpty() {
		if(set.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	 
	// Return String representation of your set.  This overrides the equal method from 
	// the Object class.
	
	/**
	 * Return String representation of your set.  This overrides the equal method from 
	 * the Object class.
	 * @return returns the set as a string
	 */
	public String toString() {
		String setString = "[ ";
		for(int i = 0; i < set.size(); i++) {
			String s = Integer.toString(set.get(i));
			setString = setString + s + ", ";
		}
		setString = setString + " ]";
		return setString;
	}
	
	
	}


