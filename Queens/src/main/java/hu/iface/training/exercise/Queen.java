package hu.iface.training.exercise;

public class Queen {
	
	private Coordinate coordinate;

	public Queen(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	@Override
	public String toString() {
		return "Queen [coordinate=" + coordinate + "]";
	}

	public boolean attacks(Queen other) {
		return coordinate.sameRow(other.coordinate) ||
				coordinate.sameColumn(other.coordinate) ||
				coordinate.sameDiagonal(other.coordinate);
	}
	
}
