package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView {

	public MainView() {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		JFrame mainFrame = new JFrame("Tres en raya");
		
		JPanel mainPanel = new JPanel();
		
		mainPanel.setLayout(new GridLayout(3, 3));
		
		BufferedImage buttonIcon;
		
		try {
			
			buttonIcon = ImageIO.read(new File("res/cross.png"));
			JButton square1 = new JButton(new ImageIcon(buttonIcon));
			JButton square2 = new JButton("CASILLA");
			JButton square3 = new JButton("CASILLA");
			JButton square4 = new JButton("CASILLA");
			JButton square5 = new JButton("CASILLA");
			JButton square6 = new JButton("CASILLA");
			JButton square7 = new JButton("CASILLA");
			JButton square8 = new JButton("CASILLA");
			JButton square9 = new JButton("CASILLA");
			
			mainPanel.add(square1);
			mainPanel.add(square2);
			mainPanel.add(square3);
			mainPanel.add(square4);
			mainPanel.add(square5);
			mainPanel.add(square6);
			mainPanel.add(square7);
			mainPanel.add(square8);
			mainPanel.add(square9);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		mainFrame.add(mainPanel);
		mainFrame.setSize(500, 500);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
	
}