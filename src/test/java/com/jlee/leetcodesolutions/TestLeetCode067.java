package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode067;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode067 {
	@Test
	public void test0Plus0() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("0", "0");
		Assert.assertEquals("0", result);
	}

	@Test
	public void test0Plus1() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("0", "1");
		Assert.assertEquals("1", result);
	}

	@Test
	public void test1Plus0() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("1", "0");
		Assert.assertEquals("1", result);
	}

	@Test
	public void test1Plus1() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("1", "1");
		Assert.assertEquals("10", result);
	}

	@Test
	public void test11Plus1() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("11", "1");
		Assert.assertEquals("100", result);
	}

	@Test
	public void test1Plus11() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("1", "11");
		Assert.assertEquals("100", result);
	}

	@Test
	public void test000Plus001() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("000", "001");
		Assert.assertEquals("001", result);
	}

	@Test
	public void test000Plus0001() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("000", "0001");
		Assert.assertEquals("0001", result);
	}

	@Test
	public void test1111Plus1111() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("1111", "1111");
		Assert.assertEquals("11110", result);
	}
	
	@Test
	public void testNullPlus11() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary(null, "11");
		Assert.assertEquals("11", result);
	}

	@Test
	public void testEmptyPlus11() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("", "11");
		Assert.assertEquals("11", result);
	}
	
	@Test
	public void test11PlusNull() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("11", null);
		Assert.assertEquals("11", result);
	}

	@Test
	public void test11PlusEmpty() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("11", "");
		Assert.assertEquals("11", result);
	}

	@Test
	public void testNullPlusNull() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary(null, null);
		Assert.assertEquals("0", result);
	}

	@Test
	public void testEmptyPlusEmpty() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("", "");
		Assert.assertEquals("0", result);
	}

	@Test
	public void testNullPlusEmpty() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("", "");
		Assert.assertEquals("0", result);
	}

	@Test
	public void testEmptyPlusNull() {
		LeetCode067 solution = new LeetCode067();
		String result = solution.addBinary("", "");
		Assert.assertEquals("0", result);
	}
}
