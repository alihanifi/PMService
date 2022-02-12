package BPMN.Elements;

import java.util.Vector;
import BPMN.BPMNGraph;

public class Node {
	public int _iD;
	private NodeType _nodeType;
	private String _color;
	private String _label;
	private IconType _icon;
	private SwimLane _lane;
	public NodeType _unnamed_NodeType_;
	public IconType _unnamed_IconType_;
	public Vector<BPMNGraph> _unnamed_BPMNGraph_ = new Vector<BPMNGraph>();

	public Node(NodeType aNodeType, String aColor, String aLabel, IconType aIcon) {
		throw new UnsupportedOperationException();
	}

	public NodeType getNodeType() {
		return this._nodeType;
	}

	public String getColor() {
		return this._color;
	}

	public void getLabel() {
		throw new UnsupportedOperationException();
	}

	public IconType getIcon() {
		return this._icon;
	}

	public void setID(int aID) {
		this._iD = aID;
	}

	public int getID() {
		return this._iD;
	}
}