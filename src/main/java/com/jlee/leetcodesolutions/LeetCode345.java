package com.jlee.leetcodesolutions;

import java.util.ArrayList;

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
  private final ArrayList<Character> vowels;
  
  public LeetCode345() {
    vowels = new ArrayList<Character>(10);
    vowels.add((Character)'A');
    vowels.add((Character)'a');
    vowels.add((Character)'E');
    vowels.add((Character)'e');
    vowels.add((Character)'I');
    vowels.add((Character)'i');
    vowels.add((Character)'O');
    vowels.add((Character)'o');
    vowels.add((Character)'U');
    vowels.add((Character)'u');
  }
  
  public String reverseVowels(String s) {
    if(s == null)
      return null;
    
    int head = 0;
    int tail = s.length() - 1;
    char[] sCharArray = s.toCharArray();
    
    while(head < tail) {
      // Stop moving head pointer once you see a vowel      
      while(head < tail && !vowels.contains((Character)sCharArray[head]))
        head++;

      // Stop moving tail pointer once you see a vowel      
      while(head < tail && !vowels.contains((Character)sCharArray[tail]))
        tail--;
      
      if(head >= tail) {
        // If head pointer is greater-equal than tail pointer, then there's no more vowels to
        // reverse.
        break;
      } else {
        sCharArray[head] = s.charAt(tail);
        sCharArray[tail] = s.charAt(head);
        head++;
        tail--;
      }
    }
    String result = "";
    for(int i = 0; i < sCharArray.length; i++) {
      result += sCharArray[i];
    }
    return result;
  }
}
