package core.basesyntax;

public class RobotRoute {
    /*
    We determine in which direction the coordinates of the house are relative
    to the current coordinates of the work using if (toX,Y < robot.getX()),
    then turn it in the desired direction using
    while (robot.getDirection()!= Direction.LEFT)
    if (root.getDirection() == Direction.UP
    || robot.getDirection() == Direction.RIGHT)
    and send it home using while (robot.getX() != toX)
    robot.step Forward();
     */
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection() == Direction.UP
                        || robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        } else if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                if (robot.getDirection() == Direction.UP
                        || robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        System.out.println("Робота по пришел по координатам Х");

        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                if (robot.getDirection() == Direction.UP
                        || robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        } else if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                if (robot.getDirection() == Direction.DOWN
                        || robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
