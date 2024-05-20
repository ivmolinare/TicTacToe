package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

import model.GameManagerModel;
import view.MainView;
import view.SquareViewComponent;

public class MainController {

	private MainView mainView;
	private GameManagerModel gameManagerModel;
	
	public MainController(MainView mainView, GameManagerModel gameManagerModel) {
		
		this.mainView = mainView;
		this.gameManagerModel = gameManagerModel;
		
		this.mainView.addButtonListener(new ButtonListener());
	}
	
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int round = gameManagerModel.getRound();
			round++;
			gameManagerModel.setRound(round);
			
			SquareViewComponent pressedButton = (SquareViewComponent) e.getSource();
			
			if(round % 2 == 0) {
				
				pressedButton.setIcon(mainView.getCross());
				
			} else {
				
				pressedButton.setIcon(mainView.getNought());
			}
			
		}
		
	}
}