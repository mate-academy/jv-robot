package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int dx = toX - robot.getX();
        int dy = toY - robot.getY();

        while (dx != 0) {
            if (dx > 0) {
                // Turn right and move forward
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
                dx--;
            } else {
                // Turn left and move forward
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();
                dx++;
            }
        }

        while (dy != 0) {
            if (dy > 0) {
                // Turn up and move forward
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                robot.stepForward();
                dy--;
            } else {
                // Turn down and move forward
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                robot.stepForward();
                dy++;
            }
        }
    }
}
