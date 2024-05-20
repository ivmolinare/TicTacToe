package model;

public class GameManagerModel {

	private int round = 0;
	private PlayerModel currentPlayer = null;

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}
	
	public void advanceRound() {
		this.round++;
	}
	
	public PlayerModel getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(PlayerModel currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
}