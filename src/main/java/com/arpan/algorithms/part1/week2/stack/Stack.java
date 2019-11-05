package com.arpan.algorithms.part1.week2.stack;

public interface Stack<T> extends Iterable<T> {

  boolean isEmpty();

  void push(T item);

  T pop();
}
