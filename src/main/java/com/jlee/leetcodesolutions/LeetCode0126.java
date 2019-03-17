package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode0126 {
  /*
   * Given two words (beginWord and endWord), and a dictionary's word list, find
   * all shortest transformation sequence(s) from beginWord to endWord, such that:
   * 1. Only one letter can be changed at a time
   * 2. Each transformed word must exist in the word list. Note that beginWord is
   * not a transformed word.
   * 
   * https://leetcode.com/problems/word-ladder-ii/
   */
  public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {    
    HashMap<String,Integer> wordPlacement = new HashMap<>();
    // Using HashSet is a lot faster for searching
    HashMap<String,HashSet<String>> wordNeighbors = new HashMap<>();
    HashSet<String> wordSet = new HashSet<>(wordList);
    wordSet.add(beginWord);
    // Build the neighbors for each word
    for(String word : wordSet)
      wordNeighbors.put(word, getNeighbors(word, wordSet));    

    // use BFS to find the min length
    bfs(beginWord, endWord, wordPlacement, wordNeighbors);
    // use DFS to reconstruct word list
    List<List<String>> result = new ArrayList<>();
    List<String> currResult = new ArrayList<>();
    dfs(beginWord, endWord, wordPlacement, wordNeighbors, result, currResult);
    return result;
  }
  
  private void dfs(String word, String endWord, HashMap<String,Integer> wordPlacement, HashMap<String,HashSet<String>> wordNeighbors, List<List<String>> result, List<String> currResult) {
    // Backtracking the currResult list
    currResult.add(word);
    
    if(endWord.equals(word)) {
      result.add(new ArrayList<>(currResult));
    }
    else {
      // Check all possible neighbors of the current word for the appropriate placement
      for(String nextWord : wordNeighbors.get(word)) {
        if(wordPlacement.get(nextWord) == wordPlacement.get(word) + 1)
          dfs(nextWord, endWord, wordPlacement, wordNeighbors, result, currResult);
      }
    }
    currResult.remove(currResult.size() - 1);
  }
  
  private void bfs(String beginWord, String endWord, HashMap<String,Integer> wordPlacement, HashMap<String,HashSet<String>> wordNeighbors) {
    wordPlacement.put(beginWord, 0);
    Queue<String> queue = new LinkedList<>();
    queue.add(beginWord);
    boolean found = false;

    while(!queue.isEmpty()) {
      int N = queue.size();      
      for(int i = 0; i < N; i++) {
        String currWord = queue.poll();
        int currDist = wordPlacement.get(currWord);
        
        // get all possible neighbors of currWord
        for(String nextWord : wordNeighbors.get(currWord)) {
          if(!wordPlacement.containsKey(nextWord)) {
            wordPlacement.put(nextWord, currDist + 1);

            if(endWord.equals(nextWord))
              found = true;
            else
              queue.add(nextWord);
          }
        }        
        // no reason to search further, we found the min transformations required
        if(found)
          break;
      }
    }
  }
  
  private HashSet<String> getNeighbors(String word, HashSet<String> wordSet) {
    HashSet<String> result = new HashSet<>();
    char[] data = word.toCharArray();
    for(int i = 0; i < data.length; i++) {
      // replace each char with every possible a thru z
      char prev = data[i];
      for(char ch = 'a'; ch <= 'z'; ch++) {
        data[i] = ch;
        String nei = String.valueOf(data);

        // if this new word is in the list, add as possible neighbor
        if(wordSet.contains(nei))
          result.add(nei);
      }
      // swap back to original word
      data[i] = prev;
    }
    return result;
  }
}
