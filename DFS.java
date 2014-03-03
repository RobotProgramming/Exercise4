package exercise4;
import rp13.search.interfaces.SuccessorFunction;

public class DFS<ActionT, StateT> extends Search<ActionT, StateT> {
	public DFS(StateT start, StateT goal,
			SuccessorFunction<ActionT, StateT> succFunc) {
		super(start, goal, new DFSAgenda<ActionT, StateT>(), succFunc);
	}
}
