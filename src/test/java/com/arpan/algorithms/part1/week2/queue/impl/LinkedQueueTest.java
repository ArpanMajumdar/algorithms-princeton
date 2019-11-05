package com.arpan.algorithms.part1.week2.queue.impl;

import com.arpan.algorithms.part1.week2.queue.Queue;
import com.arpan.algorithms.part1.week2.queue.exception.QueueUnderflowException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedQueueTest {

    @Test
    public void testEnqueueAndDeque() {
        // Setup
        Queue<Integer> queue = new LinkedQueue<>();

        // When
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        //
        assertEquals(Integer.valueOf(1), queue.dequeue());
        assertEquals(Integer.valueOf(2), queue.dequeue());
        assertEquals(Integer.valueOf(3), queue.dequeue());
        assertEquals(Integer.valueOf(4), queue.dequeue());
        assertEquals(Integer.valueOf(5), queue.dequeue());
    }

    @Test(expected = QueueUnderflowException.class)
    public void testDequeueOnEmptyQueueThrowsException() {
        // Setup
        Queue<Integer> queue = new LinkedQueue<>();

        //
        queue.dequeue();
    }

  @Test
  public void  testIterateOverQueueItems() {
      // Setup
      Queue<Integer> queue = new LinkedQueue<>();

      // When
      queue.enqueue(1);
      queue.enqueue(2);
      queue.enqueue(3);
      queue.enqueue(4);
      queue.enqueue(5);

    // Then
    queue.forEach(System.out::println);
  }
}