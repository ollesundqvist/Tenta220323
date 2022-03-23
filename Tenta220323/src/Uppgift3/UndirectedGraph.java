package Uppgift3;

import java.util.NoSuchElementException;

public class UndirectedGraph implements Graph{
	private Node[] nodeArr;
	private int amountOfNodes, amountOfEdges;
	private Edge[] edgeArr;
	
	public UndirectedGraph() {
		this.nodeArr = new Node[0];
		this.edgeArr = new Edge[0];
		this.amountOfEdges = 0;
		this.amountOfNodes = 0;
	}
	
	private class Node{
		private int x,y,id;
		
		public Node(int id, int x, int y) {
			this.id = id;
			this.x = x;
			this.y = y;
		}
	}
	
	private class Edge{
		private Node[] connectedNodes;
		private int weight;
		
		public Edge(Node n1, Node n2, int weight) {
			this.weight = weight;
			this.connectedNodes = new Node[2];
			connectedNodes[0] = n1;
			connectedNodes[1] = n2;
			
		}
	}
	

	@Override
	public void addNode(int id, int x, int y) {
		if(x < 0 || y < 0) {
			throw new IllegalArgumentException();
		}else {
			boolean exists = false;
			for(Node node : nodeArr) {
				if(node.id == id) {
					exists = true;
				}
			}
			if(exists) {
				throw new IllegalArgumentException();
			}else {
				amountOfNodes++;
				int count = 0;
				Node[] holdingArr = nodeArr;
				nodeArr = new Node[amountOfNodes];
				
				for(Node node : holdingArr) {
					nodeArr[count] = node;
					count++;
				}
				nodeArr[amountOfNodes-1] = new Node(id, x, y);
				
			}
		}
		
	}

	@Override
	public void addEdge(int id1, int id2, int weight) {
		Node n1 = null;
		Node n2 = null;
		for(Node node : nodeArr) {
			if(node.id == id1) {
				n1 = node;
			}else if(node.id == id2) {
				n2 = node;
			}
		}
		if(n1 != null && n2 != null) {
			
			
			amountOfEdges++;
			Edge[] holdingArr = edgeArr;
			edgeArr = new Edge[amountOfEdges];
			int count = 0;
			for(Edge edge : holdingArr) {
				edgeArr[count] = edge;
				count++;
			}
			edgeArr[amountOfEdges-1] = new Edge(n1, n2, weight);	
		}else {
			throw new NoSuchElementException();
		}
		
	}
	
	public void showEdges() {
		System.out.println("Edges: ");
		for(Edge edge : edgeArr) {
			System.out.print("(" + edge.connectedNodes[0].id + "->" + edge.connectedNodes[1].id + ", weight: " + edge.weight);
		}
		System.out.println("");
	}
	
	public void showNodes() {
		System.out.println("Nodes: ");
		for(Node node : nodeArr) {
			System.out.print("( X: " + node.x + ", Y:" + node.y + ", ID:" + node.id + ") ");
		}
		System.out.println("");
	}
}
