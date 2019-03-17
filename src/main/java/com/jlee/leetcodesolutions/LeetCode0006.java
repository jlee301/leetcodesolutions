package com.jlee.leetcodesolutions;

import java.lang.StringBuilder;

public class LeetCode0006 {
  /*
   * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
   * of rows like this: (you may want to display this pattern in a fixed font for
   * better legibility)
   * 
   * P   A   H   N 
   * A P L S I I G 
   * Y   I   R
   * 
   * And then read line by line: "PAHNAPLSIIGYIR"
   * 
   * Write the code that will take a string and make this conversion given a
   * number of rows.
   * 
   * https://leetcode.com/problems/zigzag-conversion/description/
   */
  public String convert(String s, int numRows) {
    if(s == null || s.length() == 0)
      return "";
    
    if(numRows <= 1)
      return s;
    
    StringBuilder[] sb = new StringBuilder[numRows];
    for(int i = 0; i < numRows; i++)
      sb[i] = new StringBuilder();
    
    int rowTrack = 0;
    boolean zig = true;
    for(int i = 0; i < s.length(); i++) {
      // We use boolean zig to track the direction of the write
      if(zig) {
        sb[rowTrack++].append(s.charAt(i));
        // Since numRows == 2 is special case compared to the rest, we must track for
        // this as zig = false (zag) and numRows != 2, you write in between indices 0 and
        // length-1 (exclusive).
        if(rowTrack == numRows || numRows == 2) {
          zig = false;
          if(numRows != 2)
            rowTrack = numRows - 2;
        }        
      } else {
        // zag behavior
        sb[rowTrack--].append(s.charAt(i));
        if(rowTrack == 0)
          zig = true;
      }
    }
    
    String result = "";
    for(StringBuilder entry : sb) {
      result += entry.toString();
    }
    return result;
  }
}
