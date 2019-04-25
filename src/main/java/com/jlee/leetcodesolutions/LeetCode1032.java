package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1032 {
  /*
   * https://leetcode.com/problems/stream-of-characters/
   */  
  private TrieNode root;
  private Queue<TrieNode> queue;
  
  public LeetCode1032(String[] words) {
    root = new TrieNode();
    
    // Build trie for each word
    for(String word : words) {
      TrieNode temp = root;
      for(int i = 0; i < word.length(); i++) {
        int idx = word.charAt(i) - 'a';
        if(temp.next[idx] == null)
          temp.next[idx] = new TrieNode();
        
        temp = temp.next[idx];
      }
      temp.isWord = true;
    }
    
    queue = new LinkedList<>();
    queue.add(root);
  }
  
  public boolean query(char letter) {
    int idx = letter - 'a';
    boolean found = false;
    int N = queue.size();
    
    // Check all existing searches to see if any of them can still contain a word
    // If it does, re-add back into queue
    for(int i = 0; i < N; i++) {
      TrieNode curr = queue.poll();
      if(curr.next[idx] != null) {
        curr = curr.next[idx];
        found |= curr.isWord;
        queue.add(curr);
      }
    }
    
    // Adding root to always guarantee a fresh look on next query
    queue.add(root);    
    return found;
  }
  
  private class TrieNode {
    public TrieNode[] next = new TrieNode[26];
    public boolean isWord = false;
    public TrieNode() {};
  }
}
