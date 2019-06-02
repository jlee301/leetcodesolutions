package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode1073 {
  /*
   * https://leetcode.com/problems/adding-two-negabinary-numbers/
   */
  public int[] addNegabinary(int[] arr1, int[] arr2) {
    Stack<Integer> stack = new Stack<>();
    int c = 0;
    int i = arr1.length-1, j = arr2.length-1;
    while(i >= 0 || j >= 0) {
      int sum = (i >= 0 ? arr1[i] : 0) + (j >= 0 ? arr2[j] : 0) + c;
      c = helper(sum, stack);
      i--;
      j--;
    }
    
    // Handle the remaining carry (if any)
    while(c != 0)
      c = helper(c, stack);
    
    // Get rid of any leading zeros (unless the result is just 0)
    while(stack.size() > 1 && stack.peek() == 0)
      stack.pop();
    
    int[] result = new int[stack.size()];
    int k = 0;
    while(!stack.isEmpty())
      result[k++] = stack.pop();
    
    return result;
  }
  
  private int helper(int sum, Stack<Integer> stack) {
    // Adds the proper bit to the stack, returns the negabinary carry of the sum
    // sum = -2,  bit = 0, carry =  1
    // sum = -1,  bit = 1, carry =  1
    // sum =  0,  bit = 0, carry =  0
    // sum =  1,  bit = 1, carry =  0
    // sum =  2,  bit = 0, carry = -1
    // sum =  3,  bit = 1, carry = -1
    if(sum == -1) {
      stack.add(1);
      return 1;
    }
    else if(sum == 0) {
      stack.add(0);
      return 0;
    }
    else if(sum == 1) {
      stack.add(1);
      return 0;
    }
    else if(sum == 2) {
      stack.add(0);
      return -1;
    }
    else {
      stack.add(1);
      return -1;
    }
  }
}
