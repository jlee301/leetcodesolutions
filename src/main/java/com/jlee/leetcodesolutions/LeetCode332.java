package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class LeetCode332 {
  /*
   * Given a list of airline tickets represented by pairs of departure and arrival
   * airports [from, to], reconstruct the itinerary in order. All of the tickets
   * belong to a man who departs from JFK. Thus, the itinerary must begin with
   * JFK.
   * 
   * Note:
   * 1. If there are multiple valid itineraries, you should return the itinerary
   * that has the smallest lexical order when read as a single string. For
   * example, the itinerary ["JFK", "LGA"] has a smaller lexical order than
   * ["JFK", "LGB"].
   * 2. All airports are represented by three capital letters (IATA code).
   * 3. You may assume all tickets form at least one valid itinerary.
   * 
   * Example 1:
   * tickets = [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
   * Return ["JFK", "MUC", "LHR", "SFO", "SJC"].
   * 
   * Example 2:
   * tickets =
   * [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
   * Return ["JFK","ATL","JFK","SFO","ATL","SFO"].
   *
   * Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"]. But
   * it is larger in lexical order.
   * 
   * https://leetcode.com/problems/reconstruct-itinerary/description/
   */
  public List<String> findItinerary(String[][] tickets) {
    if(tickets == null || tickets.length == 0)
      return Arrays.asList("JFK");
      
    HashMap<String, PriorityQueue<String>> map = new HashMap<>();
    // Create an map of <from, multiple to destinations>
    // Using PriorityQueue will automatically sort destinations by lexical order
    for(String[] ticket : tickets) {
      if(!map.containsKey(ticket[0]))
        map.put(ticket[0], new PriorityQueue<>());
      map.get(ticket[0]).add(ticket[1]);
    }
    
    List<String> list = new ArrayList<>();
    Stack<String> stack = new Stack<>();
    // Always starts with JFK
    stack.push("JFK");
    while(!stack.isEmpty()) {
      while(map.containsKey(stack.peek()) && !map.get(stack.peek()).isEmpty()) {
        // Keep traversing until we are at destination with no where else to go.
        stack.push(map.get(stack.peek()).poll());
      }
      // Store where we got stuck on top of the list.
      list.add(0, stack.pop());
    }
    return list;
  }
}
