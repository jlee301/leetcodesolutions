package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0093 {
  /*
   * Given a string containing only digits, restore it by returning all possible
   * valid IP address combinations.
   * 
   * For example: Given "25525511135",
   * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
   * 
   * https://leetcode.com/problems/restore-ip-addresses/description/
   */
  public List<String> restoreIpAddresses(String s){
    List<String> result = new ArrayList<>();
    if(s == null)
      return result;
    
    helper(result, s, "", 0);
    return result;
  }
  
  private void helper(List<String> result, String s, String temp, int count) {
    if(count == 4) {
      if(s.length() == 0) result.add(temp.substring(0, temp.length()-1));
      return;
    }
    for(int i = 1; i <= 3; i++) {
      // There is not enough numbers left
      if(s.length() < i) break;
      int val = Integer.valueOf(s.substring(0, i));
      // If the value is greater than 255 or the value had a leading zero, skip
      if(val > 255 || i != String.valueOf(val).length()) continue;
      helper(result, s.substring(i), temp + val + ".", count+1);
    }
  }
}
