package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {

	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	static JButton button3 = new JButton();

	public static void main(String[] args) {
		CutenessTV cute = new CutenessTV();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setVisible(true);
		panel.add(button3);
		panel.add(button2);
		panel.add(button1);
		frame.add(panel);
		frame.pack();

		cute.VideoThing();

	}

	void VideoThing() {

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonclicked = (JButton) e.getSource();
		if (buttonclicked == button1) {
			System.out.println("button1 clicked");
			showDucks();
		} else if (buttonclicked == button2) {
			System.out.println("button2 clicked");
			showFrog();

		} else if (buttonclicked == button3) {
		System.out.println("button3clicked");
			showFluffyUnicorns();
		}

	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
