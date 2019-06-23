package com.jlee.leetcodesolutions;

public class LeetCode1093 {
  /*
   * https://leetcode.com/problems/statistics-from-a-large-sample/
   */
  public double[] sampleStats(int[] count) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    long sum = 0;
    long total = 0;
    int mode = 0;
    int freq = Integer.MIN_VALUE;
    
    for(int i = 0; i < count.length; i++) {      
      // If there is a sample
      if(count[i] > 0) {
        min = Math.min(min, i);
        max = Math.max(max, i);

        // Sum up the total samples
        total += count[i];
        sum += i * count[i];
        
        if(count[i] > freq) {
          freq = count[i];
          mode = i;
        }
      }  
    }
    
    // Now must figure out the median
    // 1, 2, 3, 4, 5, 6, 7
    //          -
    // 1, 2, 3, 4, 5, 6, 7, 8
    //          -  -
    boolean odds = total % 2 != 0 ? true : false;
    int target = (int) (total / 2) + (odds ? 1 : 0);
    int left = 0;
    int right = 0;
    int midCount = 0;
    int i = 0;
    while(midCount < target)
      midCount += count[i++];
    
    i--;
    left = i++;
    right = left;
    
    if(!odds) {
      while(midCount < target+1)
        midCount += count[i++];

      i--;
      right = i++;
    }
    
    return new double[] {(double) min, (double) max, (double) sum / (double) total, (left+right) / 2.0, (double) mode};
  }
}
