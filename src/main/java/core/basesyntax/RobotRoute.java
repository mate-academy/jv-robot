package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toY < robot.getY() && toX < robot.getX()) {
            lowerXlowerY(robot, toX, toY);
        }
        if (toY > robot.getY() && toX > robot.getX()) {
            upperXandY(robot, toX, toY);
        }
        if (toY > robot.getY() && toX < robot.getX()) {
            lowerXupperY(robot, toX, toY);
        }
        if (toY < robot.getY() && toX > robot.getX()) {
            upperXlowerY(robot, toX, toY);
        }
        if (toY < robot.getY() && toX == robot.getX()) {
            lowerYequalsX(robot, toX, toY);
        }
        if (toY > robot.getY() && toX == robot.getX()) {
            upperYequalsX(robot, toX, toY);
        }
        if (toY == robot.getY() && toX < robot.getX()) {
            lowerXequalsY(robot, toX, toY);
        }
        if (toY == robot.getY() && toX > robot.getX()) {
            upperXequalsY(robot, toX, toY);
        }
        if (toY == robot.getY() && toX == robot.getX()) {
            robot.getDirection();
        }
    }

    public void lowerXlowerY(Robot robot, int toX, int toY) {
        for (int a = 0; !robot.getDirection().equals(Direction.LEFT); a++) {
            robot.turnLeft();
        }
        for (int b = 0; robot.getX() != toX; b++) {
            robot.stepForward();
        }
        for (int c = 0; !robot.getDirection().equals(Direction.DOWN); c++) {
            robot.turnLeft();
        }
        for (int d = 0; robot.getY() != toY; d++) {
            robot.stepForward();
        }

    }

    public void upperXlowerY(Robot robot, int toX, int toY) {
        for (int a = 0; !robot.getDirection().equals(Direction.RIGHT); a++) {
            robot.turnLeft();
        }
        for (int b = 0; robot.getX() != toX; b++) {
            robot.stepForward();
        }
        for (int c = 0; !robot.getDirection().equals(Direction.DOWN); c++) {
            robot.turnLeft();
        }
        for (int d = 0; robot.getY() != toY; d++) {
            robot.stepForward();
        }
    }

    public void upperXandY(Robot robot, int toX, int toY) {
        for (int a = 0; !robot.getDirection().equals(Direction.RIGHT); a++) {
            robot.turnLeft();
        }
        for (int b = 0; robot.getX() != toX; b++) {
            robot.stepForward();
        }
        for (int c = 0; !robot.getDirection().equals(Direction.UP); c++) {
            robot.turnLeft();
        }
        for (int d = 0; robot.getY() != toY; d++) {
            robot.stepForward();
        }
    }

    public void lowerXupperY(Robot robot, int toX, int toY) {
        for (int a = 0; !robot.getDirection().equals(Direction.LEFT); a++) {
            robot.turnLeft();
        }
        for (int b = 0; robot.getX() != toX; b++) {
            robot.stepForward();
        }
        for (int c = 0; !robot.getDirection().equals(Direction.UP); c++) {
            robot.turnLeft();
        }
        for (int d = 0; robot.getY() != toY; d++) {
            robot.stepForward();
        }
    }

    public void lowerYequalsX(Robot robot, int toX, int toY) {
        for (int c = 0; !robot.getDirection().equals(Direction.DOWN); c++) {
            robot.turnLeft();
        }
        for (int d = 0; robot.getY() != toY; d++) {
            robot.stepForward();
        }
    }

    public void upperYequalsX(Robot robot, int toX, int toY) {
        for (int c = 0; !robot.getDirection().equals(Direction.UP); c++) {
            robot.turnLeft();
        }
        for (int d = 0; robot.getY() != toY; d++) {
            robot.stepForward();
        }
    }

    public void lowerXequalsY(Robot robot, int toX, int toY) {
        for (int c = 0; !robot.getDirection().equals(Direction.LEFT); c++) {
            robot.turnLeft();
        }
        for (int d = 0; robot.getX() != toX; d++) {
            robot.stepForward();
        }
    }

    public void upperXequalsY(Robot robot, int toX, int toY) {
        for (int c = 0; !robot.getDirection().equals(Direction.RIGHT); c++) {
            robot.turnLeft();
        }
        for (int d = 0; robot.getX() != toX; d++) {
            robot.stepForward();
        }
    }
}
