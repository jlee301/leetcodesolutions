package com.jlee.leetcodesolutions;

public class Trie {
  private class TrieNode {
    // This boolean is to be used if the word ending here is a final word.
    boolean isWord;

    // Since input is guaranteed to be letters a-z, we will only need 26.
    TrieNode[] childs = new TrieNode[26];

    TrieNode() {
    }
  }
  private TrieNode root;
  
  /** Initialize your data structure here. */
  public Trie() {
    root = new TrieNode();
  }
  
  /** Inserts a word into the trie. */
  public void insert(String word) {
    if(word == null || word.length() == 0)
      return;
    TrieNode temp = root;
    for(int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      if(temp.childs[ch-'a'] == null)
        temp.childs[ch-'a'] = new TrieNode();
      temp = temp.childs[ch-'a'];
    }
    temp.isWord = true;
  }
  
  /** Returns if the word is in the trie. */
  public boolean search(String word) {
    if(word == null || word.length() == 0)
      return false;
    TrieNode temp = root;
    for(int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      if(temp.childs[ch-'a'] == null)
        return false;
      temp = temp.childs[ch-'a'];
    }
    return temp.isWord;
  }
  
  /** Returns if there is any word in the trie that starts with the given prefix. */
  public boolean startsWith(String prefix) {
    if(prefix == null || prefix.length() == 0)
      return false;
    TrieNode temp = root;
    for(int i = 0; i < prefix.length(); i++) {
      char ch = prefix.charAt(i);
      if(temp.childs[ch-'a'] == null)
        return false;
      temp = temp.childs[ch-'a'];
    }
    return true;
  }
}
