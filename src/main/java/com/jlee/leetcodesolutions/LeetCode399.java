package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode399 {
  /*
   * Equations are given in the format A / B = k, where A and B are variables
   * represented as strings, and k is a real number (floating point number). Given
   * some queries, return the answers. If the answer does not exist, return -1.0.
   * 
   * Example:
   * Given a / b = 2.0, b / c = 3.0.
   * queries are: a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? .
   * return [6.0, 0.5, -1.0, 1.0, -1.0 ].
   * 
   * The input is: vector<pair<string, string>> equations, vector<double>& values,
   * vector<pair<string, string>> queries , where equations.size() ==
   * values.size(), and the values are positive. This represents the equations.
   * Return vector<double>.
   * 
   * According to the example above:
   * equations = [ ["a", "b"], ["b", "c"] ],
   * values = [2.0, 3.0],
   * queries = [ ["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"] ].
   * 
   * The input is always valid. You may assume that evaluating the queries will
   * result in no division by zero and there is no contradiction.
   * 
   * https://leetcode.com/problems/evaluate-division/description/
   */
  public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
    HashMap<String, List<String>> adj = new HashMap<>();
    HashMap<String, List<Double>> adjValues = new HashMap<>();
    // Convert edges to adjacency list
    // Create association to values
    for(int i = 0; i < equations.length; i++) {
      if(!adj.containsKey(equations[i][0])) {
        adj.put(equations[i][0], new ArrayList<>());
        adjValues.put(equations[i][0], new ArrayList<>());
      }
      if(!adj.containsKey(equations[i][1])) {
        adj.put(equations[i][1], new ArrayList<>());
        adjValues.put(equations[i][1], new ArrayList<>());
      }
      adj.get(equations[i][0]).add(equations[i][1]);
      adjValues.get(equations[i][0]).add(values[i]);
      adj.get(equations[i][1]).add(equations[i][0]);
      adjValues.get(equations[i][1]).add(1/values[i]);
    }

    double[] result = new double[queries.length];
    for(int i = 0; i < queries.length; i++) {
      result[i] = calcHelper(queries[i][0], queries[i][1], adj, adjValues, new HashSet<>(), 1.0);
      if(result[i] == 0.0)
        result[i] = -1.0;
    }
    return result;
  }
  
  private double calcHelper(String dividend, String divisor, HashMap<String,List<String>> adj, HashMap<String,List<Double>> adjValues, HashSet<String> set, double value) {
    if(set.contains(dividend))
      return 0.0;
    if(!adj.containsKey(dividend))
      return 0.0;
    if(dividend.equals(divisor))
      return value;
    
    set.add(dividend);
    List<String> listStr = adj.get(dividend);
    List<Double> listVal = adjValues.get(dividend);
    double temp = 0.0;
    for(int i = 0; i < listStr.size(); i++) {
      temp = calcHelper(listStr.get(i), divisor, adj, adjValues, set, value*listVal.get(i));
      if(temp != 0.0) 
        break;
    }
    return temp;
  }
}
