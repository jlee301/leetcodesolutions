package com.jlee.leetcodesolutions;

public class LeetCode0748 {
  /*
   * Find the minimum length word from a given dictionary words, which has all the
   * letters from the string licensePlate. Such a word is said to complete the
   * given string licensePlate
   * 
   * Here, for letters we ignore case. For example, "P" on the licensePlate still
   * matches "p" on the word.
   * 
   * It is guaranteed an answer exists. If there are multiple answers, return the
   * one that occurs first in the array.
   * 
   * The license plate might have the same letter occurring multiple times. For
   * example, given a licensePlate of "PP", the word "pair" does not complete the
   * licensePlate, but the word "supper" does.
   * 
   * Note:
   * 1. licensePlate will be a string with length in range [1, 7].
   * 2. licensePlate will contain digits, spaces, or letters (uppercase or
   * lowercase).
   * 3. words will have a length in the range [10, 1000].
   * 4. Every words[i] will consist of lowercase letters, and have length in range
   * [1, 15].
   * 
   * https://leetcode.com/problems/shortest-completing-word/description/
   */
  public String shortestCompletingWord(String licensePlate, String[] words) {
    // Get char count of licensePlate
    int[] count = new int[26];
    licensePlate = licensePlate.toLowerCase();
    for(int i = 0; i < licensePlate.length(); i++) {
      char ch = licensePlate.charAt(i);
      if(Character.isLetter(ch))
        count[ch - 'a']++;
    }
    
    // Now compare with every word in words to see who can provide min length
    int min = Integer.MAX_VALUE;
    String result = "";
    for(String word : words) {
      if(plateMatch(count.clone(), word) && min > word.length()) {
        min = word.length();
        result = word;
      }
    }
    return result;
  }
  
  private boolean plateMatch(int[] count, String word) {
    for(int i = 0; i < word.length(); i++)
      count[word.charAt(i) - 'a']--;
    
    for(int num : count) {
      if(num > 0)
        return false;
    }
    return true;
  }
}
