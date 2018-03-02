package com.jlee.leetcodesolutions;

public class WordDictionary {
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
  public WordDictionary() {
    root = new TrieNode();    
  }
  
  /** Adds a word into the data structure. */
  public void addWord(String word) {
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
  
  /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
  public boolean search(String word) {
    if(word == null || word.length() == 0) 
      return false;
    return searchHelper(word, root, 0);
  }
  
  private boolean searchHelper(String word, TrieNode node, int pos) {
    if(pos == word.length())
      return node.isWord;
    
    char ch = word.charAt(pos);
    if(ch == '.') {
      // Need to check a-z childs if the character is the wildcard '.'
      for(int i = 0; i < node.childs.length; i++) {
        if(node.childs[i] != null) {
          if(searchHelper(word, node.childs[i], pos+1))
            return true;
        }
      }
    } else {
      return node.childs[ch-'a'] != null && searchHelper(word, node.childs[ch-'a'], pos+1); 
    }
    return false;
  }
}
