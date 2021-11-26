package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFSImpl {
	static List<List<Integer>> undirectedGraph = new ArrayList<>();

	public static void implementBFS(int V, int start) {
		Queue<Integer> q = new LinkedList<Integer>();

		boolean[] visited = new boolean[V];

		q.add(start);

		visited[start] = true;

		while (q.isEmpty() == false) {
			int node=q.poll();
			System.out.print(node+" ");
			
			for(int x:undirectedGraph.get(node))
			{
				if(visited[x]==false)
				{
					visited[x]=true;
					q.add(x);
				}
			}
			
		}

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

		implementBFS(v, 0);

	}

}
