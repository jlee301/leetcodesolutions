package com.jlee.leetcodesolutions;

public class LeetCode564 {
  /*
   * Given an integer n, find the closest integer (not including itself), which is
   * a palindrome.
   * 
   * The 'closest' is defined as absolute difference minimized between two
   * integers.
   * 
   * Note:
   * 1. The input n is a positive integer represented by string, whose length will
   * not exceed 18.
   * 2. If there is a tie, return the smaller one as answer.
   * 
   * https://leetcode.com/problems/find-the-closest-palindrome/description/
   */
  public String nearestPalindromic(String n) {
    if(n.equals("1"))
      return "0";
    
    long diff1 = Long.MAX_VALUE;
    String ans1 = mirror(n);
    diff1 = Math.abs(Long.valueOf(n) - Long.valueOf(ans1));
    // The input n was already a palindrome
    if(diff1 == 0)
      diff1 = Long.MAX_VALUE;
    
 
    // We deduct 1 from firstHalf
    StringBuilder sb = new StringBuilder(n);
    int i = (sb.length()-1) / 2;
    // Handle special case if the digit is a 0 --> 9
    while(i >= 1 && sb.charAt(i) == '0') {
      sb.replace(i, i+1, "9");
      i--;
    }    
    if(i == 0 && sb.charAt(i) == '1') {
      sb.delete(0, 1);
      int mid = (sb.length()-1) / 2;
      sb.replace(mid, mid+1, "9");
    }
    else {
      sb.replace(i, i+1, "" + (char)(sb.charAt(i)-1));
    }
    String ans2 = mirror(sb.toString());
    long diff2 = Math.abs(Long.valueOf(n) - Long.valueOf(ans2));
    

    // We add 1 to firstHalf
    sb = new StringBuilder(n);
    i = (sb.length()-1) / 2;
    // Handle special case if the digit is a 9 --> 0
    while(i >= 0 && sb.charAt(i) == '9') {
      sb.replace(i, i+1, "0");
      i--;
    }
    if(i < 0) {
      sb.insert(0, "1");
    }
    else {
      sb.replace(i, i+1, "" + (char)(sb.charAt(i)+1));
    }
    String ans3 = mirror(sb.toString());
    long diff3 = Math.abs(Long.valueOf(n) - Long.valueOf(ans3));
    

    if(diff2 <= diff1 && diff2 <= diff3)
      return ans2;
    else if(diff1 <= diff2 && diff1 <= diff3)
      return ans1;
    else
      return ans3;
  }
  
  // Take the front half of the string and make it the 2nd half in reverse
  private String mirror(String str) {
    int N = str.length();
    String firstHalf = str.substring(0, N/2);
    // If odd length, we must keep the middle digit in tact
    return firstHalf + (N % 2 == 1 ? str.charAt(N/2) : "") + new StringBuilder(firstHalf).reverse().toString();
  }
}
