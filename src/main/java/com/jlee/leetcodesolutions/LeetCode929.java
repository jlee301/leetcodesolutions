package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode929 {
  /*
   * https://leetcode.com/contest/weekly-contest-108/problems/unique-email-addresses/
   */
  public int numUniqueEmails(String[] emails) {
    HashSet<String> set = new HashSet<>();
    
    for(String email : emails) {
      String[] eData = email.split("@");
      // Remove all '.' from local
      eData[0] = eData[0].replaceAll("\\.", "");

      // Is there any '+' signs in local
      int index = eData[0].indexOf('+');
      if(index != -1)
        eData[0] = eData[0].substring(0, index);
      
      set.add(eData[0] + "@" + eData[1]);
    }
    return set.size();
  }
}
