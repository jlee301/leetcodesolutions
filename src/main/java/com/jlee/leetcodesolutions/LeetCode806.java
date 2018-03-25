package com.jlee.leetcodesolutions;

public class LeetCode806 {
  /*
   * We are to write the letters of a given string S, from left to right into
   * lines. Each line has maximum width 100 units, and if writing a letter would
   * cause the width of the line to exceed 100 units, it is written on the next
   * line. We are given an array widths, an array where widths[0] is the width of
   * 'a', widths[1] is the width of 'b', ..., and widths[25] is the width of 'z'.
   * 
   * Now answer two questions: how many lines have at least one character from S,
   * and what is the width used by the last such line? Return your answer as an
   * integer list of length 2.
   * 
   * https://leetcode.com/problems/number-of-lines-to-write-string/description/
   */
  public int[] numberOfLines(int[] widths, String S) {
    if(widths == null || S == null || widths.length == 0 || S.length() == 0)
      return new int[] {0,0};
    
    int units = 0, lines = 1;
    for(int i = 0; i < S.length(); i++) {
      int width = widths[S.charAt(i)-'a'];
      units += width;
      if(units > 100) {
        lines++;
        units = width;
      }
    }
    return new int[] {lines, units};
  }
}
