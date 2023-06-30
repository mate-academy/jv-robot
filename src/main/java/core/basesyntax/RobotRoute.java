package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() - toX > 0) {
                this.moveLeft(robot);
            } else {
                this.moveRight(robot);
            }
        }
        while (robot.getY() != toY) {
            if (robot.getY() - toY > 0) {
                this.moveDown(robot);
            } else {
                this.moveUp(robot);
            }
        }
    }

    private void moveLeft(Robot robot) {
        if (robot.getDirection() == Direction.LEFT) {
            robot.stepForward();
        } else {
            this.rotateToLeftDirection(robot);
        }
    }

    private void moveRight(Robot robot) {
        if (robot.getDirection() == Direction.RIGHT) {
            robot.stepForward();
        } else {
            this.rotateToRightDirection(robot);
        }
    }

    private void moveDown(Robot robot) {
        if (robot.getDirection() == Direction.DOWN) {
            robot.stepForward();
        } else {
            this.rotateToDownDirection(robot);
        }
    }

    private void moveUp(Robot robot) {
        if (robot.getDirection() == Direction.UP) {
            robot.stepForward();
        } else {
            this.rotateToUpDirection(robot);
        }
    }

    private void rotateToLeftDirection(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnRight();
                break;
            default:
                robot.turnLeft();
                robot.turnLeft();
        }
    }

    private void rotateToRightDirection(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            default:
                robot.turnRight();
                robot.turnRight();
        }
    }

    private void rotateToDownDirection(Robot robot) {
        switch (robot.getDirection()) {
            case RIGHT:
                robot.turnRight();
                break;
            case LEFT:
                robot.turnLeft();
                break;
            default:
                robot.turnRight();
                robot.turnRight();
        }
    }

    private void rotateToUpDirection(Robot robot) {
        switch (robot.getDirection()) {
            case LEFT:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            default:
                robot.turnRight();
                robot.turnRight();
        }
    }
}
