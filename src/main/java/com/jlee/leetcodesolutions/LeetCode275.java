package com.jlee.leetcodesolutions;

public class LeetCode275 {
  /*
   * Follow up for H-Index: What if the citations array is sorted in ascending
   * order? Could you optimize your algorithm?
   * 
   * https://leetcode.com/problems/h-index-ii/description/
   */
  public int hIndex(int[] citations) {
    if (citations == null)
      return 0;

    int len = citations.length;
    int start = 0, end = len - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (citations[mid] == len - mid)
        return len - mid;
      else if (citations[mid] < len - mid)
        start = mid + 1;
      else
        end = mid - 1;
    }
    return len-start;
  }
}
