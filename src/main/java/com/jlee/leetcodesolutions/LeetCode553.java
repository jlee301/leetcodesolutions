package com.jlee.leetcodesolutions;

public class LeetCode553 {
  /*
   * Given a list of positive integers, the adjacent integers will perform the
   * float division. For example, [2,3,4] -> 2 / 3 / 4.
   * 
   * However, you can add any number of parenthesis at any position to change the
   * priority of operations. You should find out how to add parenthesis to get the
   * maximum result, and return the corresponding expression in string format.
   * Your expression should NOT contain redundant parenthesis.
   * 
   * Note:
   * 1. The length of the input array is [1, 10].
   * 2. Elements in the given array will be in range [2, 1000].
   * 3. There is only one optimal division for each test case.
   * 
   * https://leetcode.com/problems/optimal-division/description/
   */
  public String optimalDivision(int[] nums) {
    // p/q --> The maximum answer is to always get the smallest q
    //
    // nums = [a,b,c,d], so b/c/d is q.  You have two choices:
    // 1. q = (b/c)/d --> b/c/d
    // 2. q = b/(c/d) --> This approach would give max possible answer for q, which 
    // is exactly what we do not want. 
    //
    // Therefore the answer will always be: a/(b/c/d)
    if(nums == null || nums.length == 0)
      return "";
    if(nums.length == 1)
      return nums[0] + "";
    if(nums.length == 2)
      return nums[0] + "/" + nums[1];
    
    StringBuilder sb = new StringBuilder();
    sb.append(nums[0] + "/(");
    for(int i = 1; i < nums.length; i++)
      sb.append(nums[i] + "/");
    sb.replace(sb.length()-1,sb.length(), ")");
    return sb.toString();
  }
}
