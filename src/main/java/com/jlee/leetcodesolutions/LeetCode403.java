package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode403 {
  /*
   * A frog is crossing a river. The river is divided into x units and at each
   * unit there may or may not exist a stone. The frog can jump on a stone, but it
   * must not jump into the water.
   * 
   * Given a list of stones' positions (in units) in sorted ascending order,
   * determine if the frog is able to cross the river by landing on the last
   * stone. Initially, the frog is on the first stone and assume the first jump
   * must be 1 unit.
   * 
   * If the frog's last jump was k units, then its next jump must be either k - 1,
   * k, or k + 1 units. Note that the frog can only jump in the forward direction.
   * 
   * https://leetcode.com/problems/frog-jump/description/
   */
  private HashSet<Integer> set;
  
  public boolean canCross(int[] stones) {
    // Store all stones into a set for faster searching
    set = new HashSet<>();
    for(int num : stones)
      set.add(num);
    
    return canCross(1, 1, stones[stones.length-1], new HashMap<>());
  }
  
  private boolean canCross(int pos, int k, int target, HashMap<String,Boolean> memo) {
    // System.out.println(pos + " " + k + " " + target);
    if(!set.contains(pos))
      return false;
    // Only move forward
    if(k <= 0)
      return false;
    if(pos == target)
      return true;
    
    // Using memo because of possibility of same computation
    String key = pos + "-" + k;
    if(memo.containsKey(key))
      return memo.get(key);
    
    boolean result = canCross(pos+(k-1), k-1, target, memo) || canCross(pos+k, k, target, memo) || canCross(pos+k+1, k+1, target, memo);
    memo.put(key, result);
    return result;
  }
}
