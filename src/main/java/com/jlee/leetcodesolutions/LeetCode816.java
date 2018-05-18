package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode816 {
  /*
   * We had some 2-dimensional coordinates, like "(1, 3)" or "(2, 0.5)". Then, we
   * removed all commas, decimal points, and spaces, and ended up with the string
   * S. Return a list of strings representing all possibilities for what our
   * original coordinates could have been.
   * 
   * Our original representation never had extraneous zeroes, so we never started
   * with numbers like "00", "0.0", "0.00", "1.0", "001", "00.01", or any other
   * number that can be represented with less digits. Also, a decimal point within
   * a number never occurs without at least one digit occuring before it, so we
   * never started with numbers like ".1".
   * 
   * The final answer list can be returned in any order. Also note that all
   * coordinates in the final answer have exactly one space between them
   * (occurring after the comma.)
   * 
   * Note:
   * 1. 4 <= S.length <= 12.
   * 2. S[0] = "(", S[S.length - 1] = ")", and the other elements in S are digits.
   * 
   * https://leetcode.com/problems/ambiguous-coordinates/description/
   */
  public List<String> ambiguousCoordinates(String S) {
    List<String> result = new ArrayList<>();
    for(int i = 2; i < S.length()-1; i++) {
      for(String left : decimalPlacement(S, 1, i)) {
        for(String right : decimalPlacement(S, i, S.length()-1))
          result.add("(" + left + ", " + right + ")");
      }
    }
    return result;
  }
  
  private List<String> decimalPlacement(String S, int start, int end) {
    List<String> data = new ArrayList<>();
    for(int d = 1; d <= end-start; d++) {
      String left = S.substring(start, start+d);
      String right = S.substring(start+d, end);
      // Left of decimal start with any digit but zero (1, 2, 12)
      // Left can start with zero only if the whole left is zero (0)
      // Right of the decimal cannot end with extra zero (1.0, 1.10)
      if((!left.startsWith("0") || left.equals("0")) && !right.endsWith("0"))
        // Only add decimal if there is a right side
        data.add(left + (!right.isEmpty() ? "." : "") + right);
    }
    return data;
  }
}
