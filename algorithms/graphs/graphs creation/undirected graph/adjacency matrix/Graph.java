
import java.util.*; 

class Graph { 

	private int numberOfNodes = 0;
  Integer[][] graph; 

  Graph(int numberOfNodes){
    this.numberOfNodes = numberOfNodes + 1;
    graph = new Integer[numberOfNodes+1][];

    for(int i = 0; i < numberOfNodes+1  ; ++i) {
        graph[i] = new Integer[numberOfNodes+1]; 
        Arrays.fill(graph[i], 0);
    }
    
  }

  boolean withInBounds(int v1, int v2) {
    return (
      v1 >= 0 && v1 <= this.numberOfNodes && v2 >= 0 && v2 <= this.numberOfNodes
    );
  }

	void insertEdge(int v1, int v2) { 
		if (this.withInBounds(v1, v2)) {
      this.graph[v1][v2] = 1; 
      this.graph[v2][v1] = 1; 
    }
      
	} 

	void printGraph() { 
    for (int i = 0; i < this.numberOfNodes; ++i){
      for (int j = 0; j < this.numberOfNodes; ++j){
        if (this.graph[i][j] == 1) 
          System.out.println(i + "->" + j);
      }
    }
			  
	} 
	 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		Graph g = new Graph(5);

    g.insertEdge(1, 2);
    g.insertEdge(2, 3);
    g.insertEdge(4, 5);

    g.printGraph();
	} 
} 
