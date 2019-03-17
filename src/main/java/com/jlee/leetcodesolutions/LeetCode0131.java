package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0131 {
  /*
   * Given a string s, partition s such that every substring of the partition is a
   * palindrome.
   * 
   * Return all possible palindrome partitioning of s.
   * 
   * For example, 
   * given s = "aab", 
   * Return [ ["aa","b"], ["a","a","b"] ]
   * 
   * https://leetcode.com/problems/palindrome-partitioning/description/
   */
  public List<List<String>> partition(String s) {
    List<List<String>> res = new ArrayList<>();
    if(s == null)
      return res;
    
    partitionHelper(res, new ArrayList<>(), s, 0);
    return res;
  }
  
  private void partitionHelper(List<List<String>> res, List<String> temp, String s, int pos) {
    if(pos == s.length()) {
      res.add(new ArrayList<>(temp));
      return;
    }
    for(int i = pos; i < s.length(); i++) {
      if(isPalindrome(s, pos, i)) {
        temp.add(s.substring(pos, i+1));
        partitionHelper(res, temp, s, i+1);
        temp.remove(temp.size()-1);
      }
    }
  }

  private boolean isPalindrome(String s, int start, int end) {
    while(start < end) {
      if(s.charAt(start) != s.charAt(end))
        return false;
      start++;
      end--;
    }
    return true;
  }
}
