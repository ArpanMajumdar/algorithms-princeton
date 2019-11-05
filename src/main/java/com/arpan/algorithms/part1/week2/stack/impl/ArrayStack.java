package com.arpan.algorithms.part1.week2.stack.impl;

import com.arpan.algorithms.part1.week2.stack.Stack;
import com.arpan.algorithms.part1.week2.stack.exception.StackUnderflowException;

import java.util.Iterator;

public class ArrayStack<T> implements Stack<T> {

  private final int INITIAL_CAPACITY = 1;
  private int capacity;
  private int topIndex;
  private T[] stack;

  public ArrayStack() {
    this.capacity = INITIAL_CAPACITY;
    this.stack = (T[]) new Object[capacity];
    this.topIndex = -1;
  }

  @Override
  public boolean isEmpty() {
    return topIndex == -1;
  }

  @Override
  public void push(T item) {
    if (isFull()) resize(2 * capacity);
    topIndex++;
    stack[topIndex] = item;
  }

  @Override
  public T pop() {
    // Throw exception if empty
    if (isEmpty()) throw new StackUnderflowException("Stack is empty.");

    T item = stack[topIndex];
    topIndex--;

    // Resize array if number of items is less than 1/4 th of actual capacity
    if (topIndex > 0 && topIndex == capacity / 4) {
      resize(capacity / 2);
    }

    return item;
  }

  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {

      private int currentIndex = 0;

      @Override
      public boolean hasNext() {
        return currentIndex <= topIndex;
      }

      @Override
      public T next() {
        T item = stack[currentIndex];
        currentIndex++;
        return item;
      }
    };
  }

  private boolean isFull() {
    return topIndex == capacity - 1;
  }

  private void resize(int newCapacity) {
    capacity = newCapacity;
    T[] newStack = (T[]) new Object[capacity];

    // Copy elements from old array to new array
    for (int i = 0; i <= topIndex; i++) {
      newStack[i] = stack[i];
    }
    stack = newStack;
  }
}
