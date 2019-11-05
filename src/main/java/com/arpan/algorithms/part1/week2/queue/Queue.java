package com.arpan.algorithms.part1.week2.queue;

public interface Queue<T> extends Iterable<T> {

  void enqueue(T item);

  T dequeue();

  boolean isEmpty();
}
