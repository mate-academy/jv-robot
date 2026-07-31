package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int coordinateX = robot.getX();
        int coordinateY = robot.getY();

        int variableCoordinateX = toX - coordinateX;
        int variableCoordinateY = toY - coordinateY;

        if (variableCoordinateX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (variableCoordinateX < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }

        while (coordinateX != toX) {
            robot.stepForward();
            if (coordinateX < toX) {
                coordinateX++;
            } else {
                coordinateX--;
            }
        }

        if (variableCoordinateY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else if (variableCoordinateY < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }

        while (coordinateY != toY) {
            robot.stepForward();
            if (coordinateY < toY) {
                coordinateY++;
            } else {
                coordinateY--;
            }
        }
    }
}
