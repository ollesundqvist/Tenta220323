package Uppgift3;


public class Main {

	public static void main(String[] args) {
		UndirectedGraph graf = new UndirectedGraph();
		
		graf.addNode(1, 10, 10);
		graf.addNode(2, 20, 20);
		graf.addNode(3, 30, 30);
		graf.addNode(4, 30, 40);
		graf.addEdge(1, 2, 10);
		graf.addEdge(3, 4, 5);
		
		graf.showEdges();
		graf.showNodes();

	}

}
