package view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame {
	
	JPanel mainPanel;
	
	JButton square1 = new JButton();
	JButton square2 = new JButton();
	JButton square3 = new JButton();
	JButton square4 = new JButton();
	JButton square5 = new JButton();
	JButton square6 = new JButton();
	JButton square7 = new JButton();
	JButton square8 = new JButton();
	JButton square9 = new JButton();

	public MainView() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setName("Tres en raya");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3, 3));
		
		//BufferedImage buttonIcon;
		
		//buttonIcon = ImageIO.read(new File("res/cross.png"));
		
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
	
	public void addCalculationListener(ActionListener listenerForCalcButton) {
		
		square1.addActionListener(listenerForCalcButton);
	}
	
}