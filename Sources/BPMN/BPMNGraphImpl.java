package BPMN;

import BPMN.Elements.Node;
import BPMN.Elements.Edge;
import BPMN.Elements.SwimLane;

public interface BPMNGraphImpl {

	public void BPMNGraphImpl(String aLabel);

	public int addNode(Node aNode);

	public void deleteNode(int aIndex);

	public int addEdge(Edge aEdge);

	public void deleteEdge(int aIndex);

	public int addLane(SwimLane aSwimlane);

	public void deleteLane(int aIndex);

	public void getAllNodes();

	public void getAllEdges();

	public SwimLane[] getAllLanes();

	public Node[] searchNodes(int[] aIndex);

	public Edge[] searchEdges(int[] aIndex);

	public SwimLane[] seachLanes(int[] aIndex);

	public BPMNGraph getGraph();
}