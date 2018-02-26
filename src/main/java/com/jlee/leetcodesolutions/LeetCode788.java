package com.jlee.leetcodesolutions;

public class LeetCode788 {
  /*
   * X is a good number if after rotating each digit individually by 180 degrees,
   * we get a valid number that is different from X. A number is valid if each
   * digit remains a digit after rotation. 0, 1, and 8 rotate to themselves; 2 and
   * 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the
   * numbers do not rotate to any other number.
   * 
   * Now given a positive number N, how many numbers X from 1 to N are good?
   * 
   * Example: 
   * Input: 10 
   * Output: 4
   * 
   * Explanation:
   * There are four good numbers in the range [1, 10] : 2, 5, 6, 9. Note that 1
   * and 10 are not good numbers, since they remain unchanged after rotating.
   * Note:
   * 
   * N will be in range [1, 10000].
   * 
   * https://leetcode.com/problems/rotated-digits/description/
   */
  public int rotatedDigits(int N) {
    int count = 0;
    if(N <= 0)
      return count;
    
    for(int i = 1; i <= N; i++) {
      if(isValid(i))
        count++;
    }
    return count;
  }
  
  private boolean isValid(int num) {
    boolean possible = false;
    while(num > 0) {
      int digit = num % 10;
      // The number contains 3,4,7 it is automatically invalid
      if(digit == 3 || digit == 4 || digit == 7)
        return false;
      if(!possible) {
        // The number must contain 2,5,6,7 at least once for it not to be the same after
        // rotating 180 degrees.
        if(digit == 2 || digit == 5 || digit == 6 || digit == 9)
          possible = true;
      }
      num /= 10;
    }
    return possible;
  }
}
