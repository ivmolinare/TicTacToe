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
			
			// Se evalúa si ha ganado el jugador 1
			
			SquareViewComponent[] squares = mainView.getSquares();
			
			if(squares[0].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[1].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[2].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player1.getName() + "!");
				System.exit(0);
			}
			
			if(squares[3].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[4].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[5].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player1.getName() + "!");
				System.exit(0);
			}
			
			if(squares[6].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[7].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[8].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player1.getName() + "!");
				System.exit(0);
			}
			
			if(squares[0].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[3].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[6].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player1.getName() + "!");
				System.exit(0);
			}
			
			if(squares[1].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[4].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[7].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player1.getName() + "!");
				System.exit(0);
			}
			
			if(squares[2].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[5].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[8].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player1.getName() + "!");
				System.exit(0);
			}
			
			if(squares[0].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[4].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[8].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player1.getName() + "!");
				System.exit(0);
			}
			
			if(squares[6].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[4].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1
					&& squares[2].getState() == pressedButton.STATE_PRESSED_BY_PLAYER1) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player1.getName() + "!");
				System.exit(0);
			}
			
			// Se evalúa si ha ganado el jugador 2
			
			if(squares[0].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[1].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[2].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player2.getName() + "!");
				System.exit(0);
			}
			
			if(squares[3].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[4].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[5].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player2.getName() + "!");
				System.exit(0);
			}
			
			if(squares[6].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[7].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[8].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player2.getName() + "!");
				System.exit(0);
			}
			
			if(squares[0].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[3].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[6].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player2.getName() + "!");
				System.exit(0);
			}
			
			if(squares[1].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[4].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[7].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player2.getName() + "!");
				System.exit(0);
			}
			
			if(squares[2].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[5].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[8].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player2.getName() + "!");
				System.exit(0);
			}
			
			if(squares[0].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[4].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[8].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player2.getName() + "!");
				System.exit(0);
			}
			
			if(squares[6].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[4].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2
					&& squares[2].getState() == pressedButton.STATE_PRESSED_BY_PLAYER2) {
				
				JOptionPane.showMessageDialog(mainView, "¡Ha ganado " + player2.getName() + "!");
				System.exit(0);
			}
			
			// Se evalúa si ha habido empate
			
			int count = 0;
			
			for(int i = 0; i < squares.length; i++) {
				
				if(squares[i].getState() > 0) {
					
					count++;
				}
			}
			
			if(count == 9) {
				
				JOptionPane.showMessageDialog(mainView, "Ha habido empate.");
				System.exit(0);
			}
		}
		
	}
}