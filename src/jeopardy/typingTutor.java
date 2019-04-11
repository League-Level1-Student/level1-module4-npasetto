package jeopardy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.*;

public class typingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String currentLetter=generateRandomLetter();
public static void main(String[] args) {
	typingTutor t = new typingTutor();
	t.setup();
}
public String generateRandomLetter() {
	Random r = new Random();
	
	return ((char) (r.nextInt(26)+'a'))+"";
}
public void setup() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(label);
	label.setText(currentLetter);
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(this);
	frame.setSize(new Dimension(100,100));
	frame.pack();
}
@Override
public void keyPressed(KeyEvent arg0) {
	System.out.println("you typed:"+arg0.getKeyChar());
	
}
@Override
public void keyReleased(KeyEvent arg0) {
	if((arg0.getKeyChar()+"")==currentLetter){
		System.out.println("correct");
		panel.setBackground(new Color(255,0,0));
	}
	currentLetter=generateRandomLetter();
	label.setText(currentLetter);
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
