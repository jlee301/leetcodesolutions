package com.jlee.leetcodesolutions;

public class LeetCode400 {
  /*
   * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8,
   * 9, 10, 11, ...
   * 
   * Note: n is positive and will fit within the range of a 32-bit signed integer
   * (n < 2^31).
   * 
   * Example 1:
   * Input: 3
   * Output: 3 
   * 
   * Example 2:
   * Input: 11
   * Output: 0
   * Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 1[0],
   * 11, ... is a 0, which is part of the number 10.
   * 
   * https://leetcode.com/problems/nth-digit/description/
   */
  public int findNthDigit(int n) {
    if(n <= 0)
      return 0;
    
    // Initial values if 1 thru 9 are chosen
    int length = 1;
    int count = 9;
    int start = 1;
    
    // 1 thru 9 --> 9 x 1 = 9 length
    // 10 thru 99 --> 90 x 2 = 180 length
    // 100 thru 999 --> 900 x 3 = 2700 length
    
    // Determine the length
    while(n > length * count) {
      n = n - (length * count);
      length = length + 1;
      count = count * 10;
      start = start * 10;
    }
    
    // Calculate the value at the Nth
    // n=22 --> n=13, length=2, count=90, start=10
    //
    // Essentially we know there are 12 digits from 10:  
    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, [16], 17
    //
    // Since 10 - 99 are multiple of length=2, we can determine the actual value
    // from 10.
    start = start + ((n - 1) / length);
    
    String data = Integer.toString(start);
    // Taking the mod will give back the placement of the number the Nth falls on.
    return Character.getNumericValue(data.charAt((n - 1) % length));
  }
}
