package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode0857 {
  /*
   * There are N workers. The i-th worker has a quality[i] and a minimum wage
   * expectation wage[i].
   * 
   * Now we want to hire exactly K workers to form a paid group. When hiring a
   * group of K workers, we must pay them according to the following rules:
   * 1. Every worker in the paid group should be paid in the ratio of their
   * quality compared to other workers in the paid group.
   * 2. Every worker in the paid group must be paid at least their minimum wage
   * expectation.
   * 3. Return the least amount of money needed to form a paid group satisfying
   * the above conditions.
   * 
   * https://leetcode.com/problems/minimum-cost-to-hire-k-workers/description/
   */
  public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
    double result = Double.MAX_VALUE;
    int N = quality.length;
    
    // Sort by the worker's wage ratio
    Worker[] workers = new Worker[N];
    for(int i = 0; i < N; i++)
      workers[i] = new Worker(wage[i], quality[i]);
    Arrays.sort(workers, new WorkerComparator());

    // We use a PriorityQueue in order to keep quality inserted in automatic
    // ascending order
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int qsum = 0;    
    for(Worker worker : workers) {
      qsum += worker.quality;
      pq.add(-worker.quality);
      // By inserting the negative value, it guarantees the largest quality will be on
      // top of the queue to be removed first when we exceed K entries
      if(pq.size() > K)
        qsum += pq.poll();
      
      if(pq.size() == K)
        result = Math.min(result, qsum * worker.ratio);
    }
    return result;
  }
  
  private class Worker {
    public double ratio;
    public int quality;
    
    Worker(int wage, int quality) {
      ratio = (double) wage / (double) quality;
      this.quality = quality;
    }
  }
  
  private class WorkerComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker a, Worker b) {
      return Double.compare(a.ratio, b.ratio);
    }
  }
}
