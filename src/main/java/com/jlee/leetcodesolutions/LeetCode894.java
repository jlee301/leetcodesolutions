package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class LeetCode894 {
  /*
   * A full binary tree is a binary tree where each node has exactly 0 or 2
   * children.
   * 
   * Return a list of all possible full binary trees with N nodes. Each element of
   * the answer is the root node of one possible tree.
   * 
   * Each node of each tree in the answer must have node.val = 0.
   * 
   * You may return the final list of trees in any order.
   * 
   * https://leetcode.com/problems/all-possible-full-binary-trees/description/
   */
  public List<TreeNode> allPossibleFBT(int N) {
    return allPossibleFBT(N, new HashMap<>());
  }
  
  private List<TreeNode> allPossibleFBT(int N, HashMap<Integer,List<TreeNode>> memo) {
    if(memo.containsKey(N))
      return memo.get(N);
    
    List<TreeNode> ans = new ArrayList<>();
    if(N == 1)
      ans.add(new TreeNode(0));
    else if(N % 2 != 0) {
      // 1. All even numbered node trees is not possible, so only check odd
      // 2. Check all possible left and right combinations of nodes
      for(int l = 0; l < N; l++) {
        int r = N - l - 1; // minus 1 to compensate for its root
        for(TreeNode left : allPossibleFBT(l, memo)) {
          for(TreeNode right : allPossibleFBT(r, memo)) {
            TreeNode node = new TreeNode(0);
            node.left = left;
            node.right = right;
            ans.add(node);
          }
        }
      }
    }
    memo.put(N, ans);
    return ans;
  }
}
