package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode906 {
  /*
   * Let's say a positive integer is a superpalindrome if it is a palindrome, and
   * it is also the square of a palindrome.
   * 
   * Now, given two positive integers L and R (represented as strings), return the
   * number of superpalindromes in the inclusive range [L, R].
   * 
   * https://leetcode.com/problems/super-palindromes/description/
   */
  public int superpalindromesInRange(String L, String R) {
    long l = Long.valueOf(L), r = Long.valueOf(R);
    int result = 0;
    for(long i = (long) Math.sqrt(l); i * i <= r;) {
      // Get the next palindrome >= i
      long nextP = nextPalindrome(i);
      // Now check if the square of nextP is also a palindrome
      if(nextP * nextP <= r && isPalindrome(nextP * nextP))
        result++;
      
      i = nextP + 1;
    }
    return result;
  }

  private long nextPalindrome(long l) {
    String str = Long.toString(l);
    int N = str.length();
    String half = str.substring(0, (N + 1) / 2);
    String nextHalf = Long.toString(Long.valueOf(half) + 1);
    String reverse = new StringBuilder(half.substring(0, N / 2)).reverse().toString();
    String nextReverse = new StringBuilder(nextHalf.substring(0, N / 2)).reverse().toString();

    List<Long> candidates = new ArrayList<>();
    candidates.add(Long.valueOf(half + reverse));
    candidates.add(Long.valueOf(nextHalf + nextReverse));

    long result = Long.MAX_VALUE;
    for(long next : candidates) {
      if (next >= l)
        result = Math.min(result, next);
    }
    return result;
  }
  
  private boolean isPalindrome(long num) {
    String str = Long.toString(num);
    int left = 0, right = str.length()-1;
    while(left < right) {
      if(str.charAt(left++) != str.charAt(right--))
        return false;
    }
    return true;
  }
}
