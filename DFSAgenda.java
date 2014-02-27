import rp13.search.interfaces.Agenda;
import rp13.search.util.ActionStatePair;

import java.util.Iterator;
import java.util.Stack;

public class DFSAgenda implements Agenda<ActionStatePair> {

    private Stack<ActionStatePair> Frontier = new Stack<ActionStatePair>();

    /**
     * Adds the given item to the agenda.
     *
     * @param _item
     */
    @Override
    public void push(ActionStatePair _item) {
        Frontier.push(_item);
    }

    /**
     * Returns the next item from the agenda, removing it in the process.
     *
     * @return
     */
    @Override
    public ActionStatePair pop() {
        return Frontier.pop();

    }

    /**
     * Returns true if the agenda is empty
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return Frontier.isEmpty();
    }

    /**
     * Returns true if the agenda contains the given item.
     *
     * @param _item
     * @return
     */
    @Override
    public boolean contains(ActionStatePair _item) {
        for (int i = 0; i < Frontier.size(); i++) {
            if (Frontier.get(i) == _item)
                return true;
        }
        return false;

    }

    @Override
    public Iterator<ActionStatePair> iterator() {
        return null;
    }
}