package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.MainModel;
import view.MainView;

public class MainController {

	private MainView mainView;
	private MainModel mainModel;
	
	public MainController(MainView mainView, MainModel mainModel) {
		
		this.mainView = mainView;
		this.mainModel = mainModel;
		
		this.mainView.addButtonListener(new ButtonListener());
	}
	
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton button = (JButton) e.getSource();
			button.setText("PULSADO");
		}
		
	}
}