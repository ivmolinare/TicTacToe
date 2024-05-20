package view;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;

public class MainView extends JFrame {
	
	JPanel mainPanel;
	
	SquareViewComponent square1 = new SquareViewComponent();
	SquareViewComponent square2 = new SquareViewComponent();
	SquareViewComponent square3 = new SquareViewComponent();
	SquareViewComponent square4 = new SquareViewComponent();
	SquareViewComponent square5 = new SquareViewComponent();
	SquareViewComponent square6 = new SquareViewComponent();
	SquareViewComponent square7 = new SquareViewComponent();
	SquareViewComponent square8 = new SquareViewComponent();
	SquareViewComponent square9 = new SquareViewComponent();
	
	BufferedImage biCross;
	BufferedImage biNought;
	
	Icon cross;
	Icon nought;

	public MainView() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setName("Tres en raya");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3, 3));
		
		try {
			biCross = ImageIO.read(new File("res/cross.png"));
			biNought = ImageIO.read(new File("res/nought.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Image imgCross = biCross.getScaledInstance(
				square1.getPREFERED_INITIAL_WIDTH()/2,
				square1.getPREFERED_INITIAL_HEIGHT()/2, 
				Image.SCALE_SMOOTH);
		
		Image imgNought = biNought.getScaledInstance(
				square1.getPREFERED_INITIAL_WIDTH()/2, 
				square1.getPREFERED_INITIAL_HEIGHT()/2, 
				Image.SCALE_SMOOTH);
		
		cross = new ImageIcon(imgCross);
		nought = new ImageIcon(imgNought);
		
		mainPanel.add(square1);
		mainPanel.add(square2);
		mainPanel.add(square3);
		mainPanel.add(square4);
		mainPanel.add(square5);
		mainPanel.add(square6);
		mainPanel.add(square7);
		mainPanel.add(square8);
		mainPanel.add(square9);
		
		this.add(mainPanel);
	}
	
	public void addButtonListener(ActionListener listenerForButton) {
		
		square1.addActionListener(listenerForButton);
		square2.addActionListener(listenerForButton);
		square3.addActionListener(listenerForButton);
		square4.addActionListener(listenerForButton);
		square5.addActionListener(listenerForButton);
		square6.addActionListener(listenerForButton);
		square7.addActionListener(listenerForButton);
		square8.addActionListener(listenerForButton);
		square9.addActionListener(listenerForButton);
	}

	public Icon getCross() {
		return cross;
	}

	public Icon getNought() {
		return nought;
	}
	
}