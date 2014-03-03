package exercise4;
import java.util.ArrayList;
import java.util.List;

import rp13.search.problem.puzzle.EightPuzzle;
import rp13.search.problem.puzzle.EightPuzzle.PuzzleMove;
import rp13.search.problem.puzzle.EightPuzzleSuccessorFunction;
import rp13.search.util.ActionStatePair;

public class EightPuzzleDFS extends DFS<PuzzleMove, EightPuzzle> {
	public EightPuzzleDFS() {
		super(EightPuzzle.randomEightPuzzle(), 
			EightPuzzle.orderedEightPuzzle(),
			new EightPuzzleSuccessorFunction());
	}

	public static void main(String[] args) {
		EightPuzzleDFS searcher = new EightPuzzleDFS();
		Node<PuzzleMove, EightPuzzle> node = searcher.search();

		List<ActionStatePair<PuzzleMove, EightPuzzle>> path = new ArrayList<ActionStatePair<PuzzleMove,EightPuzzle>>();
		while(node != null) {
			path.add(0, node.getActionStatePair());
			node = node.getParent();
		}
		for(ActionStatePair<PuzzleMove, EightPuzzle> pathItem : path) {
			if(pathItem.getAction() == null) {
				System.out.print("Start:\n" + pathItem.getState());
			} else {
				System.out.print(pathItem.getAction() + ": \n" + pathItem.getState());
			}
			System.out.println();
		}
		System.out.println(path.toArray().length);
	}
}
