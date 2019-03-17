package com.jlee.leetcodesolutions;

public class LeetCode0038 {
  /*
   * The count-and-say sequence is the sequence of integers with the first five
   * terms as following:
   * 
   * 1. 1 
   * 2. 11 
   * 3. 21 
   * 4. 1211 
   * 5. 111221
   * 
   * Input: 1 
   * Output: "1"
   * 
   * Input: 4 
   * Output: "1211"
   * 
   * https://leetcode.com/problems/count-and-say/description/
   */
  public String countAndSay(int n) {
    // Base case
    String result = "1";
    
    for(int i = 1; i < n; i++) {
      int j = 0;
      // Generate next string
      String next = "";
      while(j < result.length()) {        
        // how many times does result[j] consecutively repeat
        char ch = result.charAt(j);
        int k = j + 1;
        while(k < result.length() && ch == result.charAt(k))
          k++;
        
        next += "" + (k-j) + ch;
        j = k;
      }
      result = next;
    }
    return result;
  }
}
