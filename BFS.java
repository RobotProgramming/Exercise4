package exercise4;
import rp13.search.interfaces.SuccessorFunction;

public class BFS<ActionT, StateT> extends Search<ActionT, StateT> {
	public BFS(StateT start, StateT goal,
			SuccessorFunction<ActionT, StateT> succFunc) {
		super(start, goal, new BFSAgenda<ActionT, StateT>(), succFunc);
	}
}
