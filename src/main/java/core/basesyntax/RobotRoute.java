package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            moveHorizontally(robot, toX);
        }
        if (robot.getY() != toY) {
            moveVertically(robot, toY);
        }
    }

    private void moveHorizontally(Robot robot, int toX) {

        Direction correctHorizontal;

        if (toX > robot.getX()) {
            correctHorizontal = Direction.RIGHT;
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;
            }
        } else {
            correctHorizontal = Direction.LEFT;
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;
            }
        }

        int counter = Math.abs(toX - robot.getX());
        for (int i = counter; i > 0; i--) {
            robot.stepForward();
        }
    }

    private void moveVertically(Robot robot, int toY) {

    }
}
