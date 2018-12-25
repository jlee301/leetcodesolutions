package com.jlee.leetcodesolutions;

public class LeetCode964 {
  public int leastOpsExpressTarget(int x, int target) {
    // x = 3, target = 2
    // 1. add: 3/3 + 3/3
    // 2. sub: 3 - 3/3
    if(x > target)
      return Math.min(target * 2 - 1, (x-target) * 2);
    
    int count = 0;
    long sum = x;
    while(sum < target) {
      sum *= x;
      count++;
    }
    
    if(sum == target)
      return count;
    
    // x = 3, target = 5. 
    // 1. add: 5 = 3 + 2
    // 2. sub: 5 = 9 - 4
    int add = leastOpsExpressTarget(x, target - (int) (sum/x)) - 1;
    int sub = sum-target < target ? leastOpsExpressTarget(x, (int) sum-target) : Integer.MAX_VALUE;
    
    return Math.min(add, sub) + count + 1;
  }
}
