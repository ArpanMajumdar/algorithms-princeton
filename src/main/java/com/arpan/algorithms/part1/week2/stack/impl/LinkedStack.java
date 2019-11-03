package com.arpan.algorithms.part1.week2.stack.impl;

import com.arpan.algorithms.part1.week2.stack.Stack;
import com.arpan.algorithms.part1.week2.stack.exception.StackUnderflowException;

public class LinkedStack<T> implements Stack<T> {

  private Node top;

  private class Node {
    T item;
    Node next;
  }

  @Override
  public boolean isEmpty() {
    return top == null;
  }

  @Override
  public void push(T item) {
    Node newTop = new Node();
    newTop.item = item;
    newTop.next = top;
    top = newTop;
  }

  @Override
  public T pop() {
    if (isEmpty()) throw new StackUnderflowException("Stack is empty.");
    T item = top.item;
    top = top.next;
    return item;
  }
}
