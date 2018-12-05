package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCode345 {
  /*
   * Write a function that takes a string as input and reverse only the vowels of
   * a string.
   * 
   * Example 1: 
   * Given s = "hello", return "holle".
   * 
   * Example 2: 
   * Given s = "leetcode", return "leotcede".
   * 
   * Note: The vowels does not include the letter "y".
   * 
   * https://leetcode.com/problems/reverse-vowels-of-a-string/description/
   */
  public String reverseVowels(String s) {
    HashSet<Character> vowels = new HashSet<>();
    vowels.addAll(Arrays.asList(new Character[] {'a','A','e','E','i','I','o','O','u','U'}));

    char[] sData = s.toCharArray();
    int left = 0, right = sData.length-1;
    while(left < right) {
      // find next vowel from left
      while(left < right && !vowels.contains(sData[left]))
        left++;
      
      // find next vowel from right
      while(left < right && !vowels.contains(sData[right]))
        right--;
      
      if(left < right) {
        // swap
        char temp = sData[right];
        sData[right] = sData[left];
        sData[left] = temp;
        left++;
        right--;
      }
    }
    return String.valueOf(sData);
  }
}
