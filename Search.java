package exercise4;
import java.util.ArrayList;
import java.util.List;

import rp13.search.interfaces.Agenda;
import rp13.search.interfaces.SuccessorFunction;

import rp13.search.util.ActionStatePair;


public class Search<ActionT, StateT> {
	private StateT start;
	private StateT goal;
	private Agenda<Node<ActionT,StateT>> frontier;
	private SuccessorFunction<ActionT, StateT> succFunc;
	
	public Search(StateT start, StateT goal,
			Agenda<Node<ActionT, StateT>> frontier,
			SuccessorFunction<ActionT, StateT> succFunc) {
		this.start = start;
		this.goal = goal;
		this.frontier = frontier;
		this.succFunc = succFunc;
	}

	public Node<ActionT, StateT> search() {
		List<ActionStatePair<ActionT, StateT>> explored = new ArrayList<ActionStatePair<ActionT, StateT>>();
		Node<ActionT, StateT> startNode = new Node<ActionT, StateT>(start);
		frontier.push(startNode);
		while(!frontier.isEmpty()) {
			Node<ActionT, StateT> node = frontier.pop();
			if(node.getState().equals(goal)) {
				return node;
			}
			if(!explored.contains(node.getActionStatePair())) {
				explored.add(node.getActionStatePair());
			}
			List<ActionStatePair<ActionT, StateT>> newNodes = new ArrayList<ActionStatePair<ActionT,StateT>>();
			succFunc.getSuccessors(node.getState(), newNodes);
			for(ActionStatePair<ActionT, StateT> newNode : newNodes) {
				if(!explored.contains(newNode)) {
					System.out.println(explored.size());
					frontier.push(new Node<ActionT, StateT>(newNode, node));
				}
			}
		}
		return null;
	}
}
