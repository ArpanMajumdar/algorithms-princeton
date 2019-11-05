package com.arpan.algorithms.part1.week2.stack.impl;

import com.arpan.algorithms.part1.week2.stack.Stack;
import com.arpan.algorithms.part1.week2.stack.exception.StackUnderflowException;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedStackTest {

  @Test
  public void isEmpty() {
    // Setup
    Stack<Integer> stack = new LinkedStack<>();

    //
    assertTrue(stack.isEmpty());
    stack.push(1);
    assertFalse(stack.isEmpty());
  }

  @Test
  public void testPushAndPop() {
    // Setup
    Stack<Integer> stack = new LinkedStack<>();

    // When
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    //
    assertEquals(Integer.valueOf(5), stack.pop());
    assertEquals(Integer.valueOf(4), stack.pop());
    assertEquals(Integer.valueOf(3), stack.pop());
    assertEquals(Integer.valueOf(2), stack.pop());
    assertEquals(Integer.valueOf(1), stack.pop());
  }

  @Test(expected = StackUnderflowException.class)
  public void testPopOnEmptyStackThrowsException() {
    // Setup
    Stack<Integer> stack = new LinkedStack<>();

    //
    stack.pop();
  }

  @Test
  public void testIterateOverStackItems() {
    // Setup
    Stack<Integer> stack = new ArrayStack<>();

    // When
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    // Then
    stack.forEach(System.out::println);
  }
}
