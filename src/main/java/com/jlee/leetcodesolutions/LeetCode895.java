package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.Stack;

public class LeetCode895 {
  /*
   * Implement FreqStack, a class which simulates the operation of a stack-like
   * data structure.
   * 
   * FreqStack has two functions:
   * push(int x), which pushes an integer x onto the stack.
   * 
   * pop(), which removes and returns the most frequent element in the stack. If
   * there is a tie for most frequent element, the element closest to the top of
   * the stack is removed and returned.
   * 
   * https://leetcode.com/problems/maximum-frequency-stack/description/
   */
  // Maps the integer to its frequency
  private HashMap<Integer,Integer> integerFreq;
  // Maps the frequency to integer(s) at this frequency
  private HashMap<Integer,Stack<Integer>> freqInteger;
  private int max;
  
  public LeetCode895() {
    max = 0;
    integerFreq = new HashMap<>();
    freqInteger = new HashMap<>();
  }
  
  public void push(int x) {
    // Update frequency of this integer
    int frequency = integerFreq.getOrDefault(x, 0) + 1;
    integerFreq.put(x, frequency);
   
    freqInteger.computeIfAbsent(frequency, k -> new Stack<>());
    freqInteger.get(frequency).push(x);
    
    // Maintain what is the highest frequency
    max = Math.max(max, frequency);
  }
  
  public int pop() {
    // Obtain the number on top of the stack of the highest frequency
    int removeNum = freqInteger.get(max).pop();
    
    // Decrement the number's frequency
    integerFreq.put(removeNum, integerFreq.get(removeNum)-1);
    
    // If stack is empty, decrement the max frequency
    if(freqInteger.get(max).isEmpty())
      max--;
    
    return removeNum;
  }
}
