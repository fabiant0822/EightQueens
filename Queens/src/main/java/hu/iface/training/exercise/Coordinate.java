package hu.iface.training.exercise;

public class Coordinate {

	private int row;
	private int column;

	public Coordinate(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}

	@Override
	public String toString() {
		return "Coordinate [row=" + row + ", column=" + column + "]";
	}

	public boolean sameRow(Coordinate other) {
		return row == other.row;
	}
	
	public boolean sameColumn(Coordinate other) {
		return column == other.column;
	}
	public boolean sameDiagonal(Coordinate other) {
		return Math.abs(row - other.row) == Math.abs(column - other.column);
	} 

}
