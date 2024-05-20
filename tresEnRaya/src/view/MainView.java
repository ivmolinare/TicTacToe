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
	
	private final int NUM_SQUARES = 9;
	
	JPanel mainPanel;
	
	SquareViewComponent[] squares = new SquareViewComponent[NUM_SQUARES];
	
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
		
		this.setIconImage(new ImageIcon("res/appIcon.png").getImage());
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3, 3));
		
		try {
			biCross = ImageIO.read(getClass().getClassLoader().getResource("cross.png"));
			biNought = ImageIO.read(getClass().getClassLoader().getResource("nought.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < NUM_SQUARES; i++) 
			squares[i] = new SquareViewComponent();
		
		Image imgCross = biCross.getScaledInstance(
				squares[0].getPREFERED_INITIAL_WIDTH()/2,
				squares[0].getPREFERED_INITIAL_HEIGHT()/2, 
				Image.SCALE_SMOOTH);
		
		Image imgNought = biNought.getScaledInstance(
				squares[0].getPREFERED_INITIAL_WIDTH()/2, 
				squares[0].getPREFERED_INITIAL_HEIGHT()/2, 
				Image.SCALE_SMOOTH);
		
		cross = new ImageIcon(imgCross);
		nought = new ImageIcon(imgNought);
		
		for(int i = 0; i < NUM_SQUARES; i++)
			mainPanel.add(squares[i]);
		
		this.add(mainPanel);
	}
	
	public void addButtonListener(ActionListener listenerForButton) {
		
		for(int i = 0; i < NUM_SQUARES; i++)
			squares[i].addActionListener(listenerForButton);
	}

	public Icon getCross() {
		return cross;
	}

	public Icon getNought() {
		return nought;
	}

	public SquareViewComponent[] getSquares() {
		return squares;
	}
	
}