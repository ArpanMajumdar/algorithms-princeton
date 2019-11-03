package com.arpan.algorithms.part1.week2.stack.exception;

public class StackUnderflowException extends RuntimeException {
    public StackUnderflowException(String message) {
        super(message);
    }
}
