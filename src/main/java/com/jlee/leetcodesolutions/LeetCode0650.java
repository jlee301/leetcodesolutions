package com.jlee.leetcodesolutions;

public class LeetCode0650 {
  /*
   * Initially on a notepad only one character 'A' is present. You can perform two
   * operations on this notepad for each step:
   * 1. Copy All: You can copy all the characters present on the notepad (partial
   * copy is not allowed).
   * 2.Paste: You can paste the characters which are copied last time.
   * 
   * Given a number n. You have to get exactly n 'A' on the notepad by performing
   * the minimum number of steps permitted. Output the minimum number of steps to
   * get n 'A'.
   * 
   * Example 1:
   * Input: 3
   * Output: 3
   * 
   * Explanation:
   * Intitally, we have one character 'A'.
   * In step 1, we use Copy All operation.
   * In step 2, we use Paste operation to get 'AA'.
   * In step 3, we use Paste operation to get 'AAA'.
   * 
   * Note:
   * The n will be in the range [1, 1000].
   */
  public int minSteps(int n) {
    if(n == 1) 
      return 0;
    int steps = 1, copyLen = 1, currLen = 1;
    while(currLen != n) {
      // Step for pasting
      currLen += copyLen;
      steps++;
      if(n % currLen == 0 && currLen != n) {
        // Step for copy all
        copyLen = currLen;
        steps++;
      }
    }
    return steps;
  }
}
