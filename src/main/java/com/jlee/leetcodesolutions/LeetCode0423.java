package com.jlee.leetcodesolutions;

public class LeetCode0423 {
  /*
   * Given a non-empty string containing an out-of-order English representation of
   * digits 0-9, output the digits in ascending order.
   * 
   * Note: 
   * 1. Input contains only lowercase English letters.
   * 2. Input is guaranteed to be valid and can be transformed to its original
   * digits. That means invalid inputs such as "abc" or "zerone" are not
   * permitted.
   * 3. Input length is less than 50,000.
   * 
   * Example 1:
   * Input: "owoztneoer"
   * Output: "012"
   * 
   * Example 2:
   * Input: "fviefuro"
   * Output: "45"
   * 
   * https://leetcode.com/problems/reconstruct-original-digits-from-english/description/
   */
  public String originalDigits(String s) {
    if(s == null || s.isEmpty())
      return "";
    int[] nums = new int[10];
    for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if(ch == 'z') nums[0]++;
      else if(ch == 'n') nums[1]++; // 1,9,7
      else if(ch == 'w') nums[2]++;
      else if(ch == 'h') nums[3]++; // 3,8
      else if(ch == 'u') nums[4]++;
      else if(ch == 'f') nums[5]++; // 5,4
      else if(ch == 'x') nums[6]++;
      else if(ch == 's') nums[7]++; // 7,6
      else if(ch == 'g') nums[8]++;
      else if(ch == 'i') nums[9]++; // 9,8,6,5
    }
    nums[7] = nums[7] - nums[6];
    nums[5] = nums[5] - nums[4];
    nums[3] = nums[3] - nums[8];
    nums[9] = nums[9] - nums[8] - nums[6] - nums[5];
    // Because we are using 'n' to determine one, 
    // n appears twice in nine and once in seven
    nums[1] = nums[1] - (2*nums[9]) - nums[7];

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < nums.length; i++) {
      for(int j = 0; j < nums[i]; j++)
        sb.append(i);
    }
    return sb.toString();
  }
}
