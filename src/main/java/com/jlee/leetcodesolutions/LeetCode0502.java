package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;

public class LeetCode0502 {
  /*
   * Suppose LeetCode will start its IPO soon. In order to sell a good price of
   * its shares to Venture Capital, LeetCode would like to work on some projects
   * to increase its capital before the IPO. Since it has limited resources, it
   * can only finish at most k distinct projects before the IPO. Help LeetCode
   * design the best way to maximize its total capital after finishing at most k
   * distinct projects.
   * 
   * You are given several projects. For each project i, it has a pure profit Pi
   * and a minimum capital of Ci is needed to start the corresponding project.
   * Initially, you have W capital. When you finish a project, you will obtain its
   * pure profit and the profit will be added to your total capital.
   * 
   * To sum up, pick a list of at most k distinct projects from given projects to
   * maximize your final capital, and output your final maximized capital.
   * 
   * https://leetcode.com/problems/ipo/description/
   */
  public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
    // cap queue prioritizing by capital ascending
    PriorityQueue<int[]> cap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
    for(int i = 0; i < Capital.length; i++)
      cap.add(new int[] {Capital[i], Profits[i]});
    
    // pro queue will prioritize project by profit ascending
    PriorityQueue<int[]> pro = new PriorityQueue<>((a,b) -> b[1] - a[1]);
    while(k > 0) {
      // 1. Scan through the cap queue for projects <= W capital requirement
      // 2. Add project into the pro queue
      while(!cap.isEmpty() && cap.peek()[0] <= W)
        pro.add(cap.poll());
      
      // If the pro queue is empty, then there is no possible way to increase Capital
      // to add more projects
      if(pro.isEmpty())
        break;
      
      // 3. Take top most from pro queue and add into W capital      
      W += pro.poll()[1];
      k--;
    }
    return W;
  }
}
