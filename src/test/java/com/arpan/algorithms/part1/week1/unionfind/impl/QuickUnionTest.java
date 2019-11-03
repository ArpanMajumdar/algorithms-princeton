package com.arpan.algorithms.part1.week1.unionfind.impl;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickUnionTest {

  @Test
  public void testQuickUnion() {
    // Setup
    var quickUnion = new QuickUnion(10);

    // When
    quickUnion.union(0, 5);
    quickUnion.union(0, 6);
    quickUnion.union(1, 2);
    quickUnion.union(2, 7);
    quickUnion.union(3, 8);
    quickUnion.union(3, 4);
    quickUnion.union(8, 9);

    // Then
    assertTrue(quickUnion.connected(5, 6));
    assertTrue(quickUnion.connected(3, 9));
    assertFalse(quickUnion.connected(0, 9));
    assertFalse(quickUnion.connected(2, 6));
  }
}
