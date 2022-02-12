package BPMN;

import BPMN.Elements.Node;
import BPMN.Elements.Edge;
import BPMN.Elements.SwimLane;

public class BPMNGraph {
	public int _iD;
	private Node[] _nodes;
	private Edge[] _edges;
	private SwimLane[] _lanes;
	public Node _unnamed_Node_;
	public Edge _unnamed_Edge_;
	public SwimLane _unnamed_SwimLane_;

	public BPMNGraph() {
		throw new UnsupportedOperationException();
	}

	public int addNode(Node aNode) {
		throw new UnsupportedOperationException();
	}

	public void deleteNode(int aIndex) {
		throw new UnsupportedOperationException();
	}

	public int addEdge(Edge aEdge) {
		throw new UnsupportedOperationException();
	}

	public void deleteEdge(int aIndex) {
		throw new UnsupportedOperationException();
	}

	public SwimLane[] getLanes() {
		return this._lanes;
	}

	public void setID(int aID) {
		this._iD = aID;
	}

	public int getID() {
		return this._iD;
	}
}