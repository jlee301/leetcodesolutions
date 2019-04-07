package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode1024 {
  /*
   * https://leetcode.com/problems/video-stitching/
   */
  public int videoStitching(int[][] clips, int T) {
    Arrays.sort(clips, new videoComparator());
    // [0.2], [1.9], [1,5], [4,6], [5,9], [8.10]
    int count = 0;
    int currMax = 0;
    
    int i = 0;
    while(i < clips.length) {
      if(currMax < clips[i][0]) {
        // There's a gap in the video, this will be invalid
        break;
      }
      
      int max = currMax;
      // Scan clips that do not exceed the current max as the starting point and take the value that gets you further
      while(i < clips.length && currMax >= clips[i][0]) {
        max = Math.max(max, clips[i][1]);
        i++;
      }      
      currMax = max;
      count++;
      
      if(currMax >= T)
        return count;
    }
    return -1;
  }
  
  private class videoComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] A, int[] B) {
      return A[0] == B[0] ? B[1] - A[1] : A[0] - B[0];
    }
  }
}
