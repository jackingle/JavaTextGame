package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class Game {

	JFrame window;
	Container con;
	JPanel title, startButtonPanel;
	JLabel titleName;
	JButton startButton;
	
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 24);
	
	Border emptyBorder = BorderFactory.createBevelBorder(1, Color.gray, new Color(45, 45, 45));
	Border raised = BorderFactory.createEtchedBorder(Color.white, Color.darkGray);
	Border noBorder = new LineBorder(Color.WHITE, 0);
	
	public static void main(String[] args) {
		
		new Game();
		
	}
	//Constructor
	public Game() {
		
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		title = new JPanel();
		title.setBounds(100, 100, 600, 150);
		title.setBackground(Color.blue);
		titleName = new JLabel("ADVENTURE");
		titleName.setForeground(Color.white);
		titleName.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 50);
		startButtonPanel.setBackground(Color.black);
		
		
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.setBorderPainted(true);
		startButton.setBorder(emptyBorder);
		
	
				
		
		title.add(titleName);
		startButtonPanel.add(startButton);
		
		con.add(title);
		con.add(startButtonPanel);
		
	}
}

