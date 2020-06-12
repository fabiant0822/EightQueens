package hu.iface.training.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class EightQueens {

	public static void main(String[] args) {
		ArrayList<Board> solutions = new ArrayList<Board>();
		
		Board result = new Board();
//		for (int r1 = 0; r1 < 8; r1++)
//			Arrays.fill(result[r1], '.');
		
	
		solveAllNQueens(result, 0, solutions);
		
		System.out.println(solutions.size());
		for (int i = 0; i < solutions.size(); i++) {
			System.out.println("\nSolution " + (i + 1));
			Board board = solutions.get(i);
			System.out.println(board);
			
//			for (int r = 0; r < Board.SIZE r++) {
//				for (int c = 0; c < board[r].length; c++)
//					System.out.print(board[r][c]);
//				System.out.println();
//			}
		}
	}

	private static void solveAllNQueens(Board board, int col, ArrayList<Board> solutions) {
		if (col == Board.SIZE) {
//			Board copy = new char[board.length][board[0].length];
//			for (int r = 0; r < board.length; r++)
//				for (int c = 0; c < board[0].length; c++)
//					copy[r][c] = board[r][c];
			solutions.add(board.copy());
		} else {
			for (int row=0; row < Board.SIZE; row++) {
				Queen queen = new Queen(new Coordinate(row,col));

			if (board.isSafe(queen)) {
				board.addQueen(queen);
				solveAllNQueens(board, col + 1, solutions);
				board.removeQueen(queen);
			}	
//				if (canBeSafe)
//					solveAllNQueens(board, col + 1, solutions);
//				board[row][col] = '.';
			}
		}
	}

	private static boolean inbounds(int row, int col, char[][] mat) {
		return row >= 0 && row < mat.length && col >= 0 && col < mat[0].length;
	}

}