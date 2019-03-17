package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode0904 {
  /*
   * In a row of trees, the i-th tree produces fruit with type tree[i].
   * 
   * You start at any tree of your choice, then repeatedly perform the following
   * steps:
   * 1. Add one piece of fruit from this tree to your baskets. If you cannot,
   * stop.
   * 2. Move to the next tree to the right of the current tree. If there is no
   * tree to the right, stop.
   * 
   * Note that you do not have any choice after the initial choice of starting
   * tree: you must perform step 1, then step 2, then back to step 1, then step 2,
   * and so on until you stop.
   * 
   * You have two baskets, and each basket can carry any quantity of fruit, but
   * you want each basket to only carry one type of fruit each.
   * 
   * What is the maximum amount of fruit you can collect with this procedure?
   * 
   * https://leetcode.com/contest/weekly-contest-102/problems/fruit-into-baskets/
   */
  public int totalFruit(int[] tree) {
    HashSet<Integer> fruits = new HashSet<>();
    int start = 0;
    int max = 0;
    for(int i = 0; i < tree.length; i++) {
      fruits.add(tree[i]);
      if(fruits.size() > 2) {
        max = Math.max(max, i - start);
        
        // now set start to first instance of tree[i-1] before encountering a different
        // fruit other than tree[i-1] and tree[i]
        start = i-1;
        while(tree[start] == tree[i-1]) {
          start--;
        }
        fruits.remove(tree[start]);
        start++;
      }
    }
    max = Math.max(max, tree.length - start);
    return max;
  }
}
