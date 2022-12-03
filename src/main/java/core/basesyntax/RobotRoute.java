package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        if (toX > robot.getX()) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
            }
        } else if (toX < robot.getX()) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                case DOWN:
                    robot.turnRight();
                }
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }

        if(toY > robot.getY()) {
            switch (robot.getDirection()) {
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                case RIGHT:
                    robot.turnLeft();
                case LEFT:
                    robot.turnRight();
            }
        }else if (toY < robot.getY()) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                case LEFT:
                    robot.turnLeft();
                case RIGHT:
                    robot.turnRight();
            }
        }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
    }
}
