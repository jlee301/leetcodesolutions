package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode321 {
  /*
   * Given two arrays of length m and n with digits 0-9 representing two numbers.
   * Create the maximum number of length k <= m + n from digits of the two. The
   * relative order of the digits from the same array must be preserved. Return an
   * array of the k digits.
   * 
   * Note: You should try to optimize your time and space complexity.
   */
  public int[] maxNumber(int[] nums1, int[] nums2, int k) {
    int[] result = new int[k];
    int N = nums1.length;
    int M = nums2.length;
    for(int i = Math.max(0, k-M); i <= k && i <= N; i++) {
      int[] temp = mergeArrays(maxArray(nums1, i), maxArray(nums2, k-i), k);
      if(greaterArrays(temp, 0, result, 0))
        result = temp;
    }
    return result;
  }

  /*
   * Max number generated from a single array of k length with the relative order
   * of the digits still preserved.
   */
  private int[] maxArray(int[] nums, int k) {
    Stack<Integer> stack = new Stack<>();
    int N = nums.length;
    for(int i = 0; i < N; i++) {
      while(N-i+stack.size() > k && !stack.isEmpty() && stack.peek() < nums[i])
        stack.pop();
      
      if(stack.size() < k)
        stack.add(nums[i]);
    }
    
    int[] result = new int[k];
    for(int i = k-1; i >= 0; i--)
      result[i] = stack.pop();

    return result;
  }
  
  /*
   * Merge two arrays to provide max number of k length with relative order of
   * digits still preserved.
   */
  private int[] mergeArrays(int[] nums1, int[] nums2, int k) {
    int[] result = new int[k];
    for(int i = 0, j = 0, l = 0; l < k; l++)
      result[l] = greaterArrays(nums1, i, nums2, j) ? nums1[i++] : nums2[j++];
      
    return result;
  }
  
  /*
   * Return true is nums1 @ index i is greater than nums2 @ index j 
   * If the same, we traverse down the array for the answer
   */
  private boolean greaterArrays(int[] nums1, int i, int[] nums2, int j) {
    while(i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
      i++;
      j++;
    }
    
    // Reached the end of nums2, we will use nums1
    if(j == nums2.length)
      return true;
    
    return i < nums1.length && nums1[i] > nums2[j];
  }
}
