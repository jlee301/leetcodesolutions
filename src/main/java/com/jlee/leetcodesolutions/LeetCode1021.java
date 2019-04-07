package com.jlee.leetcodesolutions;

public class LeetCode1021 {
  /*
   * https://leetcode.com/contest/weekly-contest-131/problems/remove-outermost-parentheses/
   */
  public String removeOuterParentheses(String S) {
    // Input: "(()())(())"
    // "(()())" + "(())"
    // Output: "()()()"
    String ans = "";
    int count = 0;
    int left = 0, right = 0;
    while(left < S.length()) {
      if(S.charAt(right) == '(')
        count++;
      else
        count--;
      
      // Anytime the count == 0, 
      // substring(left+1, right) is the primitive string with the outer parenthesis removed
      if(count == 0) {
        ans += S.substring(left+1, right);
        left = right + 1;
      }
      right++;
    }
    return ans;
  }
}
