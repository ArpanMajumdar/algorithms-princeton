package com.arpan.algorithms.part1.week2.queue.impl;

import com.arpan.algorithms.part1.week2.queue.Queue;
import com.arpan.algorithms.part1.week2.queue.exception.QueueUnderflowException;

import java.util.Iterator;

public class LinkedQueue<T> implements Queue<T> {

  private Node first;
  private Node last;

  public LinkedQueue() {
    this.first = null;
    this.last = null;
  }

  private class Node {
    T item;
    Node next;
  }

  @Override
  public void enqueue(T item) {

    // Create node
    Node node = new Node();
    node.item = item;
    node.next = null;

    // If queue is empty
    if (isEmpty()) {
      first = node;
      last = node;
    } else {
      last.next = node;
      last = last.next;
    }
  }

  @Override
  public T dequeue() {
    if (isEmpty()) throw new QueueUnderflowException("Queue is empty.");

    // Return the first node
    T item = first.item;
    first = first.next;
    if (isEmpty()) last = null;
    return item;
  }

  @Override
  public boolean isEmpty() {
    return first == null;
  }

  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      Node current = first;

      @Override
      public boolean hasNext() {
        return current != null;
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
