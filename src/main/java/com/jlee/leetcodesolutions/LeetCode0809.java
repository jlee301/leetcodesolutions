package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0809 {
  /*
   * Sometimes people repeat letters to represent extra feeling, such as "hello"
   * -> "heeellooo", "hi" -> "hiiii". Here, we have groups, of adjacent letters
   * that are all the same character, and adjacent characters to the group are
   * different. A group is extended if that group is length 3 or more, so "e" and
   * "o" would be extended in the first example, and "i" would be extended in the
   * second example. As another example, the groups of "abbcccaaaa" would be "a",
   * "bb", "ccc", and "aaaa"; and "ccc" and "aaaa" are the extended groups of that
   * string.
   * 
   * For some given string S, a query word is stretchy if it can be made to be
   * equal to S by extending some groups. Formally, we are allowed to repeatedly
   * choose a group (as defined above) of characters c, and add some number of the
   * same character c to it so that the length of the group is 3 or more. Note
   * that we cannot extend a group of size one like "h" to a group of size two
   * like "hh" - all extensions must leave the group extended - ie., at least 3
   * characters long.
   * 
   * Given a list of query words, return the number of words that are stretchy.
   * 
   * https://leetcode.com/problems/expressive-words/description/
   */
  public int expressiveWords(String S, String[] words) {
    // Define the groups and frequency of S
    List<int[]> list = groupBreakdown(S);
    
    // Now check each word to see if it can be extended
    int stretchy = 0;
    for(String word : words) {
      // Build groups and frequency for the word
      List<int[]> temp = groupBreakdown(word);
      boolean isStretchy = true;

      // There are more groups in either S or word
      if(list.size() != temp.size()) {
        isStretchy = false;
        break;
      }
      
      for(int i = 0; i < temp.size(); i++) {
        int[] sData = list.get(i);
        int[] wordData = temp.get(i);
        
        // Chars do not match
        if(sData[0] != wordData[0]) {
          isStretchy = false;
          break;
        }
        
        // Check the frequency of the group, can it be extended?
        if(wordData[1] > sData[1] || sData[1] < 3 && sData[1] != wordData[1]) {
          isStretchy = false;
          break;
        }
      }
      if(isStretchy) stretchy++;
    }
    return stretchy;
  }
  
  private List<int[]> groupBreakdown(String word) {
    // Define the groups and length of each
    List<int[]> list = new ArrayList<>();
    for(int i = 0; i < word.length(); i++) {
      int j = i+1; 
      char ch = word.charAt(i);
      // Advance until next ch is different
      while(j < word.length() && ch == word.charAt(j)) j++;
      list.add(new int[] { ch-'a', j-i });
      i = j - 1;
    }
    return list;
  }
}
