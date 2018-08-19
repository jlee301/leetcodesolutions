package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.Arrays;

public class LeetCode889 {
  /*
   * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/description/
   */
  public TreeNode constructFromPrePost(int[] pre, int[] post) {
    // preorder = root, left, right
    // postorder = left, right, root
    // head node = pre[0] = post[length-1]
    // pre  1, 2,4,5, 3,6,7
    // post    4,5,2, 6,7,3, 1
    int N = pre.length;
    if(N == 0)
      return null;
    
    TreeNode node = new TreeNode(pre[0]);
    if(N == 1)
      return node;
    
    // find where next node pre[1] occurs in post
    // we are going to use the pos index location to create arrays subset for
    // recursion
    int pos = 0;
    while(post[pos] != pre[1]) {
      pos++; 
    }
    pos++;
    
    // left = pre[1 : pos+1], post[0 : pos]
    node.left = constructFromPrePost(Arrays.copyOfRange(pre, 1, pos+1), Arrays.copyOfRange(post, 0, pos));
    // right = pre[pos+1 : N], post[pos : N-1]
    node.right = constructFromPrePost(Arrays.copyOfRange(pre, pos+1, N), Arrays.copyOfRange(post, pos, N-1));
    
    return node;
  }
}
