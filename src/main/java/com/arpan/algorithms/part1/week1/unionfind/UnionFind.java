package com.arpan.algorithms.part1.week1.unionfind;

public interface UnionFind {

  boolean connected(int p, int q);

  void union(int p, int q);
}
