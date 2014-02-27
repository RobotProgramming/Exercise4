import rp13.search.interfaces.Agenda;
import rp13.search.util.ActionStatePair;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSAgenda implements Agenda<ActionStatePair> {

    private LinkedList<ActionStatePair> Frontier = new LinkedList<ActionStatePair>();

    /**
     * Adds the given item to the agenda.
     *
     * @param _item
     */
    @Override
    public void push(ActionStatePair _item) {
        Frontier.addLast(_item);
    }

    /**
     * Returns the next item from the agenda, removing it in the process.
     *
     * @return
     */
    @Override
    public ActionStatePair pop() {
        return Frontier.removeFirst();
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
