package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
        System.out.println("Button clicked");
        
        JFrame frame = new JFrame();        
        frame.setVisible(true);
  
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
	
        button.addActionListener(this);
	
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		 int rand = new Random().nextInt(5);
		 if(rand==0) {
			 JOptionPane.showMessageDialog(null, "you will have lots of money");
		 }
		 if(rand==1) {
			 JOptionPane.showMessageDialog(null, "you will not have lots of money");
		 }
		 if(rand==2) {
		 JOptionPane.showMessageDialog(null, "You will have kids");
	}
		 if(rand==3) {
			 JOptionPane.showMessageDialog(null, "You will not have kids");
		}
		 if(rand==4) {
			 JOptionPane.showMessageDialog(null, " love is in your future");
		 }
	
	}
	
	
	
	
	
	
	
	
	
}
