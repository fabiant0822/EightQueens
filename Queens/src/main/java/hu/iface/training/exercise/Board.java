package hu.iface.training.exercise;

import java.util.ArrayList;
import java.util.List;

public class Board {

	public static final int SIZE=8;

	private List<Queen> queens = new ArrayList<>();

	public Board() {
	}

	public Board(List<Queen> queens) {
		this.queens = new ArrayList<>(queens);
	}

	public Board copy() {
		return new Board(queens);
	}

	public boolean isSafe(Queen queen) {
		boolean canBeSafe = true;
		for (int i = 0; i < queens.size() && canBeSafe; i++) {
			if (queens.get(i).attacks(queen)) {
				canBeSafe = false;
			}
		}
		return canBeSafe;
	}

	public void addQueen(Queen queen) {
		queens.add(queen);
		
	}

	public void removeQueen(Queen queen) {
		queens.remove(queen);
		
	}

	@Override
	public String toString() {
		return "Board [queens=" + queens + "]";
	}

}
