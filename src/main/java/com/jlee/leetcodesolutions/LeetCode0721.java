package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode0721 {
  /*
   * Given a list accounts, each element accounts[i] is a list of strings, where
   * the first element accounts[i][0] is a name, and the rest of the elements are
   * emails representing emails of the account.
   * 
   * Now, we would like to merge these accounts. Two accounts definitely belong to
   * the same person if there is some email that is common to both accounts. Note
   * that even if two accounts have the same name, they may belong to different
   * people as people could have the same name. A person can have any number of
   * accounts initially, but all of their accounts definitely have the same name.
   * 
   * After merging the accounts, return the accounts in the following format: the
   * first element of each account is the name, and the rest of the elements are
   * emails in sorted order. The accounts themselves can be returned in any order.
   * 
   * https://leetcode.com/problems/accounts-merge/description/
   */
  public List<List<String>> accountsMerge(List<List<String>> accounts) {
    // Map email to accounts id
    HashMap<String,List<Integer>> emailToAccounts = new HashMap<>();
    // Map email to name
    HashMap<String,String> emailToName = new HashMap<>();
    for(int i = 0; i < accounts.size(); i++) {
      List<String> account = accounts.get(i);
      String name = account.get(0);
      for(int j = 1; j < account.size(); j++) {
        String email = account.get(j);
        if(!emailToAccounts.containsKey(email))
          emailToAccounts.put(email, new ArrayList<>());
        emailToAccounts.get(email).add(i);
        
        if(!emailToName.containsKey(email))
          emailToName.put(email, name);
      }
    }
    
    // Simulate a dfs to build new merge list
    List<List<String>> result = new ArrayList<>();
    HashSet<String> visited = new HashSet<>();
    for(String email : emailToAccounts.keySet()) {
      List<String> entry = new ArrayList<>();
      dfs(accounts, emailToAccounts, visited, entry, email);
      // The entry will be empty if the email was visited earlier during the dfs
      if(entry.isEmpty()) continue;
      // Sort the entry
      Collections.sort(entry);
      // Add name to list
      entry.add(0, emailToName.get(email));
      // Add list into result
      result.add(entry);
    }
    return result;
  }
  
  private void dfs(List<List<String>> accounts, HashMap<String,List<Integer>> emailToAccounts, HashSet<String> visited, List<String> entry, String email) {
    if(visited.contains(email))
      return;
    visited.add(email);
    entry.add(email);
    
    List<Integer> ids = emailToAccounts.get(email);
    for(int id : ids) {
      List<String> account = accounts.get(id);
      for(int i = 1; i < account.size(); i++) {
        dfs(accounts, emailToAccounts, visited, entry, account.get(i));
      }
    }
  }
}
