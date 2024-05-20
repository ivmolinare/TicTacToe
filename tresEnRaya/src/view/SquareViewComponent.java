package view;

import java.awt.Dimension;

import javax.swing.JButton;

public class SquareViewComponent extends JButton {

	public final int STATE_NOT_PRESSED = 0;
	public final int STATE_PRESSED_BY_PLAYER1 = 1;
	public final int STATE_PRESSED_BY_PLAYER2 = 2;
	
	private final int PREFERED_INITIAL_WIDTH = 256;
	private final int PREFERED_INITIAL_HEIGHT = 256;

	private int state;
	
	SquareViewComponent() {
		
		super.setFocusPainted(false);
		super.setPreferredSize(new Dimension(PREFERED_INITIAL_WIDTH, PREFERED_INITIAL_HEIGHT));
		state = 0;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		
		this.state = state;
	}

	public int getPREFERED_INITIAL_WIDTH() {
		return PREFERED_INITIAL_WIDTH;
	}

	public int getPREFERED_INITIAL_HEIGHT() {
		return PREFERED_INITIAL_HEIGHT;
	}
	
}