package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.MainModel;
import view.MainView;

public class MainController {

	private MainView mainView;
	private MainModel mainModel;
	
	public MainController(MainView mainView, MainModel mainModel) {
		
		this.mainView = mainView;
		this.mainModel = mainModel;
		
		this.mainView.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(mainView, "CASILLA MARCADA");
		}
		
	}
}