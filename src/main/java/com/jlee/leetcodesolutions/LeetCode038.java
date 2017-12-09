package com.jlee.leetcodesolutions;

public class LeetCode038 {
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
    String result = "0";
    if (n <= 0)
      return result;
    else if (n == 1) {
      result = "1";
      return result;
    }

    // Initial value
    String prevResult = "1";

    for (int i = 1; i < n; i++) {
      int count = 1;
      char say = '0';
      char prev = '0';

      // Clear result here and generate next increment
      // using prevResult.
      result = "";
      // System.out.println("length: " + prevResult.length());
      for (int j = 0; j < prevResult.length(); j++) {
        say = prevResult.charAt(j);
        if (prev == say) {
          // The previous character matches the current
          // character, increment the count.
          count++;
        } else {
          if (j != 0) {
            // If first character, don't append result as prev is
            // not set. Previous character doesn't match the
            // current, so append to result then reset count = 1.
            result = result + count + prev;
            count = 1;
          }
        }
        prev = say;
      }
      // No more characters to evaluate in prevResult,
      // append the last set of data to result.
      result = result + count + say;

      // Now store the result into prevResult to be used on next
      // loop cycle. Variable result will clear above if i < n.
      prevResult = result;
      // System.out.println("result: " + result);
    }
    return result;
  }
}
