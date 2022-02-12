package BPMN.Elements;

import java.util.Vector;
import BPMN.BPMNGraph;

public class Edge {
	public int _iD;
	private Node _beginNode;
	private Node _endNode;
	private String _label;
	private java.util.Vector<EdgeType> _edgeType;
	public EdgeType _unnamed_EdgeType_;
	public Vector<BPMNGraph> _unnamed_BPMNGraph_ = new Vector<BPMNGraph>();

	public Edge(Node aBegin, Node aEnd, EdgeType aEdgeType, String aLabel) {
		throw new UnsupportedOperationException();
	}

	public Node[] getNodes() {
		throw new UnsupportedOperationException();
	}

	public String getLabel() {
		return this._label;
	}

	public EdgeType getEdgeType() {
		return this._edgeType;
	}

	public void setID(int aID) {
		this._iD = aID;
	}

	public int getID() {
		return this._iD;
	}
}