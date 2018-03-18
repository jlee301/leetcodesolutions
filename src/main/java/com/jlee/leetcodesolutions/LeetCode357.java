package com.jlee.leetcodesolutions;

public class LeetCode357 {
  /*
   * Given a non-negative integer n, count all numbers with unique digits, x,
   * where 0 ≤ x < 10^n.
   * 
   * Example: Given n = 2, return 91. (The answer should be the total numbers in
   * the range of 0 ≤ x < 100, excluding [11,22,33,44,55,66,77,88,99])
   * 
   * https://leetcode.com/problems/count-numbers-with-unique-digits/description/
   */
  public int countNumbersWithUniqueDigits(int n) {
    if (n == 0)
      return 1;

    /*
     * f(1) = 10 -- Digits 0-9
     * f(2) = f(1) + 9*9 -- For two digits 10-99. First digit has 9 choices 1-9,
     * second one has 9 choices excluding the already chosen one. So total 9*9 = 81
     * f(3) = f(3) + 9*9*8
     * f(4) = f(3) + 9*9*8*7
     * ...
     * f(10) = f(9) + 9*9*8*7*...*1
     * f(11) = f(10) + 9*9*8*7*...*1*0 -- No unique digits when there is greater
     * than 10 digits
     */
    int result = 10;
    int multiplier = 9;
    int availableDigits = 9;
    while (n > 1 && availableDigits > 0) {
      multiplier *= availableDigits;
      result += multiplier;
      n--;
      availableDigits--;
    }
    return result;
  }
}
