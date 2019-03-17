package com.jlee.leetcodesolutions;

import java.util.List;

public class LeetCode0648 {
  /*
   * In English, we have a concept called root, which can be followed by some
   * other words to form another longer word - let's call this word successor. For
   * example, the root an, followed by other, which can form another word another.
   * 
   * Now, given a dictionary consisting of many roots and a sentence. You need to
   * replace all the successor in the sentence with the root forming it. If a
   * successor has many roots can form it, replace it with the root with the
   * shortest length.
   * 
   * You need to output the sentence after the replacement.
   * 
   * Example 1:
   * Input: dict = ["cat", "bat", "rat"]
   * sentence = "the cattle was rattled by the battery"
   * Output: "the cat was rat by the bat"
   * 
   * https://leetcode.com/problems/replace-words/description/
   */
  public String replaceWords(List<String> dict, String sentence) {
    String[] strs = sentence.split(" ");
    for(int i = 0; i < strs.length; i++) {
      for(int j = 0; j < dict.size(); j++) {
        String prefix = dict.get(j);
        if(strs[i].startsWith(prefix))
          strs[i] = prefix;
      }
    }
    StringBuilder sb = new StringBuilder();
    for(String str : strs)
      sb.append(str + " ");
    return sb.toString().trim();
  }
}
