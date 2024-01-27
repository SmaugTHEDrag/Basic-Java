package Unit_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Linear_BinarySearch.BinarySearch;
import Linear_BinarySearch.LinearSearch;

class Linearsearch {

	@Test
	void testSearching() {
		int[] a= {1,2,3,4,5};
		Assert.assertTrue(LinearSearch.Searching(a, 5, 2));
	}
	
	@Test
	void testBinarySearch() {
		int[] a= {4,9,12,14,15,21};
		Assert.assertTrue(BinarySearch.BinarySearch(a, 4, 8));
	}
}
