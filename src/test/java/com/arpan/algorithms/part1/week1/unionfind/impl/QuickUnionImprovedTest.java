package com.arpan.algorithms.part1.week1.unionfind.impl;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickUnionImprovedTest {

  @Test
  public void testQuickUnionWithHeight() {
    // Setup
    var quickUnionWithHeight = new QuickUnionImproved(10);

    // When
    quickUnionWithHeight.union(0, 5);
    quickUnionWithHeight.union(0, 6);
    quickUnionWithHeight.union(1, 2);
    quickUnionWithHeight.union(2, 7);
    quickUnionWithHeight.union(3, 8);
    quickUnionWithHeight.union(3, 4);
    quickUnionWithHeight.union(8, 9);

    // Then
    assertTrue(quickUnionWithHeight.connected(5, 6));
    assertTrue(quickUnionWithHeight.connected(3, 9));
    assertFalse(quickUnionWithHeight.connected(0, 9));
    assertFalse(quickUnionWithHeight.connected(2, 6));
  }
}
