package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveInX(robot, toX);

        moveInY(robot, toY);
    }

    private void moveInX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                faceDirection(robot, Direction.RIGHT);
            } else {
                faceDirection(robot, Direction.LEFT);
            }
            robot.stepForward(); 
        }
    }

    private void moveInY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                faceDirection(robot, Direction.UP);
            } else {
                faceDirection(robot, Direction.DOWN);
            }
            robot.stepForward();  
        }
    }

    private void faceDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight(); 
        }
    }
}
