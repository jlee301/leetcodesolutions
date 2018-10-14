package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode922 {
  /*
   * Given an array A of non-negative integers, half of the integers in A are odd,
   * and half of the integers are even.
   * 
   * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is
   * even, i is even.
   * 
   * You may return any answer array that satisfies this condition.
   * 
   * https://leetcode.com/contest/weekly-contest-106/problems/sort-array-by-parity-ii/
   */
  public int[] sortArrayByParityII(int[] A) {
    Queue<Integer> evens = new LinkedList<>();
    Queue<Integer> odds = new LinkedList<>();
    for(int num : A) {
      if(num % 2 == 0)
        evens.add(num);
      else
        odds.add(num);
    }
    
    int[] result = new int[A.length];
    boolean isEven = true;
    for(int i = 0; i < result.length; i++) {
      if(isEven)
        result[i] = evens.poll();
      else
        result[i] = odds.poll();
      
      isEven = !isEven;
    }
    return result;
  }
}
