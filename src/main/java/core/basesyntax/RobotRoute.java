package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // 1 - change direction and movement along X
        // 1.1 - change direction
        if (toX < robot.getX()) { //turn robot until direction become left
            while (robot.getDirection() != Direction.LEFT) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnLeft();
                        break;
                    case DOWN:
                    case RIGHT:
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
            }
        } else if (toX > robot.getX()) { //turn robot until direction become right
            while (robot.getDirection() != Direction.RIGHT) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnRight();
                        break;
                    case DOWN:
                    case LEFT:
                        robot.turnLeft();
                        break;
                    default:
                        break;
                }
            }
        }
        // 1.2 - movement along X
        int countOfSteps = Math.abs(toX - robot.getX()); //count of steps to destination along X
        for (int step = 0; step < countOfSteps; step++) {
            robot.stepForward();
        }
        // 2 - change direction and movement along Y
        // 2.1 - change direction
        if (toY < robot.getY()) { //turn robot until direction become down
            while (robot.getDirection() != Direction.DOWN) {
                switch (robot.getDirection()) {
                    case LEFT:
                        robot.turnLeft();
                        break;
                    case UP:
                    case RIGHT:
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
            }
        } else if (toY > robot.getY()) { //turn robot until direction become up
            while (robot.getDirection() != Direction.UP) {
                switch (robot.getDirection()) {
                    case RIGHT:
                        robot.turnLeft();
                        break;
                    case DOWN:
                    case LEFT:
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
            }
        }
        // 2.2 - movement along Y
        countOfSteps = Math.abs(toY - robot.getY()); //count of steps to destination along Y
        for (int step = 0; step < countOfSteps; step++) {
            robot.stepForward();
        }
    }
}
