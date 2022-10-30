package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        int distanceX = robot.getX() - toX;
        System.out.println("distance x = " + distanceX);
        int distanceY = robot.getY() - toY;
        System.out.println("distance y = " + distanceY);
        if (distanceX != 0) {
            turnToX(distanceX, robot);
            getToX(distanceX, robot);
        }
        if (distanceY != 0) {
            turnToY(distanceY, robot);
            getToY(distanceY, robot);
        }

    }

    public void turnToX(int distanceX, Robot robot) {
        Direction dirX;
        if (distanceX > 0) {
            dirX = Direction.LEFT;

            switch (robot.getDirection()) {
                case LEFT:
                    System.out.println("Robot looking left and it`s good!");
                    break;
                case UP:
                    robot.turnLeft();
                    System.out.println("Turn left");
                    break;
                case DOWN:
                    robot.turnRight();
                    System.out.println("Turn right");
                    break;
                case RIGHT:
                    robot.turnRight();
                    System.out.println("Turn right");
                    robot.turnRight();
                    System.out.println("Turn right");
                    break;
                default: break;
            }
        } else if (distanceX < 0) {
            dirX = Direction.RIGHT;

            switch (robot.getDirection()) {
                case RIGHT:
                    System.out.println("Robot looking right and it`s good!");
                    break;
                case UP: robot.turnRight();
                    System.out.println("Turn right");
                    break;
                case DOWN:
                    robot.turnLeft();
                    System.out.println("Turn left");
                    break;
                case LEFT:
                    robot.turnRight();
                    System.out.println("Turn right");
                    robot.turnRight();
                    System.out.println("Turn right");
                    break;
                default: break;
            }

        }
    }

    public void turnToY(int distanceY, Robot robot) {
        Direction dirY;
        if (distanceY > 0) {
            dirY = Direction.DOWN;
            switch (robot.getDirection()) {
                case DOWN:
                    System.out.println("Robot looking down and it`s good!");
                    break;
                case RIGHT: robot.turnRight();
                    System.out.println("Turn left");
                    break;
                case LEFT:
                    robot.turnLeft();
                    System.out.println("Turn right");
                    break;
                case UP:
                    robot.turnRight();
                    System.out.println("Turn right");
                    robot.turnRight();
                    System.out.println("Turn right");
                    break;
                default: break;
            }
        } else if (distanceY < 0) {
            dirY = Direction.UP;
            switch (robot.getDirection()) {
                case UP:
                    System.out.println("Robot looking up and it`s good!");
                    break;
                case LEFT: robot.turnRight();
                    System.out.println("Turn right");
                    break;
                case RIGHT:
                    robot.turnLeft();
                    System.out.println("Turn left");
                    break;
                case DOWN:
                    robot.turnRight();
                    System.out.println("Turn right");
                    robot.turnRight();
                    System.out.println("Turn right");
                    break;
                default: break;
            }

        }
    }

    public void getToX(int distanceX, Robot robot) {
        if (distanceX < 0) {
            distanceX = distanceX * -1;
        }
        while (distanceX > 0) {
            robot.stepForward();
            distanceX--;
            System.out.println("X = " + robot.getX());
        }

    }

    public void getToY(int distanceY, Robot robot) {
        if (distanceY < 0) {
            distanceY = distanceY * -1;
        }
        while (distanceY > 0) {
            robot.stepForward();
            distanceY--;
            System.out.println("Y = " + robot.getY());
        }

    }
}

