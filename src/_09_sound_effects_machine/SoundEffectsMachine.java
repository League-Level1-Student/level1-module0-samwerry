package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {

	static JButton button1 = new JButton();
	static JButton button2 = new JButton();

	public static void main(String[] args) {

		SoundEffectsMachine effect = new SoundEffectsMachine();

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		panel.add(button1);

		panel.add(button2);

		frame.add(panel);
		frame.pack();
		effect.Actionlistener();

	}

	void Actionlistener() {
		button1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonclicked = (JButton) e.getSource();
		if (buttonclicked == button1) {
			playSound("trash.wav");

		}
		if (buttonclicked == button2) {
			playSound("AlsoTrash.wav");
		}

	}

	private void playSound(String fileName) {

		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));

		sound.play();

	}

}
