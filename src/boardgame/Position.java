package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int comumn) {
		this.row = row;
		this.column = comumn;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getComumn() {
		return column;
	}
	public void setComumn(int comumn) {
		this.column = comumn;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	

}
