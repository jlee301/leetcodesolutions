package com.jlee.leetcodesolutions;

public class LeetCode318 {
  /*
   * Given a string array words, find the maximum value of length(word[i]) *
   * length(word[j]) where the two words do not share common letters. You may
   * assume that each word will contain only lower case letters. If no such two
   * words exist, return 0.
   * 
   * Example 1:
   * Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
   * Return 16
   * The two words can be "abcw", "xtfn".

   * Example 2:
   * Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
   * Return 4
   * The two words can be "ab", "cd".
   * 
   * Example 3:
   * Given ["a", "aa", "aaa", "aaaa"]
   * Return 0
   * No such pair of words.
   * 
   * https://leetcode.com/problems/maximum-product-of-word-lengths/description/
   */
  public int maxProduct(String[] words) {
    if(words == null || words.length < 2)
      return 0;
    int maxProduct = 0;
    for(int i = 0; i < words.length; i++) {
      for(int j = i+1; j < words.length; j++) {
        int product = words[i].length() * words[j].length();
        // Skip if the current two words have <= maxProduct
        if(product <= maxProduct) continue;
        // Now check for any commons characters
        boolean common = false;
        for(int k = 0; k < words[i].length(); k++) {
          if(words[j].indexOf(words[i].charAt(k)) != -1) {
            common = true;
            break;
          }
        }
        if(!common)
          maxProduct = product;
      }
    }
    return maxProduct;
  }
}
