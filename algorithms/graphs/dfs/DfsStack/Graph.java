
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
  }

	void printGraph() { 
		for (int i = 0; i < this.graph.size(); i++){
        for (int j = 0; j < this.graph.get(i).size(); j++){
            System.out.println(i + "->" + this.graph.get(i).get(j));
        } 
    }
	} 

  void DFS(int startNode) {
    Set<Integer> visited = new HashSet<Integer>(); 

    Stack<Integer> st = new Stack<Integer>(); 
    st.push(startNode);

    while (st.size() != 0) {
      int cur = st.pop();

      if (!visited.contains(cur)) {
        visited.add(cur);
        System.out.println(cur);
      }

      if (this.graph.get(cur) == null) continue;

      for(int i = 0;i<this.graph.get(cur).size();++i){
          int vertex = this.graph.get(cur).get(i);
          if (!visited.contains(vertex)) 
            st.push(vertex);

      }
    }
  }
	 

	public static void main(String[] args) 
	{ 
		Graph g = new Graph(9);

    g.insertEdge(2, 1);
    g.insertEdge(2, 5);
    g.insertEdge(5, 6);
    g.insertEdge(5, 8);
    g.insertEdge(6, 9);


    g.DFS(2);
	} 
} 
