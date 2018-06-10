package com.shortestPath.algorithm.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.shortestPath.algorithm.DijkstrasAlgorithm;
import com.shortestPath.model.Edge;
import com.shortestPath.model.Graph;
import com.shortestPath.model.Node;

public class TestDijkstrasAlgorithm {

	private List<Node> nodes;
	private List<Edge> edges;
	
	@Test
	public void testExecute(){
		nodes = new ArrayList<Node>();
		edges = new ArrayList<Edge>();
		
		for(int i=0;i<11;i++){
			Node location = new Node(i,"Node_"+i);
			nodes.add(location);
		}
		
		addLane(0, 0, 1, 85);
        addLane(1, 0, 2, 217);
        addLane(2, 0, 4, 173);
        addLane(3, 2, 6, 186);
        addLane(4, 2, 7, 103);
        addLane(5, 3, 7, 183);
        addLane(6, 5, 8, 250);
        addLane(7, 8, 9, 84);
        addLane(8, 7, 9, 167);
        addLane(9, 4, 9, 502);
        addLane(10, 9, 10, 40);
        addLane(11, 1, 10, 600);
        
        Graph graph = new Graph(nodes, edges);
        DijkstrasAlgorithm algo = new DijkstrasAlgorithm(graph);
        algo.execute(nodes.get(0));
        LinkedList<Node> path = algo.getPath(nodes.get(10));
        for(Node n:path){
        	System.out.println(n.toString());
        }
        assertNotNull(path);
        assertTrue(path.size() > 0);
	}
	
	private void addLane(int laneId,int sourceLocNo, int destLocNo, int duration){
		Edge lane = new Edge(laneId,nodes.get(sourceLocNo),nodes.get(destLocNo),duration);
		edges.add(lane);
	}
}
