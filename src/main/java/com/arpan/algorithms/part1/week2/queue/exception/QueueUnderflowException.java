package com.arpan.algorithms.part1.week2.queue.exception;

public class QueueUnderflowException extends RuntimeException {
  public QueueUnderflowException(String message) {
    super(message);
  }
}
