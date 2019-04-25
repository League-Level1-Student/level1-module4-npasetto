package extra;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PigLatin implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField input = new JTextField(20);
	JTextField output = new JTextField(20);
	JButton translator = new JButton();
public static void main(String[] args) {
	PigLatin p = new PigLatin();
	p.setup();
}
public void setup() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	output.setEditable(false);
	translator.setPreferredSize(new Dimension(100,15));
	translator.setText("translate");
	translator.addActionListener(this);
	panel.add(input);
	panel.add(translator);
	panel.add(output);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	String input = this.input.getText();
	PigLatinTranslator t = new PigLatinTranslator();
	String output = t.translate(input);
	this.output.setText(output);
	frame.pack();
}
}


