package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFSImpl {
	static List<List<Integer>> undirectedGraph = new ArrayList<>();

	public static void dfsUtil(int node,boolean visited[])
	{
		visited[node] = true;
		System.out.print(node+" ");
		for(int x:undirectedGraph.get(node))
		{
			if(visited[x]==false)
			{
				dfsUtil(x, visited);
			}
		}
	}
	public static void implementDFS(int V, int start) {
		boolean visited[] = new boolean[V];
		System.out.println("DFS tevaersal");
		dfsUtil(start, visited);

	}

	public static void enterEdge(int u, int v) {
		undirectedGraph.get(u).add(v);
	}

	public static void printGraph() {
		for (int i = 0; i < undirectedGraph.size(); i++) {
			System.out.print(i + "->");
			for (int j = 0; j < undirectedGraph.get(i).size(); j++) {
				System.out.print(undirectedGraph.get(i).get(j)+"->");
			}
			System.out.println("null");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int v = 4;

		for (int i = 0; i < v; i++) {
			undirectedGraph.add(new ArrayList<Integer>());
		}

		
		enterEdge(0, 1);
		enterEdge(0, 2);
		enterEdge(1, 2);
		enterEdge(2, 0);
		enterEdge(2, 3);
		enterEdge(3, 3);

		printGraph();

		implementDFS(v, 0);

	}
}
