package com.jlee.leetcodesolutions;

public class LeetCode013 {
	/*
	 * Given a roman numeral, convert it to an integer.
	 * Input is guaranteed to be within the range from 1 to 3999.
	 * 
	 * M = 1000
	 * D = 500
	 * C = 100
	 * L = 50
	 * X = 10
	 * V = 5
	 * I = 1
	 * 
	 * Input: XIII
	 * Output: 13
	 * 
	 * Input: XLIX
	 * Output: 49
	 * 
	 * https://leetcode.com/problems/roman-to-integer/description/
	 */
	public int romanToInt(String s) {
		// In case someone passes lower case
		s = s.toUpperCase();
		int nums[] = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
				case 'M':
					nums[i] = 1000;
					break;
				case 'D':
					nums[i] = 500;
					break;
				case 'C':
					nums[i] = 100;
					break;
				case 'L':
					nums[i] = 50;
					break;
				case 'X':
					nums[i] = 10;
					break;
				case 'V':
					nums[i] = 5;
					break;
				case 'I':
					nums[i] = 1;
					break;
			}
		}
		
		int result = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] < nums[i+1]) {
				result = result - nums[i];
			}
			else {
				result = result + nums[i];
			}
			// System.out.println(result);
		}

		// Add the last result in the array as there's no nums[i+1] comparison
		result = result + nums[nums.length - 1];
		// System.out.println(result);
		return result;
	}
}