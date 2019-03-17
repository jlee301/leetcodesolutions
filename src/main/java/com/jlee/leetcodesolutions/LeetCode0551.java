package com.jlee.leetcodesolutions;

public class LeetCode0551 {
  /*
   * You are given a string representing an attendance record for a student. The
   * record only contains the following three characters:
   * 'A' : Absent.
   * 'L' : Late.
   * 'P' : Present.
   * 
   * A student could be rewarded if his attendance record doesn't contain more
   * than one 'A' (absent) or more than two continuous 'L' (late).
   * 
   * You need to return whether the student could be rewarded according to his
   * attendance record.
   * 
   * Example 1:
   * Input: "PPALLP"
   * Output: True
   * 
   * Example 2:
   * Input: "PPALLL"
   * Output: False
   * 
   * https://leetcode.com/problems/student-attendance-record-i/description/
   */
  public boolean checkRecord(String s) {
    int aCount = 0;
    int i = 0;
    while(i < s.length()) {
      char ch = s.charAt(i);
      if(ch == 'A')
        aCount++;
      
      if(ch == 'L') {
        if(i < s.length()-2 && s.charAt(i+1) == 'L' && s.charAt(i+2) == 'L')
          return false;
      }
      i++;
    }
    return aCount < 2;
  }
}
