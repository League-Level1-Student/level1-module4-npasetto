package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField first = new JTextField(20);
	JTextField second = new JTextField(20);
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
		sub.setText("sub");
		mul.setText("mul");
		div.setText("div");
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(first);
		panel.add(second);
		panel.add(answer);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		String calculation;
		if(buttonPressed==add) {
		answer.setText(add(Integer.parseInt(first.getText()),Integer.parseInt(second.getText()))+"");
		}
		if(buttonPressed==sub) {
		answer.setText(sub(Integer.parseInt(first.getText()),Integer.parseInt(second.getText()))+"");
		}
		if(buttonPressed==mul) {
		answer.setText(mul(Integer.parseInt(first.getText()),Integer.parseInt(second.getText()))+"");
		}
		if(buttonPressed==div) {
		answer.setText(div(Integer.parseInt(first.getText()),Integer.parseInt(second.getText()))+"");
		}
		frame.pack();
	}
	double add(double a, double b) {
		return a+b;
	}
	double sub(double a, double b) {
		return a-b;
	}
	double mul(double a, double b) {
		return a*b;
	}
	double div(double a, double b) {
		return a/b;
	}
}
