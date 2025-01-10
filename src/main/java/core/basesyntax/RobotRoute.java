package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int currentXCoordinate = robot.getX();
        int currentYCoordinate = robot.getY();
        while (currentXCoordinate != toX) {
            if (currentXCoordinate < toX) {
                faceDirection(robot, Direction.RIGHT);
                robot.stepForward();
                currentXCoordinate++;
            } else if (currentXCoordinate > toX) {
                faceDirection(robot, Direction.LEFT);
                robot.stepForward();
                currentXCoordinate--;
            }
        }

        while (currentYCoordinate != toY) {
            if (currentYCoordinate < toY) {
                faceDirection(robot, Direction.UP);
                robot.stepForward();
                currentYCoordinate++;
            } else if (currentYCoordinate > toY) {
                faceDirection(robot, Direction.DOWN);
                robot.stepForward();
                currentYCoordinate--;
            }
        }

    }

    private void faceDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
