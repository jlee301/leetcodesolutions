package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode0946 {
  /*
   * Given two sequences pushed and popped with distinct values, return true if
   * and only if this could have been the result of a sequence of push and pop
   * operations on an initially empty stack.
   * 
   * https://leetcode.com/contest/weekly-contest-112/problems/validate-stack-sequences/
   */
  public boolean validateStackSequences(int[] pushed, int[] popped) {
    Stack<Integer> stack = new Stack<>();
    int i = 0;
    for(int num : popped) {
      if(stack.isEmpty()) {
        while(pushed[i] != num)
          stack.push(pushed[i++]);
        i++;
      }
      else if(stack.peek() == num)
        stack.pop();
      else if(stack.contains(num))
        return false;
      else {
        while(pushed[i] != num)
          stack.push(pushed[i++]);
        i++;
      }
    }
    return true;
  }
}
