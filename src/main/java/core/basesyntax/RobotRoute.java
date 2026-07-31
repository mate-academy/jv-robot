package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            switch (robot.getDirection()) {
                case UP: robot.turnLeft();
                    break;
                case DOWN: robot.turnRight();
                    break;
                case RIGHT: robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    break;
                default:
                    break;
            }
            if (robot.getDirection().equals(Direction.LEFT)) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }

        if (toX > robot.getX()) {
            switch (robot.getDirection()) {
                case UP: robot.turnRight();
                    break;
                case DOWN: robot.turnLeft();
                    break;
                case RIGHT:
                    break;
                case LEFT: robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            if (robot.getDirection().equals(Direction.RIGHT)) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }

        if (toY < robot.getY()) {
            switch (robot.getDirection()) {
                case UP: robot.turnLeft();
                    robot.turnLeft();
                    break;
                case DOWN:
                    break;
                case RIGHT: robot.turnRight();
                    break;
                case LEFT: robot.turnLeft();
                    break;
                default:
                    break;
            }
            if (robot.getDirection().equals(Direction.DOWN)) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }

        if (toY > robot.getY()) {
            switch (robot.getDirection()) {
                case UP:
                    break;
                case DOWN: robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT: robot.turnLeft();
                    break;
                case LEFT: robot.turnRight();
                    break;
                default:
                    break;
            }
            if (robot.getDirection().equals(Direction.UP)) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }
}
