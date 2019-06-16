package com.jlee.leetcodesolutions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode1090 {
  /*
   * https://leetcode.com/problems/largest-values-from-labels/
   */
  public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
    int[] fcount = new int[20001];
    
    // Create {value, label} pairs and sort in descending order by value
    PriorityQueue<int[]> pq = new PriorityQueue<>(new LabelComparator());
    for(int i = 0; i < values.length; i++)
      pq.add(new int[] {values[i], labels[i]});
    
    
    // Greedy, take the max value available as long as we have not exceeded use_limit of the label
    int max = 0;
    int count = 0;
    while(count < num_wanted && !pq.isEmpty()) {
      int[] curr = pq.poll();
      int val = curr[0];
      int lab = curr[1];
      if(fcount[lab] < use_limit) {
        max += val;
        fcount[lab]++;
        count++;
      }
    }
    return max;
  }
  
  private class LabelComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
      return b[0] - a[0];
    }
  }
}
