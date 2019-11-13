package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot rob = new Robot();

	public static void main(String[] args) {

		rob.penDown();
		rob.setX(45);
		rob.setY(400);
		rob.setSpeed(10);
		String height = "medium";

		for (int i = 1; i < 11; i++) {

			int r = new Random().nextInt(3);
			if (r == 0) {
				height = "small";
			}
			if (r == 1) {
				height = "medium";
			}
			if (r == 2) {
				height = "large";
			}

			DrawBuilding(height);
		}
	}

	static void DrawBuilding(String height) {

		int h = 60;
		if (height.equals("small")) {
			h = 60;
		}
		if (height.equals("medium")) {
			h = 120;
		}
		if (height.equals("large")) {
			h = 200;
		}
		rob.move(h);
		rob.turn(90);
		rob.move(40);
		rob.turn(90);
		rob.move(h);
		rob.turn(270);
		rob.setPenColor(0, 200, 0);
		rob.move(15);
		rob.turn(270);
		rob.setPenColor(0, 0, 0);

	}

}
