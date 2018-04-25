package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode658 {
  /*
   * Given a sorted array, two integers k and x, find the k closest elements to x
   * in the array. The result should also be sorted in ascending order. If there
   * is a tie, the smaller elements are always preferred.
   * 
   * Example 1:
   * Input: [1,2,3,4,5], k=4, x=3
   * Output: [1,2,3,4]
   * 
   * Example 2:
   * Input: [1,2,3,4,5], k=4, x=-1
   * Output: [1,2,3,4]
   * 
   * Note:
   * 1. The value k is positive and will always be smaller than the length of the
   * sorted array.
   * 2. Length of the given array is positive and will not exceed 104
   * 3. Absolute value of elements in the array and x will not exceed 104
   */
  public List<Integer> findClosestElements(int[] arr, int k, int x) {
    // Find position where x belongs in the array
    int pos = -1, len = arr.length;
    for(int i = 0; i < len; i++) {
      if(x <= arr[i]) {
        pos = i;
        break;
      }
    }
    
    // Set left and right positions from pos value
    int left = 0, right = 0;
    if(pos == -1) {
      left = len-1;
      right = len;
    }
    else {
      left = pos-1;
      right = pos;
    }
    
    List<Integer> list = new ArrayList<>();
    while(k != 0) {
      if(left < 0) {
        // No more numbers on left, just take from right side
        list.add(arr[right]);
        right++;
      }
      else if(right == len) {
        // No more numbers on right, just take from left side
        list.add(arr[left]);
        left--;
      }
      else {
        // Choose side which gives least difference
        if(Math.abs(x - arr[left]) <= Math.abs(x - arr[right])) {
          list.add(arr[left]);
          left--;
        }
        else {
          list.add(arr[right]);
          right++;
        }
      }
      k--;
    }
    list.sort(null);
    return list;
  }
}
