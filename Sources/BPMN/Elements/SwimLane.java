package BPMN.Elements;

import java.util.Vector;
import BPMN.BPMNGraph;

public class SwimLane {
	public int _iD;
	private String _label;
	private boolean _isVertical;
	public Vector<BPMNGraph> _unnamed_BPMNGraph_ = new Vector<BPMNGraph>();

	public SwimLane(String aName) {
		throw new UnsupportedOperationException();
	}

	public String getLabel() {
		return this._label;
	}

	public boolean getIsVertical() {
		return this._isVertical;
	}
}