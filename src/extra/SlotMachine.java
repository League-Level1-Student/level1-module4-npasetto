package extra;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.*;

public class SlotMachine implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton spin = new JButton();
JLabel label1;
JLabel label2;
JLabel label3;
String name1;
String name2;
String name3;

public static void main(String[] args) {
	SlotMachine s = new SlotMachine();
	s.run();
}
public void run() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	name1=randomPicture();
	name2=randomPicture();
	name3=randomPicture();
	label1=generateLabel(name1);
	label2=generateLabel(name2);
	label3=generateLabel(name3);
	spin.setPreferredSize(new Dimension(100,100));
	spin.setText("SPIN!");
	spin.addActionListener(this);
	panel.add(spin);
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	frame.pack();
}
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
public String randomPicture() {
	int rand = new Random().nextInt(3);
	if(rand==0) {
	return "cherry.png";
	}else if (rand==1) {
	return "orange.jpeg";
	}else {
	return "lime.jpeg";
	}
}
public JLabel generateLabel(String name) {
	try {
		return createLabelImage(name);
	} catch (MalformedURLException e) {
		e.printStackTrace();
		return new JLabel();
	}
}
@Override
public void actionPerformed(ActionEvent arg0) {
	panel.remove(label1);
	panel.remove(label2);
	panel.remove(label3);
	name1=randomPicture();
	name2=randomPicture();
	name3=randomPicture();
	label1=generateLabel(name1);
	label2=generateLabel(name2);
	label3=generateLabel(name3);
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	frame.pack();
	if(name1.equals(name2) && name2.equals(name3)) {
		JOptionPane.showMessageDialog(null, "You win!");
	}
}
}
