package extra;

import javax.swing.*;

public class Jeopardy {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
public static void main(String[] args) {
	Jeopardy j = new Jeopardy();
	j.setup();
}
public void setup() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	button1.setBounds(0, 0, 250, 100);
	button2.setBounds(0, 120, 250, 100);
	button3.setBounds(0, 240, 250, 100);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.pack();
}
}
