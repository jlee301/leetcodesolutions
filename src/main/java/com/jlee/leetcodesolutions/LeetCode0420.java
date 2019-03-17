package com.jlee.leetcodesolutions;

public class LeetCode0420 {
  /*
   * A password is considered strong if below conditions are all met:
   * 1. It has at least 6 characters and at most 20 characters.
   * 2. It must contain at least one lowercase letter, at least one uppercase
   * letter, and at least one digit.
   * 3. It must NOT contain three repeating characters in a row ("...aaa..." is
   * weak, but "...aa...a..." is strong, assuming other conditions are met).
   * 
   * Write a function strongPasswordChecker(s), that takes a string s as input,
   * and return the MINIMUM change required to make s a strong password. If s is
   * already strong, return 0.
   * 
   * Insertion, deletion or replace of any one character are all considered as one
   * change.
   * 
   * https://leetcode.com/problems/strong-password-checker/description/
   */
  public int strongPasswordChecker(String s) {
    int N = s.length();
    int[] repeat = new int[3];
    int total_replace = 0;
    // repeat[0] = number of repeats that is a multiple of 3 remainder 0 (aaa) -> delete 1
    // repeat[1] = number of repeats that is a multiple of 3 remainder 1 (aaaa) -> delete 2
    // repeat[2] = number of repeats that is a multiple of 3 remainder 2 (aaaaa) -> delete 3
    // total_replace = total number of replacements required to eliminate all 3 consecutive repeats
    
    // 1. Find how many requirement characters are missing
    // 2. Count the number of repeating characters
    int lower = 1, upper = 1, digit = 1;
    for(int i = 0; i < N;) {
      char ch = s.charAt(i);
      if(Character.isLowerCase(ch))
        lower = 0;
      else if(Character.isUpperCase(ch))
        upper = 0;
      else if(Character.isDigit(ch))
        digit = 0;
      
      int j = i;
      while(i < N && ch == s.charAt(i)) 
        i++;
      
      if(i - j >= 3) {
        total_replace += (i-j) / 3;
        repeat[(i-j) % 3]++;
      }
    }
    int missing_req = lower + upper + digit;
 
    if(N < 6) {
      return missing_req + Math.max(6 - (N + missing_req), 0);
    }
    else if(N <= 20) {
      // Best approach is just to replace every third repeating character
      return Math.max(missing_req, total_replace);
    }
    else {
      // N > 20
      int overage = N - 20;
      if(overage <= repeat[0])
        total_replace -= overage;
      else if(overage - repeat[0] <= 2*repeat[1])
        total_replace -= repeat[0] + (overage - repeat[0]) / 2;
      else
        total_replace -= repeat[0] + repeat[1] + (overage - repeat[0] - 2*repeat[1]) / 3;
      
      return overage + Math.max(missing_req, total_replace);
    }
  }
}
