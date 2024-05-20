package model;

public class GameManagerModel {

	private int round = 0;

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}
	
	public void advanceRound() {
		this.round++;
	}
}