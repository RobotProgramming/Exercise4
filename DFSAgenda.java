package exercise4;
import rp13.search.interfaces.Agenda;

import java.util.Iterator;
import java.util.Stack;

public class DFSAgenda<ActionT, StateT> implements Agenda<Node<ActionT, StateT>> {

    private Stack<Node<ActionT, StateT>> frontier = new Stack<Node<ActionT, StateT>>();
    
    /**
     * Adds the given item to the agenda.
     *
     * @param _item
     */
    @Override
    public void push(Node<ActionT, StateT> _item) {
        frontier.push(_item);
    }

    /**
     * Returns the next item from the agenda, removing it in the process.
     *
     * @return
     */
    @Override
    public Node<ActionT, StateT> pop() {
        return frontier.pop();

    }

    /**
     * Returns true if the agenda is empty
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return frontier.isEmpty();
    }

    /**
     * Returns true if the agenda contains the given item.
     *
     * @param _item
     * @return
     */
    @Override
    public boolean contains(Node<ActionT, StateT> _item) {
        return frontier.contains(_item);
    }

    @Override
    public Iterator<Node<ActionT, StateT>> iterator() {
        return null;
    }
}
