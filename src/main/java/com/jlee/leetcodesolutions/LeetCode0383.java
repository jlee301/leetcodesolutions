package com.jlee.leetcodesolutions;

public class LeetCode0383 {
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
    // find frequency of each char in magazine
    int[] count = new int[26];
    for(int i = 0; i < magazine.length(); i++)
      count[magazine.charAt(i) - 'a']++;
    
    // check if you have enough chars to build the note
    for(int i = 0; i < ransomNote.length(); i++) {
      int ch = ransomNote.charAt(i) - 'a';
      if(count[ch] == 0)
        return false;
      else
        count[ch]--;
    }
    return true;
  }
}
