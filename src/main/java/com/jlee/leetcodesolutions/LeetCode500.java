package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode500 {
  /*
   * Given a List of words, return the words that can be typed using letters of
   * alphabet on only one row's of American keyboard like the image below.
   * 
   * Example 1: 
   * Input: ["Hello", "Alaska", "Dad", "Peace"] 
   * Output: ["Alaska","Dad"]
   * 
   * Note:
   * You may use one character in the keyboard more than once. You may assume the
   * input string will only contain letters of alphabet.
   * 
   * https://leetcode.com/problems/keyboard-row/description/
   */
  public String[] findWords(String[] words) {
    List<String> result = new ArrayList<>();
    
    // Map each char to a row
    int[] map = {1,2,2,1,0,1,1,1,0,1,1,1,2,2,0,0,0,0,1,0,0,2,0,2,0,2};
    for(String word : words) {
      String str = word.toLowerCase();
      boolean addWord = true;
      int prev = -1;
      for(int i = 0; i < str.length(); i++) {
        if(prev == -1) {
          prev = map[str.charAt(i) - 'a'];
          continue;
        }
        // If not the same row, fail
        if(prev != map[str.charAt(i) - 'a']) {
          addWord = false;
          break;
        }
      }
      if(addWord)
        result.add(word);
    }
    String[] ans = new String[result.size()];
    ans = result.toArray(ans);
    return ans;
  }
}
