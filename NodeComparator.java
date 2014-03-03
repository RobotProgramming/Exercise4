package exercise4;

import java.util.Comparator;

public class NodeComparator<ActionT, StateT> implements
		Comparator<Node<ActionT, StateT>> {

	private Node<ActionT, StateT> goal;

	@Override
	public int compare(Node<ActionT, StateT> x, Node<ActionT, StateT> y) {
		if (heuristic(x) < heuristic(y))
			return -1;
		else if (heuristic(x) > heuristic(y))
			return 1;
		else
			return 0;
	}

	public void setGoal(StateT _goal) {
		Node<ActionT, StateT> node = new Node<ActionT, StateT>(_goal);
		goal = node;
	}

	private int heuristic(Node<ActionT, StateT> node) {

		return 0;

	}

}
