package ui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mainFrame extends JFrame {

	private JTextField screen = null;
	
	public mainFrame() {
		init();
	}
	
	public void init() {
		initScreen();	
		initButtons();
		
		this.setSize(300, 400);
		this.setVisible(true);
	}
	
	private void initScreen() {
		screen = new JTextField(100);
		screen.setText("display");
		
		this.add(screen);
		this.setLayout(new FlowLayout());
	}
	
	private void initButtons() {
		
		JPanel buttons = new JPanel();
		JButton button = null;
		GridLayout experimentLayout = new GridLayout(0,4);
		
		for (int i = 0; i < 10; i++) {
			button = new JButton("" + (9 - i));
			buttons.add(button);
		}
		
		buttons.setLayout(experimentLayout);
		this.add(buttons);
		
		JPanel operators = new JPanel();
		operators.setLayout(new GridLayout(0,1));
		JButton addition = new JButton("+");
		JButton multiplication = new JButton("*");
		JButton soustraction = new JButton("-");
		JButton division = new JButton("/");
		JButton egale = new JButton("=");
		
		operators.add(addition);
		operators.add(multiplication);
		operators.add(soustraction);
		operators.add(division);
		operators.add(egale);
		
		this.add(operators);
	}
}
