package com.arpan.algorithms.part1.week1.unionfind.impl;

import com.arpan.algorithms.part1.week1.unionfind.UnionFind;

public class QuickUnionImproved implements UnionFind {

  private int[] id;
  private int[] size;

  public QuickUnionImproved(int n) {
    id = new int[n];
    size = new int[n];

    // Set id of each element to itself
    for (var i = 0; i < n; i++) {
      id[i] = i;
      size[i] = 1;
    }
  }

  @Override
  public boolean connected(int p, int q) {
    // If p and q have same root, they are connected
    return root(p) == root(q);
  }

  @Override
  public void union(int p, int q) {
    // Change root of p to point to root of q
    var proot = root(p);
    var qroot = root(q);

    if (proot == qroot) return;

    // Make smaller tree the child of larger tree
    if (size[proot] < size[qroot]) {
      makeParentOf(proot, qroot);
      size[qroot] += size[proot];
    } else {
      makeParentOf(qroot, proot);
      size[proot] += size[qroot];
    }
  }

  private int root(int i) {
    // Chase parent of each node to find root
    while (i != parent(i)) {
      // Path compression
      makeParentOf(i, parent(parent(i)));
      i = parent(i);
    }
    return i;
  }

  private int parent(int i) {
    return id[i];
  }

  private void makeParentOf(int child, int parent) {
    id[child] = parent;
  }
}
