package main;

import controller.MainController;
import model.GameManagerModel;
import view.MainView;

public class Main {

	public static void main(String[] args) {
		
		MainView mainView = new MainView();
		GameManagerModel mainModel = new GameManagerModel();
		MainController mainController = new MainController(mainView, mainModel);
		
		mainView.setVisible(true);
	}

}