package com.jlee.leetcodesolutions;

public class LeetCode125 {
  /*
   * Given a string, determine if it is a palindrome, considering only
   * alphanumeric characters and ignoring cases.
   * 
   * Input: "A man, a plan, a canal: Panama"
   * Output: true
   * 
   * Input: "race a car"
   * Output: false
   * 
   * Note: Have you consider that the string might be empty? This is a good
   * question to ask during an interview.
   * 
   * For the purpose of this problem, we define empty string as valid palindrome.
   * 
   * https://leetcode.com/problems/valid-palindrome/description/
   */
  public boolean isPalindrome(String s) {
    boolean result = true;
    if(s.isEmpty()) {
      return result;
    }
    
    s = s.toLowerCase();
    int head = 0;
    int tail = s.length() - 1;
    
    while(head <= tail) {
      char cHead = s.charAt(head);
      char cTail = s.charAt(tail);

      // Check if character is alphanumeric
      if(!Character.isLetterOrDigit(cHead)) {
        head++;
      } else if(!Character.isLetterOrDigit(cTail)) {
        tail--;
      } else {
        // Now check if characters match
        if(cHead == cTail) {
          head++;
          tail--;
        } else {
          result = false;
          return result;
        }
      }
    }
    return result;
  }
}