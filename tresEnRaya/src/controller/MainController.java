package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

import model.GameManagerModel;
import model.PlayerModel;
import view.MainView;
import view.SquareViewComponent;

public class MainController {

	private MainView mainView;
	private GameManagerModel gameManagerModel;
	private PlayerModel player1;
	private PlayerModel player2;
	
	public MainController(MainView mainView, GameManagerModel gameManagerModel) {
		
		this.mainView = mainView;
		this.gameManagerModel = gameManagerModel;
		
		player1 = new PlayerModel("Iván");
		player2 = new PlayerModel("Ainhoa");
		
		this.mainView.addButtonListener(new ButtonListener());
	}
	
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			SquareViewComponent pressedButton = (SquareViewComponent) e.getSource();
			
			if(pressedButton.getState() > 0) { return; }
			
			gameManagerModel.advanceRound();
			
			if(gameManagerModel.getCurrentPlayer() == null) {
				
				gameManagerModel.setCurrentPlayer(player1);
			}
				
			if(gameManagerModel.getCurrentPlayer() == player1) {
				
				gameManagerModel.setCurrentPlayer(player2);
				pressedButton.setIcon(mainView.getCross());
				pressedButton.setState(pressedButton.STATE_PRESSED_BY_PLAYER1);
				
			} else {
				
				gameManagerModel.setCurrentPlayer(player1);
				pressedButton.setIcon(mainView.getNought());
				pressedButton.setState(pressedButton.STATE_PRESSED_BY_PLAYER2);
			}
			
			
		}
		
	}
}