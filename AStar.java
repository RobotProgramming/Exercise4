package exercise4;

import rp13.search.interfaces.SuccessorFunction;

/**
 * AStar that extends Search, and allows the pass in of the problem specific
 * parts of the problem (start, goal, and successor function) 
 *
 * @author adb361
 *
 * @param <ActionT> The action.
 * @param <StateT>  The State.
 */
public class AStar<ActionT, StateT> extends Search<ActionT, StateT> {

	
	/**
	 * Constructor method that calls super class Search and assigns values of problem 
	 * specific parts
	 * @param start The start state of the problem.
	 * @param goal The goal state of the problem.
	 * @param succFunc The successor function of the problem.
	 */
	public AStar(StateT start, StateT goal, SuccessorFunction<ActionT, StateT> succFunc) 
	{
		super(start, goal, new AStarAgenda<ActionT, StateT>(goal), succFunc);
	}
}
