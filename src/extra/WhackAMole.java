package extra;

import javax.swing.*;

public class WhackAMole {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
public static void main(String[] args) {
	WhackAMole w = new WhackAMole();
	w.start();
}
public void start() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	frame.setSize(200, 200);
}
public void drawButtons(int buttonNumber) {
	int x = 10;
	int y = 10;
	
}
public void createButton(int x, int y, String text) {
	JButton button = new JButton();
	button.setLocation(x, y);
	button.setText(text);
}
}
