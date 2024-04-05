package org.howard.edu.assignment5;



/**
 * The driver class where the main function is stored and where the program is run from
 */
public class Driver {

	/**
	 * Main method
	 * @param args the main arguments i guess
	 * @throws Exception for an exception to be thrown
	 */
	public static void main(String[] args) throws Exception {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println(set1.toString());
		System.out.println(set1.smallest());
		System.out.println(set1.largest());
		
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		System.out.println(set1.equals(set2));
		//set1.union(set2);
		
		set1.union(set2);
		System.out.println(set1.toString());
	
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(4);
		set3.add(3);
		set3.add(7);
		
		IntegerSet set4 = new IntegerSet();
		set4.add(5);
		set4.add(6);
		set4.add(7);
		set4.add(4);
		
		set3.intersect(set4);
		System.out.println(set3.toString());
		
		IntegerSet set5 = new IntegerSet();
		set5.add(1);
		set5.add(2);
		set5.add(3);
		set5.add(4);
		
		IntegerSet set6 = new IntegerSet();
		set6.add(5);
		set6.add(6);
		set6.add(7);
		set6.add(4);
		
		set5.diff(set6);
		System.out.println(set5.toString());
		
		IntegerSet set7 = new IntegerSet();
		set7.add(1);
		set7.add(2);
		set7.add(3);
		set7.add(4);
		
		IntegerSet set8 = new IntegerSet();
		set8.add(1);
		set8.add(2);
		set8.add(5);
		set8.add(6);
		
		set7.complement(set8);
		System.out.println(set7.toString());
		
		set7.remove(5);
		System.out.println(set7.toString());

	}
	
}