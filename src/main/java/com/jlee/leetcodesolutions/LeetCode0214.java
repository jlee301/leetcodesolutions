package com.jlee.leetcodesolutions;

public class LeetCode0214 {
  /*
   * Given a string s, you are allowed to convert it to a palindrome by adding
   * characters in front of it. Find and return the shortest palindrome you can
   * find by performing this transformation.
   * 
   * https://leetcode.com/problems/shortest-palindrome/description/
   */
  public String shortestPalindrome(String s) {
    String sReversed = new StringBuilder(s).reverse().toString();
    int N = s.length();
    
    // Find longest palindrome in s, the remaining letters in reversed is what you
    // append to s to create shortest palindrome.
    // abccbadfg --> [abccba] longest palindrome, [dfg] remaining -> [gfd] reversed
    // [gfd][abccbadfg] --> isPalindrome
    for(int i = 0; i < N; i++) {
      String temp1 = s.substring(0, N-i);
      String temp2 = sReversed.substring(i);
      if(temp1.equals(temp2))
        return sReversed.substring(0, i) + s;
    }
    return "";
  }
}
