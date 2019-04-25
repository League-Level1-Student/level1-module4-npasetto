package extra;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import twitter4j.*;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField input = new JTextField(20);
JButton button = new JButton();
public static void main(String[] args) {
	GetLatestTweet t = new GetLatestTweet();
	t.setup();
}
public void setup() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	button.setPreferredSize(new Dimension(150,20));
	button.setText("Search twitter");
	button.addActionListener(this);
	frame.add(panel);
	panel.add(input);
	panel.add(button);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	System.out.println("Tweet Tweet");
	String answer = getLatestTweet(input.getText());
	System.out.println(answer);
}
private String getLatestTweet(String searchingFor) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(
          "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
          "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
          "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

    twitter.setOAuthAccessToken(accessToken);

    Query query = new Query(searchingFor);
    try {
          QueryResult result = twitter.search(query);
          return result.getTweets().get(0).getText();
    } catch (Exception e) {
         e.printStackTrace();
          return "What the heck is that?";
    }
}

}
