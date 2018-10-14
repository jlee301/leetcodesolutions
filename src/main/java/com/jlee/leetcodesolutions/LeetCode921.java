package com.jlee.leetcodesolutions;

public class LeetCode921 {
  /*
   * Given a string S of '(' and ')' parentheses, we add the minimum number of
   * parentheses ( '(' or ')', and in any positions ) so that the resulting
   * parentheses string is valid.
   * 
   * Given a parentheses string, return the minimum number of parentheses we must
   * add to make the resulting string valid.
   * 
   * https://leetcode.com/contest/weekly-contest-106/problems/minimum-add-to-make-parentheses-valid/
   */
  public int minAddToMakeValid(String S) {
    // When we see '(' we add +1 to the count
    // When we see ')' we add -1 to the count
    // Any time count == -1, we must add a '('
    // Finally at the end, if count is still greater than 0, we must add ')' to close it out
    int count = 0, result = 0;
    for(int i = 0; i < S.length(); i++) {
      char ch = S.charAt(i);
      if(ch == '(')
        count++;
      else
        count--;
      
      if(count == -1) {
        result++;
        count = 0;
      }
    }
    result += count;
    return result;
  }
}
