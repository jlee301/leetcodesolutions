package com.jlee.leetcodesolutions;

import java.lang.StringBuilder;
import java.util.HashSet;

public class LeetCode804 {
  /*
   * International Morse Code defines a standard encoding where each letter is
   * mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps
   * to "-...", "c" maps to "-.-.", and so on.
   * 
   * For convenience, the full table for the 26 letters of the English alphabet is
   * given below:
   * 
   * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
   * "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
   * "-.--","--.."]
   * 
   * Now, given a list of words, each word can be written as a concatenation of
   * the Morse code of each letter. For example, "cab" can be written as
   * "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call
   * such a concatenation, the transformation of a word.
   * 
   * Return the number of different transformations among all words we have.
   * 
   * Example:
   * Input: words = ["gin", "zen", "gig", "msg"]
   * Output: 2
   * 
   * Explanation:
   * The transformation of each word is:
   * "gin" -> "--...-."
   * "zen" -> "--...-."
   * "gig" -> "--...--."
   * "msg" -> "--...--."
   * There are 2 different transformations, "--...-." and "--...--.".
   * 
   * https://leetcode.com/problems/unique-morse-code-words/description/
   */
  public int uniqueMorseRepresentations(String[] words) {
    if(words == null || words.length == 0)
      return 0;
    
    String[] codes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
        "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
    
    // Using a HashSet will not allow duplicates to be added
    HashSet<String> set = new HashSet<>();
    for(String word : words) {
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < word.length(); i++)
        sb.append(codes[word.charAt(i)-'a']);
      set.add(sb.toString());
    }
    return set.size();
  }
}
