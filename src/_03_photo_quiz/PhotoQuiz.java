package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String skadoosh = "https://art.ngfiles.com/images/619000/619802_groanaplays_skadoosh.png?f1529469152";
		// 2. create a variable of type "Component" that will hold your image
Component image;
		// 3. use the "createImage()" method below to initialize your Component
image = createImage(skadoosh);
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String thanos = JOptionPane.showInputDialog("Will Po defeat thanos");
		// 7. print "CORRECT" if the user gave the right answer
if(thanos.equals("yes")) {
	System.out.println("CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	System.out.println("INCORRECT");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
String mtb = "https://i0.wp.com/www.bikemag.com/wp-content/uploads/2017/02/2017-Intense-Tracer-27.5-5488.jpg?resize=970%2C546&ssl=1";
Component pic;
pic = createImage(mtb);
		// 11. add the second image to the quiz window
quizWindow.add(pic);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String bike = JOptionPane.showInputDialog("Is this bike insane?");
		// 14+ check answer, say if correct or incorrect, etc.
if(bike.equals("yes")) {
	System.out.println("CORRECT ITS RAD");
}
else {
	System.out.println("YOUR WRONG ITS INSANE");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
