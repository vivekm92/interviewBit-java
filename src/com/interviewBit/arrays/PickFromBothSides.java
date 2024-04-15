package com.interviewBit.arrays;

import java.util.ArrayList;

// Problem : https://www.interviewbit.com/problems/pick-from-both-sides/
public class PickFromBothSides {

	/*
	 * A : [5, -2, 3 , 1, 2], B = 3 
	 * o/p : 8
	 * x = 6 - 3 + 2, rightSum = 2 
	 * maxSum := max(currSum - A[l] + rightSum) 
	 * rightSum += A[r]
	 * 
	 */
	public int solvePickFromBothSides(ArrayList<Integer> A, int B) {
		// T(n) : O(n), S(n) : O(1)
		
		int currSum = 0;
		for (int i = 0; i < B; i++) {
			currSum += A.get(i);
		}

		int rightSum = 0, n = A.size();
		int maxSum = currSum;
		for (int i = 0; i < B; i++) {
			rightSum += A.get(n - 1 - i);
			currSum -= A.get(B - 1 - i);
			if (maxSum < currSum + rightSum) {
				maxSum = currSum + rightSum;
			}
		}
		return maxSum;
	}

}
