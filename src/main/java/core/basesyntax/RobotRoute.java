package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //Correcting the direction of movement of the robot
        Direction direction = correctDirectionX(robot.getDirection(), robot.getX(), toX);
        //Changing the direction of the robot
        changeDirection(robot, direction);
        //Move
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        //Correcting the direction of movement of the robot
        direction = correctDirectionY(robot.getDirection(), robot.getY(), toY);
        //Changing the direction of the robot
        changeDirection(robot, direction);
        //Move
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private Direction correctDirectionX(Direction direction, int startPoint, int toPoint) {
        if (startPoint == toPoint) {
            return direction;
        } else if (startPoint > toPoint) {
            return Direction.LEFT;
        } else {
            return Direction.RIGHT;
        }
    }

    private Direction correctDirectionY(Direction direction, int startPoint, int toPoint) {
        if (startPoint == toPoint) {
            return direction;
        } else if (startPoint > toPoint) {
            return Direction.DOWN;
        } else {
            return Direction.UP;
        }
    }

    private void changeDirection(Robot robot, Direction direction) {
        for (int i = 0; i < 4; i++) {
            if (robot.getDirection() == direction) {
                break;
            } else {
                robot.turnRight();
            }
        }
    }
}
