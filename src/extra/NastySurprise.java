package extra;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton trick = new JButton();
	JButton treat = new JButton();
	public static void main(String[] args) {
		NastySurprise n = new NastySurprise();
		n.setup();
	}
	public void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		trick.setPreferredSize(new Dimension(100,100));
		treat.setPreferredSize(new Dimension(100,100));
		trick.addActionListener(this);
		treat.addActionListener(this);
		trick.setText("trick");
		treat.setText("treat");
		panel.add(trick);
		panel.add(treat);
		frame.add(panel);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton button = (JButton) arg0.getSource();
		if(button==trick) {
			showPictureFromTheInternet("https://hgtvhome.sndimg.com/content/dam/images/hgtv/fullset/2018/3/22/0/shutterstock_national-puppy-day-224423782.jpg.rend.hgtvcom.966.725.suffix/1521744674350.jpeg");
			}else {
			showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBKL2mN34s9YiBMpJMRiahsxu3oddiS9Hzpjfa87qlIDyx3yVK");
			
		}
	}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	         JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.setPreferredSize(new Dimension(760,506));
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
}
