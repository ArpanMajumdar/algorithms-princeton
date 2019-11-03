package com.arpan.algorithms.part1.week1.unionfind.impl;

import com.arpan.algorithms.part1.week1.unionfind.UnionFind;

public class QuickFind implements UnionFind {
  private int[] id;

  public QuickFind(int n) {
    id = new int[n];

    for (int i = 0; i < n; i++) {
      id[i] = i;
    }
  }

  @Override
  public boolean connected(int p, int q) {
    return id[p] == id[q];
  }

  @Override
  public void union(int p, int q) {
    var pid = id[p];
    var qid = id[q];

    for (var i = 0; i < id.length; i++) {
      if (id[i] == pid) id[i] = qid;
    }
  }
}
