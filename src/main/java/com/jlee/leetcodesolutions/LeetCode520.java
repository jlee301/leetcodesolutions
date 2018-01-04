package com.jlee.leetcodesolutions;

public class LeetCode520 {
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
    if(word == null)
      return false;
    
    if(word.length() == 0)
      return true;
    
    int cap = 0;
    for(int i = 0; i < word.length(); i++) {
      if(word.charAt(i) - 'a' < 0)
        cap++;
    }
    if(cap == word.length() || cap == 0 || (cap == 1 && word.charAt(0) - 'a' < 0))
      return true;
    else
      return false;
  }
}
