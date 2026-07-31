package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (toX > robot.getX()) {
            while (toX > robot.getX()) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        } else if (toX < robot.getX()) {
            while (toX < robot.getX()) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        }

        if (toY > robot.getY()) {
            while (toY > robot.getY()) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        } else if (toY < robot.getY()) {
            while (toY < robot.getY()) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        }

        if (toX == robot.getX() && toY == robot.getY()) {
            System.out.println("I'm home!");
        }
    }
}
