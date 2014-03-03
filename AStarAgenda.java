package exercise4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

import rp13.search.interfaces.Agenda;



public class AStarAgenda <ActionT, StateT> implements Agenda<Node<ActionT, StateT>> {
	
	
	private PriorityQueue<Node<ActionT, StateT>> queue;
	private Node<ActionT,StateT> goalState;
	

	public AStarAgenda(StateT goal) {
		NodeComparator<ActionT,StateT> comparator = new NodeComparator<ActionT,StateT>();
		comparator.setGoal(goal);
        this.queue = new PriorityQueue<Node<ActionT,StateT>>(10, comparator);
        Node<ActionT,StateT> node = new Node<ActionT,StateT>(goal);
        this.goalState = node;
		
	}


	@Override
	public void push(Node<ActionT, StateT> _item) {
		queue.add(_item);
	}

	@Override
	public Node<ActionT, StateT> pop() {
		return queue.poll();	
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public boolean contains(Node<ActionT, StateT> _item) {
		return queue.contains(_item);
	}
	
	
	@Override
	public Iterator<Node<ActionT, StateT>> iterator() {
		return null;
	}

	}
