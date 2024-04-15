package com.interviewBit.arrays;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PickFromBothSidesTest {

	@Test
	void test() {
		ArrayList<Integer> A = new ArrayList<Integer>(List.of(5, -2, 3 , 1, 2));
		int res = PickFromBothSides.solvePickFromBothSides(A, 3);
		assertEquals(res, 8);
	}

}
