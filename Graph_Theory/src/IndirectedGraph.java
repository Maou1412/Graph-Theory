
	import java.util.HashSet;
	import java.util.Set;

	public class IndirectedGraph extends Graph {

		@Override
		public void addEdges(String vertex_1, String vertex_2) {
			// TODO Auto-generated method stub
			if (adjList.containsKey(vertex_2) && adjList.containsKey(vertex_1)) {
				if (!vertex_1.equals(vertex_2)) {
					adjList.get(vertex_1).add(vertex_2);
					adjList.get(vertex_2).add(vertex_1);
				} else {
					adjList.get(vertex_1).add(vertex_2);
				}
			}
		}

		@Override
		public int numberOfEdges() {
			// TODO Auto-generated method stub
			return super.degree()/2;
		}

		@Override
		public void removeEdge(String vertex_1, String vertex_2) {	
		}
	}

