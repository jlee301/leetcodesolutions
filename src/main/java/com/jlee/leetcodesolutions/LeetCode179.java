package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode179 {
  /*
   * Given a list of non negative integers, arrange them such that they form the
   * largest number.
   * 
   * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
   * 
   * Note: The result may be very large, so you need to return a string instead of
   * an integer.
   * 
   * https://leetcode.com/problems/largest-number/description/
   */
  private class CustomComparator implements Comparator<String> {
    /*
     * a="3"   b="34"   a="3"   b="30"   a="5"  b="9"
     * a+b     b+a      a+b     b+a      a+b    b+a
     * "334" < "343"    "330" > "303"    "59" < "95"
     */
    @Override
    public int compare(String a, String b) {
      String str1 = a + b;
      String str2 = b + a;
      return str2.compareTo(str1);
    }
  }
  
  public String largestNumber(int[] nums) {
    if(nums == null || nums.length == 0) 
      return "";
    
    String[] strNums = new String[nums.length];
    for(int i = 0; i < nums.length; i++)
      strNums[i] = String.valueOf(nums[i]);
    
    // The custom sort will make ["3", "30", "34", "5", "9"] 
    // become ["9", "5", "34", "3", "30"]
    Arrays.sort(strNums, new CustomComparator());
 
    // If after the sort the first string is "0", then there is no other number it
    // can be
    if(strNums[0].equals("0"))
      return "0";
    
    String result = "";
    for(String num : strNums)
      result += num;    
    return result;
  }
}
