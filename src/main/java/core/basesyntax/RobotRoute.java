package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int robotX = robot.getX();
        int robotY = robot.getY();

        if (robotX != toX) {
            if (robotX > toX) {
                turnUntil(robot, Direction.LEFT);
            } else {
                turnUntil(robot, Direction.RIGHT);
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robotY != toY) {
            if (robotY > toY) {
                turnUntil(robot, Direction.DOWN);
            } else {
                turnUntil(robot, Direction.UP);
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    private void turnUntil(Robot robot, Direction direction) {
        Direction[] directions = Direction.values();

        int robotIndexDirection = 0;
        int givenIndexDirection = 0;

        for (int i = 0; i < directions.length; i++) {
            if (directions[i] == robot.getDirection()) {
                robotIndexDirection = i;
            }

            if (directions[i] == direction) {
                givenIndexDirection = i;
            }
        }

        if (givenIndexDirection > robotIndexDirection) {
            if (givenIndexDirection - robotIndexDirection > 2) {
                robot.turnLeft();
            } else {
                while (robot.getDirection() != direction) {
                    robot.turnRight();
                }
            }
        }

        if (givenIndexDirection < robotIndexDirection) {
            if (givenIndexDirection - robotIndexDirection < -2) {
                robot.turnRight();
            } else {
                while (robot.getDirection() != direction) {
                    robot.turnLeft();
                }
            }
        }
    }
}
