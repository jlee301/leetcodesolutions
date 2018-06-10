package com.jlee.leetcodesolutions;

public class LeetCode848 {
  /*
   * We have a string S of lowercase letters, and an integer array shifts.
   * 
   * Call the shift of a letter, the next letter in the alphabet, (wrapping around
   * so that 'z' becomes 'a').
   * 
   * For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
   * 
   * Now for each shifts[i] = x, we want to shift the first i+1 letters of S, x
   * times.
   * 
   * Return the final string after all such shifts to S are applied.
   * 
   * https://leetcode.com/contest/weekly-contest-88/problems/shifting-letters/
   */
  public String shiftingLetters(String S, int[] shifts) {
    // Long is used because shifts can sum beyond 32 bit.
    long sum = 0;
    for(int shift : shifts)
      sum += shift;
    
    char[] data = S.toCharArray();
    for(int i = 0; i < data.length; i++) {
      if(i > 0) 
        sum -= shifts[i-1];
      
      // Calculate the remainder from starting point 0 - 'a'
      long r = (data[i] - 'a' + sum) % 26;
      data[i] = (char) (r + 'a');
    }
    return String.valueOf(data);
  }
}
