import rp13.search.util.ActionStatePair;

import java.util.ArrayList;

public class Node<ActionT, StateT> extends DFSAgenda {

    private ActionT action;
    private StateT state;
    private Node parent;

    public Node(ActionT _action, StateT _state) {
        action = _action;
        state = _state;
    }

    public Node(ActionT _action, StateT _state, Node _parent) {
        action = _action;
        state = _state;
        parent = _parent;
    }

    public void setContents(ActionT _action, StateT _state) {
        action = _action;
        state = _state;
    }


    public void explore() {
        ArrayList<ActionStatePair<ActionT,StateT>> successors = new ArrayList<ActionStatePair<ActionT, StateT>>();

    }

}
