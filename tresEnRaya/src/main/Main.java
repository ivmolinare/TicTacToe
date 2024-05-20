package main;

import controller.MainController;
import model.MainModel;
import view.MainView;

public class Main {

	public static void main(String[] args) {
		
		MainView mainView = new MainView();
		MainModel mainModel = new MainModel();
		MainController mainController = new MainController(mainView, mainModel);
		
		mainView.setVisible(true);
	}

}