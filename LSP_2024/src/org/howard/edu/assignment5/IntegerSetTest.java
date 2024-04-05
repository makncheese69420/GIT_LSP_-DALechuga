package org.howard.edu.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment4.IntegerSet;
import org.howard.edu.lsp.assignment4.IntegerSet.IntegerSetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {

	
	@DisplayName("Tests the .clear() function")
	@Test
	void testClear() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.clear();
		assertTrue(set1.isEmpty());
	}

	@DisplayName("Tests the .length() function")
	@Test
	void testLength() {
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		
		assertEquals(3, set2.length());	
	}

	@DisplayName("Tests the .contains() function")
	@Test
	void testContains() {
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		assertTrue(set3.contains(2));
		assertFalse(set3.contains(7));
	}

	@DisplayName("Tests the .EqualsObject() function")
	@Test
	void testEqualsObject() {
		IntegerSet set4 = new IntegerSet();
		set4.add(1);
		set4.add(2);
		set4.add(3);
		IntegerSet set5 = new IntegerSet();
		set5.add(3);
		set5.add(2);
		set5.add(1);
		assertTrue(set4.equals(set5));
	}

	@DisplayName("Tests the .largest() function")
	@Test
	void testLargest() throws IntegerSetException {
		IntegerSet set6 = new IntegerSet();
		set6.add(1);
		set6.add(2);
		set6.add(3);
		assertEquals(3,set6.largest());
	}

	@DisplayName("Tests the IntegerSetException")
	@Test
	void IntergetSetExceptionTest() throws IntegerSetException{
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.clear();
		assertThrows(IntegerSetException.class, () -> {
			set1.largest();
		});
		assertThrows(IntegerSetException.class, () -> {
			set1.smallest();
		});
	}
	

	@DisplayName("Tests the .smallest() function")
	@Test
	void testSmallest() throws Exception {
		IntegerSet set7 = new IntegerSet();
		set7.add(1);
		set7.add(2);
		set7.add(3);
		assertEquals(1, set7.smallest());
	}

	@DisplayName("Tests the .add() function")
	@Test
	void testAdd() {
		IntegerSet set8 = new IntegerSet();
		set8.add(1);
		assertFalse(set8.isEmpty());
	}

	@DisplayName("Tests the .remove() function")
	@Test
	void testRemove() {
		IntegerSet set9 = new IntegerSet();
		set9.add(1);
		set9.add(2);
		set9.add(3);
		set9.remove(3);
		assertFalse(set9.contains(3));
	}

	@DisplayName("Tests the .union() function")
	@Test
	void testUnion() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
	}

	@DisplayName("Tests the .intersect() function")
	@Test
	void testIntersect() {
		IntegerSet set10 = new IntegerSet();
		set10.add(8);
		set10.add(2);
		set10.add(3);
		set10.add(4);
		IntegerSet set11 = new IntegerSet();
		set11.add(1);
		set11.add(8);
		set11.add(2);
		set11.add(5);
		set10.intersect(set11);
		IntegerSet set12 = new IntegerSet();
		set12.add(8);
		set12.add(2);
		
		assertTrue(set10.equals(set12));
	}

	@DisplayName("Tests the .diff() function")
	@Test
	void testDiff() {
		IntegerSet diff1 = new IntegerSet();
		diff1.add(4);
		diff1.add(2);
		diff1.add(3);
		diff1.add(5);
		diff1.add(1);
		IntegerSet diff2 = new IntegerSet();
		diff2.add(1);
		diff2.add(2);
		diff2.add(3);
		
		IntegerSet diff3 = new IntegerSet();
		diff3.add(4);
		diff3.add(5);
		
		diff1.diff(diff2);
		assertTrue(diff1.equals(diff3));
	}

	@DisplayName("Tests the .complement() function")
	@Test
	void testComplement() {
		IntegerSet comp1 = new IntegerSet();
		comp1.add(1);
		comp1.add(2);
		comp1.add(3);
		comp1.add(4);
		IntegerSet comp2 = new IntegerSet();
		comp2.add(1);
		comp2.add(2);
		comp2.add(6);
		comp2.add(5);
		
		IntegerSet comp3 = new IntegerSet();
		comp3.add(6);
		comp3.add(5);
		
		comp1.complement(comp2);
		
		assertTrue(comp1.equals(comp3));
	}

	@DisplayName("Tests the .empty() function")
	@Test
	void testIsEmpty() {
		IntegerSet empt= new IntegerSet();
		empt.add(1);
		empt.add(2);
		empt.add(3);
		
		empt.clear();
		
		assertTrue(empt.isEmpty());
	}

	@DisplayName("Tests the .toString() function")
	@Test
	void testToString() {
		IntegerSet diff5 = new IntegerSet();
		diff5.add(1);
		diff5.add(2);
		diff5.add(3);
		
		String strdiff5 = diff5.toString();
		
		String check = diff5.toString();
		
		assertTrue(strdiff5.equals(check));
	}

}
