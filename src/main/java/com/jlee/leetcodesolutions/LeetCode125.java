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
    if(s == null)
      return false;
    
    int left = 0, right = s.length()-1;
    s = s.toLowerCase();
    while(left < right) {
      char chLeft = s.charAt(left);
      char chRight = s.charAt(right);
      if(!Character.isLetterOrDigit(chLeft)) {
        left++;
        continue;
      }
      
      if(!Character.isLetterOrDigit(chRight)) {
        right--;
        continue;
      }
      
      if(chLeft != chRight)
        return false;
      
      left++;
      right--;
    }
    return true;
  }
}
