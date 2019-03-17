package com.jlee.leetcodesolutions;

public class LeetCode0520 {
  /*
   * Given a word, you need to judge whether the usage of capitals in it is right
   * or not.
   * 
   * We define the usage of capitals in a word to be right when one of the
   * following cases holds:
   * 1. All letters in this word are capitals, like "USA".
   * 2. All letters in this word are not capitals, like "leetcode".
   * 3. Only the first letter in this word is capital if it has more than one
   * letter, like "Google".
   * 
   * Otherwise, we define that this word doesn't use capitals in a right way.
   * 
   * Example 1:
   * Input: "USA"
   * Output: True
   * 
   * Example 2:
   * Input: "FlaG"
   * Output: False
   * 
   * Note: The input will be a non-empty word consisting of uppercase and
   * lowercase latin letters.
   * 
   * https://leetcode.com/problems/detect-capital/description/
   */
  public boolean detectCapitalUse(String word) {
    boolean upperSum = true;
    boolean lowerSum = true;
    for(int i = 1; i < word.length(); i++) {
      char ch = word.charAt(i);
      boolean upper = Character.isUpperCase(ch);
      upperSum &= upper;
      lowerSum &= !upper;
    }
    
    // 1. If first letter is upper case      
    //    a. remaining chars are either all lower or all upper
    // 2. If first letter is lower case
    //    a. remaining chars are all lower case
    if(Character.isUpperCase(word.charAt(0)))
      return upperSum || lowerSum;
    else
      return lowerSum;
  }
}
