package extra;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.*;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton mole = new JButton();
	static Random rand = new Random();
	Date time = new Date();
	static int score;
	static int missed;
WhackAMole(int score, int missed){
	this.score=score;
	this.missed=missed;
}
public static void main(String[] args) {
	WhackAMole w = new WhackAMole(score,missed);
	w.drawButtons(rand.nextInt(24));
}
public void drawButtons(int buttonNumber) {
	frame.add(panel);
	int x = 10;
	int y = 10;
	int count = 0;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 8; j++) {
			if(count==buttonNumber) {
			createButton(x,y,"mole!");
			}else {
			createButton(x,y,"");
			}
			y=y+30;
			count=count+1;
		}
		y=10;
		x=x+50;
	}
	frame.setPreferredSize(new Dimension(310,200));
	frame.setVisible(true);
	frame.pack();
	
	
}
public void createButton(int x, int y, String text) {
	if(text.equals("mole!")) {
	mole.setLocation(x, y);
	mole.setText(text);
	mole.setPreferredSize(new Dimension(90,15));
	mole.addActionListener(this);
	panel.add(mole);
	}else {
	JButton button = new JButton();
	button.setLocation(x, y);
	button.setText(text);
	button.setPreferredSize(new Dimension(90,15));
	button.addActionListener(this);
	panel.add(button);
	}
}
@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed==mole) {
		score++;
		playSound("sound.wav");
		System.out.println(score);
	}else {
		missed++;
		speak("You missed "+missed);
	}
	if(score==10) {
		endGame(time,10);
		speak("You won");
		System.exit(0);
	}
	if(missed==5) {
		speak("You lost");
		System.exit(0);
	}
	WhackAMole w = new WhackAMole(score,missed);
	w.drawButtons(rand.nextInt(24));
	frame.dispose();
}
void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + (molesWhacked/((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00))
         + " moles per second.");
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
}
