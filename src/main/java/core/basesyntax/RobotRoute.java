package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        int startY = robot.getY();

        if (startX < toX) { // move to RIGHT
            moveToRight(robot, toX - startX);
        } else if (startX > toY) { // move to LEFT
            moveToLeft(robot, startX - toX);
        }

        if (startY < toY) { // move UP
            moveUp(robot, toY - startY);
        } else if (startY > toY) { // move Down
            moveDown(robot, startY - toY);
        }
    }

    private void moveDown(Robot robot, int i) {
        setDown(robot);
        move(robot, i);
    }

    private void moveUp(Robot robot, int i) {
        setUp(robot);
        move(robot, i);
    }

    private void moveToLeft(Robot robot, int i) {
        setLeft(robot);
        move(robot, i);
    }

    private void moveToRight(Robot robot, int i) {
        setRight(robot);
        move(robot, i);
    }

    private static void move(Robot robot, int steps) {
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }

    private void setDown(Robot robot) {
        if (robot.getDirection() == Direction.DOWN) {
            return;
        }
        setRight(robot);
        robot.turnRight();
    }

    private void setUp(Robot robot) {
        if (robot.getDirection() == Direction.UP) {
            return;
        }
        setRight(robot);
        robot.turnLeft();
    }

    private void setLeft(Robot robot) {
        if (robot.getDirection() == Direction.LEFT) {
            return;
        }
        setRight(robot);
        turnAround(robot);
    }

    private void setRight(Robot robot) {
        switch (robot.getDirection()) {
            case RIGHT:
                return;
            case UP:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            case LEFT:
                turnAround(robot);
        }

    }

    private static void turnAround(Robot robot) {
        robot.turnRight();
        robot.turnRight();
    }
}
