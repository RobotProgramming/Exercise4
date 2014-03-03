package exercise4;
import rp13.search.util.ActionStatePair;

public class Node<ActionT, StateT> {
	private final ActionStatePair<ActionT, StateT> actionStatePair;
	private final Node<ActionT, StateT> parent;
	
	public Node(StateT state) {
		this(new ActionStatePair<ActionT, StateT>(null, state), null);
	}
    
    public Node(ActionStatePair<ActionT, StateT> actionStatePair, Node<ActionT, StateT> parent) {
    	this.actionStatePair = actionStatePair;
    	this.parent = parent;
    }
    
    public ActionStatePair<ActionT, StateT> getActionStatePair() {
    	return actionStatePair;
    }

    public ActionT getAction() {
    	return actionStatePair.getAction();
    }
    
    public StateT getState() {
    	return actionStatePair.getState();
    }

	public Node<ActionT, StateT> getParent() {
		return parent;
	}
}
