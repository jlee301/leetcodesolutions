package com.jlee.leetcodesolutions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Arrays;

public class LeetCode242 {
  /*
   * Given two strings s and t, write a function to determine if t is an anagram
   * of s.
   * 
   * For example, 
   * s = "anagram", t = "nagaram", return true. 
   * s = "rat", t = "car", return false.
   * 
   * Note: You may assume the string contains only lowercase alphabets.
   * 
   * Follow up: What if the inputs contain unicode characters? How would you adapt
   * your solution to such case?
   * 
   * https://leetcode.com/problems/valid-anagram/description/
   */
  public boolean isAnagram(String s, String t) {
   if(s == null || t == null || s.length() != t.length())
     return false;
   
   char[] a = s.toCharArray();
   char[] b = t.toCharArray();
   
   Arrays.sort(a);
   Arrays.sort(b);
   
   return Arrays.equals(a, b);
  }
  
  public boolean isAnagramUsingHash(String s, String t) {
    if(s == null || t == null || s.length() != t.length())
      return false;
    
    // Hash for character set a-z
    // hash[0] = a
    // hash[25] = z
    int[] hash = new int[26];
    for(int i = 0; i < s.length(); i++) {
      // s.charAt(i) = 'a'
      // s.charAt(i) - 'a' = 0;
      //
      // s.charAt(i) = 'z'
      // s.charAt(i) - 'a' = 25
      hash[s.charAt(i) - 'a']++;
      hash[t.charAt(i) - 'a']--;
    }
    
    for(int i = 0; i < 26; i++) {
      if(hash[i] != 0)
        return false;
    }
    return true;
  }
  
  public boolean isAnagramOriginal(String s, String t) {
    if(s == null || t == null || s.length() != t.length())
      return false;
   
    HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
    for(int i = 0; i < s.length(); i++) {
      if(hash.containsKey(s.charAt(i))) {
        hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
      } else {
        hash.put(s.charAt(i), 1);
      }

      if(hash.containsKey(t.charAt(i))) {
        hash.put(t.charAt(i), hash.get(t.charAt(i)) - 1);
      } else {
        hash.put(t.charAt(i), -1);
      }
    }
    
    Collection<Integer> data = hash.values();
    Iterator<Integer> iter = data.iterator();
    while(iter.hasNext()) {
      if(iter.next() != 0)
        return false;
    }
    return true;
  }
}