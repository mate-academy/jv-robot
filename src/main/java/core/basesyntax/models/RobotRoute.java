package fch.models;

import static fch.models.Direction.UP;
import static fch.models.Direction.DOWN;
import static fch.models.Direction.LEFT;
import static fch.models.Direction.RIGHT;

public class RobotRoute {

    public RobotRoute() {

    }

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() < toY) {
            while (robot.getDirection() != UP) {
                robot.turnRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != DOWN) {
                robot.turnLeft();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

    }
}
