package exercise4;
import rp13.search.interfaces.Agenda;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSAgenda<ActionT, StateT> implements Agenda<Node<ActionT, StateT>> {

    private LinkedList<Node<ActionT, StateT>> frontier = new LinkedList<Node<ActionT, StateT>>();

    /**
     * Adds the given item to the agenda.
     *
     * @param _item
     */
    @Override
    public void push(Node<ActionT, StateT> _item) {
        frontier.addLast(_item);
    }

    /**
     * Returns the next item from the agenda, removing it in the process.
     *
     * @return
     */
    @Override
    public Node<ActionT, StateT> pop() {
        return frontier.removeFirst();
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
