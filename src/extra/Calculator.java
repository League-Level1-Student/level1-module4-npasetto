package extra;

import javax.swing.*;

public class Calculator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField first = new JTextField(50);
	JTextField second = new JTextField(50);
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JLabel answer=new JLabel();
	public void run() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		add.setText("add");
		sub.setText("add");
		mul.setText("add");
		div.setText("add");
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(first);
		panel.add(second);
		panel.add(answer);
		frame.pack();
	}

}
