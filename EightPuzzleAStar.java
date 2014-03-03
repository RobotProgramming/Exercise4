package exercise4;

import java.util.ArrayList;
import java.util.List;

import rp13.search.interfaces.SuccessorFunction;
import rp13.search.problem.puzzle.EightPuzzle;
import rp13.search.problem.puzzle.EightPuzzleSuccessorFunction;
import rp13.search.problem.puzzle.EightPuzzle.PuzzleMove;
import rp13.search.util.ActionStatePair;

public class EightPuzzleAStar extends AStar<PuzzleMove, EightPuzzle> {

	public EightPuzzleAStar() {
		super(EightPuzzle.randomEightPuzzle(), 
			EightPuzzle.orderedEightPuzzle(),
			new EightPuzzleSuccessorFunction());
	}	
		
	public static void main(String[] args) 
	{
			EightPuzzleAStar searcher = new EightPuzzleAStar();  
			
			/* Node object is created, this will be the node that holds the goal state.
			 * search method is run to find the goal state node, this is run from the Search class, 
			 * which this classes super class DFS extends.    
			 * 
			 */
			Node<PuzzleMove, EightPuzzle> node = searcher.search();  

			List<ActionStatePair<PuzzleMove, EightPuzzle>> path = new ArrayList<ActionStatePair<PuzzleMove,EightPuzzle>>();
			
			
			
			while(node != null) {
				path.add(0, node.getActionStatePair());
				node = node.getParent();
			}
			for(ActionStatePair<PuzzleMove, EightPuzzle> pathItem : path) {
				if(pathItem.getAction() == null) {
					System.out.println("START: \n" + pathItem.getState());
				} else {
					System.out.println(pathItem.getAction() + ": \n" + pathItem.getState());
				}
			}
		}
	}
