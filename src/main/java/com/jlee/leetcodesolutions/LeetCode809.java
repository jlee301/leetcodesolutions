package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode809 {
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
    // Define the groups and length of each
    List<int[]> list = new ArrayList<>();
    for(int i = 0; i < S.length(); i++) {
      int j = i+1; 
      char ch = S.charAt(i);
      // Advance until next ch is different
      while(j < S.length() && ch == S.charAt(j)) j++;
      list.add(new int[] { ch-'a', j-i });
      i = j - 1;
    }
    
    // Now check each word to see if it can be extended
    int stretchy = 0;
    for(String word : words) {
      int j = 0;
      for(int i = 0; i < word.length(); i++, j++) {
        int k = i+1;
        char ch = word.charAt(i);
        int[] data = list.get(j);
        
        // Char do not match
        if(ch-'a' != data[0]) break;
        
        // Check the frequency of the group, can it be extended?
        while(k < word.length() && ch == word.charAt(k)) k++;
        int count = k - i;
        if(count > data[1] || data[1] < 3 && data[1] != count) break;

        i = k - 1;
      }
      if(j == list.size()) stretchy++;
    }
    return stretchy;
  }
}
