package com.jlee.leetcodesolutions;

import java.util.ArrayList;

public class LeetCode383 {
  /*
   * Given an arbitrary ransom note string and another string containing letters
   * from all the magazines, write a function that will return true if the ransom
   * note can be constructed from the magazines ; otherwise, it will return false.
   * 
   * Each letter in the magazine string can only be used once in your ransom note.
   * 
   * Note: You may assume that both strings contain only lowercase letters.
   * 
   * canConstruct("a", "b") -> false 
   * canConstruct("aa", "ab") -> false
   * canConstruct("aa", "aab") -> true
   * 
   * https://leetcode.com/problems/ransom-note/description/
   */
  public boolean canConstruct(String ransomNote, String magazine) {
    if(ransomNote == null || magazine == null)
      return false;
    
    // Store all characters from magazine into list
    ArrayList<Character> magList = new ArrayList<Character>();    
    for(int i = 0; i < magazine.length(); i++)
      magList.add((Character)magazine.charAt(i));
    
    // Check to see if chars from ransomNote exist in list
    for(int i = 0; i < ransomNote.length(); i++) {
      if(magList.contains((Character)ransomNote.charAt(i)))
        magList.remove((Character)ransomNote.charAt(i));
      else
        return false;
    }
    return true;
  }
}
