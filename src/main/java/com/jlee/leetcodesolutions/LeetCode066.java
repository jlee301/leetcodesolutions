package com.jlee.leetcodesolutions;

public class LeetCode066 {
	/*
	 * Given a non-negative integer represented as a non-empty array
	 * of digits, plus one to the integer.  You may assume the integer
	 * do not contain any leading zero, except the number 0 itself.
	 * The digits are stored such that the most significant digit is 
	 * at the head of the list.
	 * 
	 * Input: [ 1, 2, 3, 4 ]
	 * Output: [ 1, 2, 3, 5 ]
	 * 
	 * https://leetcode.com/problems/plus-one/description/
	 */
	public int[] plusOne(int[] digits) {
		int[] result = { 1 };
		if(digits == null || digits.length == 0) return result;
		
		for(int i = digits.length - 1; i >= 0; i--) {
			if(digits[i] < 9) {
				// Any time I am able to add one, you can 
				// immediately return the value
				digits[i]++;
				return digits;
			}
			// This assume there will be carry over and 
			// should continue looping to the next left
			// array
			else digits[i] = 0;
		}
		// Reaching this point of the code means there
		// is still carry over ie 999 --> 1000
		result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}
}
