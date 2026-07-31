package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int robotXCoordinate = robot.getX();
        int robotYCoordinate = robot.getY();
        Direction robotDirection = robot.getDirection();

        //first part
        if (robotXCoordinate > toX) {
            while (robotDirection != Direction.LEFT) {
                robot.turnLeft();
                robotDirection = robot.getDirection();
            }
        } else if (robotXCoordinate < toX) {
            while (robotDirection != Direction.RIGHT) {
                robot.turnRight();
                robotDirection = robot.getDirection();
            }
        }

        while (robotXCoordinate != toX) {
            robot.stepForward();
            robotXCoordinate = robot.getX();
        }

        // Second, move to the target Y-coordinate
        if (robotYCoordinate > toY) {
            while (robotDirection != Direction.DOWN) {
                robot.turnLeft();
                robotDirection = robot.getDirection();
            }
        } else if (robotYCoordinate < toY) {
            while (robotDirection != Direction.UP) {
                robot.turnRight();
                robotDirection = robot.getDirection();
            }
        }

        while (robotYCoordinate != toY) {
            robot.stepForward();
            robotYCoordinate = robot.getY();
        }

    }
}
