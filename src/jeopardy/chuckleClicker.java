package jeopardy;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class chuckleClicker implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton joke = new JButton();
JButton punchline = new JButton();
public static void main(String[] args) {
	chuckleClicker c = new chuckleClicker();
	c.setupButtons();
}
void setupButtons(){
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	joke.setPreferredSize(new Dimension(100,100));
	punchline.setPreferredSize(new Dimension(100,100));
	joke.setText("joke");
	punchline.setText("punchline");
	joke.addActionListener(this);
	punchline.addActionListener(this);
	panel.add(joke);
	panel.add(punchline);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	JOptionPane.showMessageDialog(null, "hi");
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed==joke) {
		JOptionPane.showMessageDialog(null, "What is the square root of a carrot?");
	}else {
		JOptionPane.showMessageDialog(null, "Carrots have circular roots not square ones!");
	}
}
}
