
import java.util.*; 

class Graph { 
  int numberOfNodes;
  ArrayList<ArrayList<Integer> > graph;

  Graph(int numberOfNodes){
    this.numberOfNodes = numberOfNodes+1;
    graph = new ArrayList< ArrayList<Integer> >();

    for (int i = 0; i < this.numberOfNodes; i++) 
      graph.add(new ArrayList<Integer>()); 

  } 

  void insertEdge(int v1,int v2){
    this.graph.get(v1).add(v2);
    this.graph.get(v2).add(v1);
  }

	void printGraph() { 
		for (int i = 0; i < this.graph.size(); i++){
        for (int j = 0; j < this.graph.get(i).size(); j++){
            System.out.println(i + "->" + this.graph.get(i).get(j));
        } 
    }
	} 
	 

	public static void main(String[] args) 
	{ 
		Graph g = new Graph(5);

    g.insertEdge(1, 2);
    g.insertEdge(2, 3);
    g.insertEdge(4, 5);

    g.printGraph();
	} 
} 
