package com.jlee.leetcodesolutions;

public class LeetCode551 {
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
    if(s == null || s.length() == 0)
      return true;
    
    int aCount = 0, lCount = 0;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == 'A') {
        aCount++;
        lCount = 0;
        if(aCount > 1)
          return false;
      } else if(s.charAt(i) == 'L') {
        lCount++;
        if(lCount == 3)
          return false;
      } else {
        lCount = 0;
      }
    }
    return true;
  }
}
