package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toY > robot.getY()) {
            goUp(robot);
            while (toY != robot.getY()) {
                robot.stepForward();
            }
            if (toX > robot.getX()) {
                goRight(robot);
                while (toX != robot.getX()) {
                    robot.stepForward();
                }
            } else if (toX < robot.getX()) {
                goLeft(robot);
                while (toX != robot.getX()) {
                    robot.stepForward();
                }
            } else {
                System.out.println("robot arrived");
            }
        } else if (toY < robot.getY()) {
            goDown(robot);
            while (toY != robot.getY()) {
                robot.stepForward();
            }
            if (toX > robot.getX()) {
                goRight(robot);
                while (toX != robot.getX()) {
                    robot.stepForward();
                }
            } else if (toX < robot.getX()) {
                goLeft(robot);
                while (toX != robot.getX()) {
                    robot.stepForward();
                }
            } else {
                System.out.println("robot arrived");
            }
        } else {
            if (toX > robot.getX()) {
                goRight(robot);
                while (toX != robot.getX()) {
                    robot.stepForward();
                }
            } else if (toX < robot.getX()) {
                goLeft(robot);
                while (toX != robot.getX()) {
                    robot.stepForward();
                }
            } else {
                System.out.println("robot arrived");
            }
        }
    }


    private void goUp(Robot robot) {
        while (robot.getDirection() != Direction.UP) {
            robot.turnLeft();
        }
    }

    private void goDown(Robot robot) {
        while (robot.getDirection() != Direction.DOWN) {
            robot.turnLeft();
        }
    }

    private void goLeft(Robot robot) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
    }

    private void goRight(Robot robot) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnLeft();
        }
    }
}
