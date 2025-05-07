package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toY > robot.getY() && toX == robot.getX()) {
            switch (robot.getDirection()) {
                case UP -> goStraightY(robot, toY, robot.getY());
                case RIGHT -> leftSideColumn(robot, toY);
                case DOWN -> {
                    turnAround(robot);
                    goStraightY(robot, toY, robot.getY());
                }
                default -> rightSideColumn(robot, toY);
            }
        } else if (toY > robot.getY() && toX > robot.getX()) {
            switch (robot.getDirection()) {
                case UP -> {
                    goStraightY(robot, toY, robot.getY());
                    rightSideRow(robot, toX);
                }
                case RIGHT -> {
                    goStraightX(robot, toX, robot.getX());
                    leftSideColumn(robot, toY);
                }
                case DOWN -> {
                    leftSideRow(robot, toX);
                    leftSideColumn(robot, toY);
                }
                default -> {
                    rightSideColumn(robot, toY);
                    rightSideRow(robot, toX);
                }
            }
        } else if (toY > robot.getY() && toX < robot.getX()) {
            switch (robot.getDirection()) {
                case UP -> {
                    goStraightY(robot, toY, robot.getY());
                    leftSideRow(robot, toX);
                }
                case RIGHT -> {
                    leftSideColumn(robot, toY);
                    rightSideRow(robot, toX);
                }
                case DOWN -> {
                    rightSideRow(robot, toX);
                    rightSideColumn(robot, toY);
                }
                default -> {
                    goStraightX(robot, toX, robot.getX());
                    rightSideColumn(robot, toY);
                }
            }
        } else if (toY == robot.getY() && toX > robot.getX()) {
            switch (robot.getDirection()) {
                case UP -> rightSideRow(robot, toX);
                case RIGHT -> goStraightX(robot, toX, robot.getX());
                case DOWN -> leftSideRow(robot, toX);
                default -> {
                    turnAround(robot);
                    goStraightX(robot, toX, robot.getX());
                }
            }
        } else if (toY == robot.getY() && toX < robot.getX()) {
            switch (robot.getDirection()) {
                case UP -> leftSideRow(robot, toX);
                case RIGHT -> {
                    turnAround(robot);
                    goStraightX(robot, toX, robot.getX());
                }
                case DOWN -> rightSideRow(robot, toX);
                default -> goStraightX(robot, toX, robot.getX());
            }
        } else if (toY < robot.getY() && toX == robot.getX()) {
            switch (robot.getDirection()) {
                case UP -> {
                    turnAround(robot);
                    goStraightY(robot, toY, robot.getY());
                }
                case RIGHT -> rightSideColumn(robot, toY);
                case DOWN -> goStraightY(robot, toY, robot.getY());
                default -> leftSideColumn(robot, toY);
            }
        } else if (toY < robot.getY() && toX > robot.getX()) {
            switch (robot.getDirection()) {
                case UP -> {
                    rightSideRow(robot, toX);
                    rightSideColumn(robot, toY);
                }
                case RIGHT -> {
                    goStraightX(robot, toX, robot.getX());
                    rightSideColumn(robot, toY);
                }
                case DOWN -> {
                    goStraightY(robot, toY, robot.getY());
                    leftSideRow(robot, toX);
                }
                default -> {
                    leftSideColumn(robot, toY);
                    leftSideRow(robot, toX);
                }
            }
        } else {
            switch (robot.getDirection()) {
                case UP -> {
                    leftSideRow(robot, toX);
                    leftSideColumn(robot, toY);
                }
                case RIGHT -> {
                    rightSideColumn(robot, toY);
                    rightSideRow(robot, toX);
                }
                case DOWN -> {
                    goStraightY(robot, toY, robot.getY());
                    rightSideRow(robot, toX);
                }
                default -> {
                    goStraightX(robot, toX, robot.getX());
                    leftSideColumn(robot, toY);
                }
            }
        }
    }

    private void turnAround(Robot robot) {
        robot.turnRight();
        robot.turnRight();
    }

    private void goStraightX(Robot robot, int target, int current) {
        while (target != current) {
            robot.stepForward();
            current = robot.getX();
        }
    }

    private void goStraightY(Robot robot, int target, int current) {
        while (target != current) {
            robot.stepForward();
            current = robot.getY();
        }
    }

    private void rightSideRow(Robot robot, int target) {
        robot.turnRight();
        goStraightX(robot, target, robot.getX());
    }

    private void leftSideRow(Robot robot, int target) {
        robot.turnLeft();
        goStraightX(robot, target, robot.getX());
    }

    private void rightSideColumn(Robot robot, int target) {
        robot.turnRight();
        goStraightY(robot, target, robot.getY());
    }

    private void leftSideColumn(Robot robot, int target) {
        robot.turnLeft();
        goStraightY(robot, target, robot.getY());
    }

}
