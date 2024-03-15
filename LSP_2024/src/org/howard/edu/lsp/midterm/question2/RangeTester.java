package org.howard.edu.lsp.midterm.question2;
/**
 * The invokes the members of the Integer Range class
 */
public class RangeTester {
	/**
	 * The main function
	 * @param args the main arguments
	 */
	public static void main(String args[]) {
		IntegerRange i1 = new IntegerRange(9, 1);
		IntegerRange i2 = new IntegerRange(9, 2);
		IntegerRange i3 = new IntegerRange(9, 1);
		
		System.out.println(i1.contains(3));
		System.out.println(i1.overlaps(i2));
		System.out.println(i1.size());
		System.out.println(i1.equals(i3));
	}

}
