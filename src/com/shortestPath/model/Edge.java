package com.shortestPath.model;

public class Edge {

	private final int id;
	private final Node source;
	private final Node destination;
	private final int weight;
	
	public Edge(int id, Node source, Node destination, int weight) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public Node getSource() {
		return source;
	}

	public Node getDestination() {
		return destination;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + id;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (id != other.id)
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Edge [source=" + source + ", to destination=" + destination
				+ ", has weight=" + weight + "]";
	}
	
}
