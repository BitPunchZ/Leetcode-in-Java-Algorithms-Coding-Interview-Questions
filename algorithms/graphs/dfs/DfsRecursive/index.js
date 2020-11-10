// This class represents a directed graph using adjacency list representation

class Graph {
  constructor() {
    this.graph = {};
  }

  setEdge(u, v) {
    if (!this.graph[u]) this.graph[u] = [];
    this.graph[u].push(v);
  }

  DFS(u, visited) {
    visited.add(u);
    console.log(u);
    if (!this.graph[u]) return;
    for (let v of this.graph[u]) if (!visited.has(v)) this.DFS(v, visited);
  }
}

g = new Graph();
g.setEdge(2, 1);
g.setEdge(2, 5);
g.setEdge(5, 6);
g.setEdge(5, 8);
g.setEdge(6, 9);

visited = new Set();

g.DFS(2, visited);
