package com.arpan.algorithms.part1.week2.stack.impl;

import com.arpan.algorithms.part1.week2.stack.Stack;
import com.arpan.algorithms.part1.week2.stack.exception.StackUnderflowException;

import java.util.Iterator;

public class LinkedStack<T> implements Stack<T> {

  private Node first;

  private class Node {
    T item;
    Node next;
  }

  @Override
  public boolean isEmpty() {
    return first == null;
  }

  @Override
  public void push(T item) {
    Node newTop = new Node();
    newTop.item = item;
    newTop.next = first;
    first = newTop;
  }

  @Override
  public T pop() {
    if (isEmpty()) throw new StackUnderflowException("Stack is empty.");
    T item = first.item;
    first = first.next;
    return item;
  }

  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {

      Node current = first;

      @Override
      public boolean hasNext() {
        return current !=null;
      }

      @Override
      public T next() {

        T item = current.item;
        current = current.next;
        return item;
      }
    };
  }
}
