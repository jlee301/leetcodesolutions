package com.jlee.leetcodesolutions;

public class LeetCode0880 {
  /*
   * An encoded string S is given. To find and write the decoded string to a tape,
   * the encoded string is read one character at a time and the following steps
   * are taken:
   * 1. If the character read is a letter, that letter is written onto the tape.
   * 2. If the character read is a digit (say d), the entire current tape is
   * repeatedly written d-1 more times in total.
   * 
   * Now for some encoded string S, and an index K, find and return the K-th
   * letter (1 indexed) in the decoded string.
   * 
   * https://leetcode.com/contest/weekly-contest-96/problems/decoded-string-at-index/
   */
  public String decodeAtIndex(String S, int K) {
    // Find length of decoded string
    long length = 0;
    for(int i = 0; i < S.length(); i++) {
      char ch = S.charAt(i);
      if(Character.isDigit(ch))
        length *= ch - '0';
      else
        length++;
    }
    
    // Now work backwards to find the Kth character
    char ch = 0;
    int i = S.length()-1;
    while(true) {
      ch = S.charAt(i);
      K %= length;
      if(K == 0 && !Character.isDigit(ch))
        break;
      
      if(Character.isDigit(ch))
        length /= ch - '0';
      else
        length--;
      
      i--;
    }
    return "" + ch;
  }
}
