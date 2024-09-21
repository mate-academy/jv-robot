package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        while(robot.getY() != toY || robot.getX() != toX) {
            switch (robot.getDirection()) {
                case UP:
                    if (toY > 0 || toY > robot.getY()) {
                        while (toY > robot.getY()) {
                            robot.stepForward();
                        }
                    }
                    robot.turnRight();
                case RIGHT:
                    if (toX > 0 || toX > robot.getX()) {
                        while (toX > robot.getX()) {
                            robot.stepForward();
                        }
                    }
                    robot.turnRight();
                case DOWN:
                    if (toY < 0 || toY < robot.getY()) {
                        while (toY < robot.getY()) {
                            robot.stepForward();
                        }
                    }
                    robot.turnRight();
                case LEFT:
                    if (toX < 0 || toX < robot.getX()) {
                        while (toX < robot.getX()) {
                            robot.stepForward();
                        }
                    }
                    robot.turnRight();
            }
        }
    }
}
