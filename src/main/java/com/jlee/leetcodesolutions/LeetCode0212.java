package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode0212 {
  /*
   * Given a 2D board and a list of words from the dictionary, find all words in
   * the board.
   * 
   * Each word must be constructed from letters of sequentially adjacent cell,
   * where "adjacent" cells are those horizontally or vertically neighboring. The
   * same letter cell may not be used more than once in a word.
   * 
   * https://leetcode.com/problems/word-search-ii/description/
   */
  private static int[][] moves = { {-1,0}, {1,0}, {0,-1}, {0,1} };
  
  public List<String> findWords(char[][] board, String[] words) {
    TrieNode root = buildTrie(words);
    boolean[][] visited = new boolean[board.length][board[0].length];
    HashSet<String> result = new HashSet<>();
    
    // Try each char on the board as the starting point
    for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board[0].length; j++)
        dfs(board, root, visited, result, i, j, "");
    }
    return new ArrayList<>(result);
  }
  
  private void dfs(char[][] board, TrieNode node, boolean[][] visited, HashSet<String> result, int i, int j, String word) {
    if(i < 0 || i == board.length || j < 0 || j == board[0].length || visited[i][j] || node.child[board[i][j] - 'a'] == null)
      return;
    
    node = node.child[board[i][j] - 'a'];
    if(node.isWord)
      result.add(word + board[i][j]);
    
    // visited is being used to make sure a letter is only used ONCE per word and backtracked
    visited[i][j] = true;
    for(int[] move : moves) {
      // check the four adjacent letters: up, down, left, right
      dfs(board, node, visited, result, i+move[0], j+move[1], word + board[i][j]);
    }
    visited[i][j] = false;
  }
  
  private TrieNode buildTrie(String[] words) {
    TrieNode root = new TrieNode();
    
    for(String word : words) {
      // Add each word into the trie
      // reset to root
      TrieNode node = root;
      
      for(int i = 0; i < word.length(); i++) {
        // char by char dive deeper into the trie
        int next = word.charAt(i) - 'a';
        if(node.child[next] == null)
          node.child[next] = new TrieNode();  
        node = node.child[next];
      }
      node.isWord = true;
    }
    return root;
  }
  
  private class TrieNode {
    public boolean isWord;
    public TrieNode[] child;
    
    TrieNode() {
      isWord = false;
      child = new TrieNode[26];
    }
  }
}
