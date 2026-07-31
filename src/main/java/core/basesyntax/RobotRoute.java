package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        String horizontalDirection = determineHorizontalDirection(robot, toX);
        String verticalDirection = determineVerticalDirection(robot, toY);

        if (!horizontalDirection.equals("No movement required")) {
            moveHorizontaly(robot, horizontalDirection, toX);
        }

        if (!verticalDirection.equals("No movement required")) {
            moveVerticaly(robot, verticalDirection, toY);
        }
    }

    private String determineHorizontalDirection(Robot robot, int toX) {
        if (robot.getX() == toX) {
            return "No movement required";
        }
        return robot.getX() > toX ? "LEFT" : "RIGHT";
    }

    private String determineVerticalDirection(Robot robot, int toY) {
        if (robot.getY() == toY) {
            return "No movement required";
        }
        return robot.getY() > toY ? "DOWN" : "UP";
    }

    private void moveHorizontaly(Robot robot, String direction, int toX) {
        while (!direction.equals(robot.getDirection().toString())) {
            turnOptiamally(robot,direction);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveVerticaly(Robot robot, String direction, int toY) {
        while (!direction.equals(robot.getDirection().toString())) {
            turnOptiamally(robot,direction);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnOptiamally(Robot robot, String direction) {
        Direction currentDir = robot.getDirection();
        switch (direction) {
            case "UP" -> {
                if (currentDir == Direction.RIGHT || robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            }
            case "RIGHT" -> {
                if ((currentDir == Direction.DOWN || robot.getDirection() == Direction.LEFT)) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            }
            case "DOWN" -> {
                if ((currentDir == Direction.LEFT || robot.getDirection() == Direction.UP)) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            }
            case "LEFT" -> {
                if ((currentDir == Direction.UP || robot.getDirection() == Direction.RIGHT)) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            }
            default -> {
                break;
            }
        }
    }
}
