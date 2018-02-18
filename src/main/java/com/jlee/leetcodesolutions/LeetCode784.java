package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode784 {
  /*
   * Given a string S, we can transform every letter individually to be lowercase
   * or uppercase to create another string. Return a list of all possible strings
   * we could create.
   * 
   * Examples:
   * 
   * Input: S = "a1b2" 
   * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
   * 
   * Input: S = "3z4" 
   * Output: ["3z4", "3Z4"]
   * 
   * Input: S = "12345" 
   * Output: ["12345"]
   * 
   * Note:
   * 1. S will be a string with length at most 12.
   * 2. S will consist only of letters or digits.
   * 
   * https://leetcode.com/problems/letter-case-permutation/description/
   */
  public List<String> letterCasePermutation(String S) {
    List<String> res = new ArrayList<>();
    if(S == null)
      return res;
    helper(res, "", S, 0);
    return res;
  }
  
  private void helper(List<String> res, String temp, String S, int pos) {
    if(temp.length() == S.length()) {
      res.add(temp);
      return;
    }
    
    if(S.charAt(pos) >= 'A' && S.charAt(pos) <= 'Z')
      helper(res, temp+Character.toLowerCase(S.charAt(pos)), S, pos+1);
    if(S.charAt(pos) >= 'a' && S.charAt(pos) <= 'z')
      helper(res, temp+Character.toUpperCase(S.charAt(pos)), S, pos+1);
    
    // This last helper will handle the normal alpha case and any numeric values.
    helper(res, temp+S.charAt(pos), S, pos+1);
  }
}
