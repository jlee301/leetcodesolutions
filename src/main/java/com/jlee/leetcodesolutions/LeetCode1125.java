package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode1125 {
  /*
   * https://leetcode.com/problems/smallest-sufficient-team/
   */
  public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
    // Add all skills into a set
    HashSet<String> req = new HashSet<>();    
    for(String skill : req_skills)
      req.add(skill);
    
    // Create initial users with at least one skill
    HashSet<String> visited = new HashSet<>();
    Queue<TeamStruct> queue = new LinkedList<>();
    for(int i = 0; i < people.size(); i++) {
      int[] team = new int[60];
      List<String> curr = people.get(i);
      if(curr.size() == 0)
        continue;
      
      for(String skill : req) {
        if(curr.contains(skill)) {
          HashSet<String> skillsRemaining = new HashSet<>(req);
          for(String currSkill : curr)
            skillsRemaining.remove(currSkill);
          
          team[i] = 1;
          
          visited.add(Arrays.toString(team));
          queue.add(new TeamStruct(team, skillsRemaining));
          break;
        }
      }
    }
    
    // BFS
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        TeamStruct curr = queue.poll();
        if(curr.skillsRemaining.size() == 0) {
          // Found a team with all skills filled
          HashSet<Integer> team = new HashSet<>();
          for(int j = 0; j < curr.team.length; j++) {
            if(curr.team[j] == 1)
              team.add(j);
          }
          
          int[] result = new int[team.size()];
          int k = 0;
          for(int member : team)
            result[k++] = member;
          
          return result;
        }
        
        // Check all available people currently not on the team if they fill a skill that's remaining
        for(int l = 0; l < people.size(); l++) {
          if(curr.team[l] == 1)
            continue;
          
          List<String> currPerson = people.get(l);
          if(currPerson.size() == 0)
            continue;
          
          for(String skill : curr.skillsRemaining) {
            if(currPerson.contains(skill)) {
              int[] nextTeam = curr.team.clone();
              nextTeam[l] = 1;
              
              String key = Arrays.toString(nextTeam);
              if(!visited.contains(key)) {                
                HashSet<String> nextSkillsRemaining = new HashSet<>(curr.skillsRemaining);
                for(String nextSkill : currPerson)
                  nextSkillsRemaining.remove(nextSkill);
                
                visited.add(key);
                queue.add(new TeamStruct(nextTeam, nextSkillsRemaining));
                break;
              }
              else {
                break;
              }
            }
          }
        }
      }
    }
    return new int[] {};
  }
  
  private class TeamStruct {
    public int[] team;
    public HashSet<String> skillsRemaining;
    
    public TeamStruct(int[] team, HashSet<String> skillsRemaining) {
      this.team = team;
      this.skillsRemaining = skillsRemaining;
    }
  }
}
