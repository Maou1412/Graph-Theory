
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class Graph {
	Map<String, Set<String>> adjList;

	
	public abstract void removeEdge(String vertex_1, String vertex_2);
	public abstract int numberOfEdges();

	public Graph() {
		adjList = new HashMap<String, Set<String>>();
	}

	public void addVertex(String vertex) {
		if (!adjList.containsKey(vertex)) {
			Set adj = new HashSet<String>();
			this.adjList.put(vertex, adj);
		}
	}
	
	public void removeVertex(String vertex) {
		this.adjList.remove(vertex);
	}

	public abstract void addEdges(String vertex_1, String vertex_2);

	public void printList() {
		Set keySet = adjList.keySet();
		for (Object key : keySet) {
			System.out.println(key + " " + adjList.get(key));
		}
	}

	public int degree() {
		int result = 0;
		Set keySet = adjList.keySet();
		for (Object key : keySet) {
			result += adjList.get(key).size();
		}
		return result;
	}

	public int degreeOfSpecifedVertex(String vertex) {
		if (adjList.containsKey(vertex)) {
			return adjList.get(vertex).size();
		}
		return 0;
	}

	

	public static void main(String[] args) {
		Graph graph = new IndirectedGraph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addEdges("A", "C");
		graph.removeVertex("B");;
		graph.printList();
		System.out.println(graph.degree());
		System.out.println(graph.numberOfEdges());

	}
}
