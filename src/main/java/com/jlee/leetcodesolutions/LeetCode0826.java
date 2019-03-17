package com.jlee.leetcodesolutions;

import java.util.TreeMap;

public class LeetCode0826 {
  /*
   * We have jobs: difficulty[i] is the difficulty of the ith job, and profit[i]
   * is the profit of the ith job.
   * 
   * Now we have some workers. worker[i] is the ability of the ith worker, which
   * means that this worker can only complete a job with difficulty at most
   * worker[i].
   * 
   * Every worker can be assigned at most one job, but one job can be completed
   * multiple times.
   * 
   * For example, if 3 people attempt the same job that pays $1, then the total
   * profit will be $3. If a worker cannot complete any job, his profit is $0.
   * 
   * What is the most profit we can make?
   * 
   * Notes:
   * 1. 1 <= difficulty.length = profit.length <= 10000
   * 2. 1 <= worker.length <= 10000
   * 3. difficulty[i], profit[i], worker[i] are in range [1, 10^5]
   * 
   * https://leetcode.com/problems/most-profit-assigning-work/description/
   */
  public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
    // Map difficulty[i] to its highest profit
    TreeMap<Integer,Integer> map = new TreeMap<>();
    for(int i = 0; i < difficulty.length; i++) {
      if(!map.containsKey(difficulty[i]))
        map.put(difficulty[i], profit[i]);
      else {
        if(map.get(difficulty[i]) < profit[i])
          map.put(difficulty[i], profit[i]);
      }
    }
    
    // Weird case if a lower difficulty yields are higher profit
    Integer prev = null;
    for(Integer key : map.keySet()) {
      if(prev != null) {
        Integer temp = map.get(key);
        if(temp < prev)
          map.put(key, prev);
        else
          prev = temp;
      }
      else
        prev = map.get(key);
    }
    
    int sum = 0;
    for(int key : worker) {
      Integer temp = map.floorKey(key);
      if(temp != null)
        sum += map.get(temp);
    }
    return sum;
  }
}
