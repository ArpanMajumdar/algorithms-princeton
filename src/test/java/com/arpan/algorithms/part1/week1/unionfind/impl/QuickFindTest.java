package com.arpan.algorithms.part1.week1.unionfind.impl;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickFindTest {

  @Test
  public void testQuickFind() {
    // Setup
    var quickFind = new QuickFind(10);

    // When
    quickFind.union(0, 5);
    quickFind.union(0, 6);
    quickFind.union(1, 2);
    quickFind.union(2, 7);
    quickFind.union(3, 8);
    quickFind.union(3, 4);
    quickFind.union(8, 9);

    // Then
    assertTrue(quickFind.connected(5, 6));
    assertTrue(quickFind.connected(3, 9));
    assertFalse(quickFind.connected(0, 9));
    assertFalse(quickFind.connected(2, 6));
  }
}
