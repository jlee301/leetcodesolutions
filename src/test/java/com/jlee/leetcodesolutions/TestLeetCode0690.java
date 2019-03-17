package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Employee;
import com.jlee.leetcodesolutions.LeetCode0690;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0690 {
  @Test
  public void testOneWithTwoDirectSubordinates() {
    List<Employee> employees = new ArrayList<Employee>();
    Employee e1 = new Employee();
    e1.id = 1;
    e1.importance = 5;
    List<Integer> sub1 = new ArrayList<Integer>();
    sub1.add(2);
    sub1.add(3);
    e1.subordinates = sub1;
    Employee e2 = new Employee();
    e2.id = 2;
    e2.importance = 3;
    e2.subordinates = new ArrayList<Integer>();
    Employee e3 = new Employee();
    e3.id = 3;
    e3.importance = 3;
    e3.subordinates = new ArrayList<Integer>();
    employees.add(e1);
    employees.add(e2);
    employees.add(e3);

    LeetCode0690 solution = new LeetCode0690();
    Assert.assertEquals(11, solution.getImportance(employees, 1));
    Assert.assertEquals(3, solution.getImportance(employees, 2));
    Assert.assertEquals(3, solution.getImportance(employees, 3));
  }

  @Test
  public void testOneWithOneDirectOneIndirectSubordinates() {
    List<Employee> employees = new ArrayList<Employee>();
    Employee e1 = new Employee();
    e1.id = 1;
    e1.importance = 5;
    List<Integer> sub1 = new ArrayList<Integer>();
    sub1.add(2);
    e1.subordinates = sub1;
    Employee e2 = new Employee();
    e2.id = 2;
    e2.importance = 3;
    List<Integer> sub2 = new ArrayList<Integer>();
    sub2.add(3);
    e2.subordinates = sub2;
    Employee e3 = new Employee();
    e3.id = 3;
    e3.importance = 3;
    e3.subordinates = new ArrayList<Integer>();
    employees.add(e1);
    employees.add(e2);
    employees.add(e3);

    LeetCode0690 solution = new LeetCode0690();
    Assert.assertEquals(11, solution.getImportance(employees, 1));
    Assert.assertEquals(6, solution.getImportance(employees, 2));
    Assert.assertEquals(3, solution.getImportance(employees, 3));
  }
  
  @Test
  public void testEmployeeDoesNotExist() {
    List<Employee> employees = new ArrayList<Employee>();
    Employee e1 = new Employee();
    e1.id = 1;
    e1.importance = 5;
    e1.subordinates = new ArrayList<Integer>();
    employees.add(e1);
    
    LeetCode0690 solution = new LeetCode0690();
    Assert.assertEquals(5, solution.getImportance(employees, 1));
    Assert.assertEquals(0, solution.getImportance(employees, 2));
    Assert.assertEquals(0, solution.getImportance(employees, 3));
  }

  @Test
  public void testEmpty() {
    List<Employee> employees = new ArrayList<Employee>();
    LeetCode0690 solution = new LeetCode0690();
    Assert.assertEquals(0, solution.getImportance(employees, 1));
  }

  @Test
  public void testNull() {
    List<Employee> employees = null;
    LeetCode0690 solution = new LeetCode0690();
    Assert.assertEquals(0, solution.getImportance(employees, 1));
  }
}
