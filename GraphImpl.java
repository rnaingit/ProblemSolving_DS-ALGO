package graph;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GraphImpl {
	static List<List<Integer>> undirectedGraph = new ArrayList<>();
	
	public static void enterEdge(int u, int v)
	{
		undirectedGraph.get(u).add(v);
	}
	
	public static void printGraph()
	{
		for(int i=0;i<undirectedGraph.size();i++)
		{
			System.out.print(i+"->");
			for(int j=0;j<undirectedGraph.get(i).size();j++)
			{
				System.out.print(undirectedGraph.get(i).get(j)+"->");
			}
			System.out.println("null");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		int v=4;
		
		for(int i=0;i<v;i++)
		{
			undirectedGraph.add(new ArrayList<Integer>());
		}
		
		
		
		enterEdge(0, 1);
		enterEdge(0, 2);
		enterEdge(1, 2);
		enterEdge(2, 0);
		enterEdge(2, 3);
		enterEdge(3, 3);

		
		printGraph();
		
	}

}
