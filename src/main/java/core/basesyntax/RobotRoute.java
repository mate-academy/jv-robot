package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        String directionToMoveByY = getDirectionOnY(currentY, toY);
        String directionToMoveByX = getDirectionOnX(currentX, toX);

        System.out.println("Move by X -> " + directionToMoveByX);
        System.out.println("Move by Y -> " + directionToMoveByY);

        int distanceX = getDistanceOnAxis(currentX, toX);
        int distanceY = getDistanceOnAxis(currentY, toY);

        System.out.println("Distance by X -> " + distanceX);
        System.out.println("Distance by Y -> " + distanceY);

        rotateToMatchDirection(robot, directionToMoveByX);
        moveInCurrentDirection(robot, distanceX);

        rotateToMatchDirection(robot, directionToMoveByY);
        moveInCurrentDirection(robot, distanceY);
    }

    private void moveInCurrentDirection(Robot robot, int numberOfStepsToMove) {
        for (int i = 0; i < numberOfStepsToMove; i++) {
            robot.stepForward();
        }
    }

    private void rotateToMatchDirection(Robot robot, String direction) {
        for (int i = 0; i < 3; i++) {
            if (robot.getDirection().name().equals(direction)) {
                break;
            }
            robot.turnLeft();
        }
    }

    private String getDirectionOnX(int currentX, int toX) {
        if (currentX > toX) {
            return Direction.LEFT.name();
        } else if (currentX == toX) {
            return "";
        } else {
            return Direction.RIGHT.name();
        }
    }

    private String getDirectionOnY(int currentY, int toY) {
        if (currentY > toY) {
            return Direction.DOWN.name();
        } else if (currentY == toY) {
            return "";
        } else {
            return Direction.UP.name();
        }
    }

    private int getDistanceOnAxis(int currentPoint, int toPoint) {
        if (currentPoint == toPoint) {
            return 0;
        } else if ((currentPoint > 0 && toPoint > 0) || (currentPoint < 0 && toPoint < 0)) {
            return Math.abs(currentPoint - toPoint);
        } else {
            return Math.abs(currentPoint) + Math.abs(toPoint);
        }
    }
}
